import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;


public class LearnerReport {

    record Learner(String name, int marks) {
        String band() {
            if (marks >= 70) return "A";
            if (marks >= 50) return "B";
            return "C";
        }
    }

    
    static Learner parse(String line) {
        String[] parts = line.split(",");
        if (parts.length != 2) return null;
        try {
            return new Learner(parts[0].trim(), Integer.parseInt(parts[1].trim()));
        } catch (NumberFormatException e) {
            System.out.println("Skipping bad line: " + line);
            return null;
        }
    }

    public static void main(String[] args) {
        Path csv = Path.of("learners.csv");

        try {
            List<Learner> learners = Files.readAllLines(csv).stream()
                    .skip(1)                                     
                    .filter(l -> !l.isBlank())
                    .map(LearnerReport::parse)
                    .filter(l -> l != null)
                    .toList();

          
            Map<String, List<Learner>> byBand = learners.stream()
                    .collect(Collectors.groupingBy(Learner::band, TreeMap::new, Collectors.toList()));

            for (Map.Entry<String, List<Learner>> entry : byBand.entrySet()) {
                String band = entry.getKey();
                List<Learner> group = entry.getValue();

                double avg = group.stream().mapToInt(Learner::marks).average().orElse(0);

                List<String> report = new java.util.ArrayList<>();
                report.add("Grade band " + band + " report");
                report.add("Learners: " + group.size() + "   Average mark: " + String.format("%.1f", avg));
                report.add("------------------------------");
                group.stream()
                     .sorted((a, b) -> Integer.compare(b.marks(), a.marks()))   // highest first
                     .forEach(l -> report.add(String.format("%-10s %3d", l.name(), l.marks())));

                Path out = Path.of("report_" + band + ".txt");
                Files.write(out, report);
                System.out.println("Wrote " + out + " (" + group.size() + " learners)");
            }
        } catch (IOException e) {
            System.out.println("File problem: " + e.getMessage()
                    + "\nMake sure learners.csv is in the folder you run the program from.");
        }
    }
}
