import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class WordFrequency {

    static final String SAMPLE =
        "The quick brown fox jumps over the lazy dog. The dog barks and the fox runs away; "
      + "the fox is quick but the dog is not.";

    public static void main(String[] args) {
        String text;
        if (args.length > 0) {
            text = String.join(" ", args);
        } else {
            text = readParagraph();
            if (text.isBlank()) {                 
                System.out.println("(no input - using sample paragraph)");
                text = SAMPLE;
            }
        }


        Map<String, Integer> freq = new HashMap<>();
        for (String w : text.toLowerCase().split("[^a-z']+")) {
            if (!w.isEmpty()) {
                freq.merge(w, 1, Integer::sum);
            }
        }


        List<Map.Entry<String, Integer>> entries = new java.util.ArrayList<>(freq.entrySet());
        entries.sort(Map.Entry.<String, Integer>comparingByValue().reversed()
                .thenComparing(Map.Entry.comparingByKey()));

        System.out.println("\nWord      Count");
        System.out.println("--------------");
        for (Map.Entry<String, Integer> e : entries) {
            System.out.printf("%-9s %d%n", e.getKey(), e.getValue());
        }
    }

    static String readParagraph() {
        Scanner in = new Scanner(System.in);
        System.out.println("Type or paste a paragraph, then press Enter on an empty line:");
        StringBuilder sb = new StringBuilder();
        while (in.hasNextLine()) {
            String line = in.nextLine();
            if (line.isBlank()) break;
            sb.append(line).append(' ');
        }
        return sb.toString();
    }
}
