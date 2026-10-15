import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileStats {
    public static void main(String[] args) {
        Path path = Path.of(args.length > 0 ? args[0] : "sample.txt");

        try {
            List<String> lines = Files.readAllLines(path);

            int words = 0;
            int chars = 0;
            for (String line : lines) {
                chars += line.length();
                if (!line.isBlank()) {
                    words += line.trim().split("\\s+").length;   
                }
            }

            System.out.println("File:       " + path);
            System.out.println("Lines:      " + lines.size());
            System.out.println("Words:      " + words);
            System.out.println("Characters: " + chars + " (excluding line breaks)");
            System.out.println("Characters: " + (chars + lines.size()) + " (counting one newline per line)");
        } catch (IOException e) {
            System.out.println("Cannot read " + path + ": " + e.getMessage());
        }
    }
}
