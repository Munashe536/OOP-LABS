import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SaveReadLines {
    public static void main(String[] args) {
        Path file = Path.of("lines.txt");
        List<String> lines = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Line " + i + ": ");
            if (!in.hasNextLine()) break;           
            lines.add(in.nextLine());
        }

        try {
            Files.write(file, lines);              
            System.out.println("\nSaved " + lines.size() + " line(s) to " + file.toAbsolutePath());

            // Read them back
            List<String> back = Files.readAllLines(file);
            System.out.println("Read back from file:");
            int n = 1;
            for (String s : back) {
                System.out.println("  " + n++ + ": " + s);
            }
        } catch (IOException e) {

            System.out.println("File problem: " + e.getMessage());
        }
    }
}
