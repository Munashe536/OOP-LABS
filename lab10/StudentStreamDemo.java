import java.util.List;


record Student(String name, int marks) { }

public class StudentStreamDemo {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Tariro", 72), new Student("Farai", 58), new Student("Rudo", 91),
                new Student("Anesu", 45),  new Student("Kuda", 66),  new Student("Nyasha", 80));

        double average = students.stream()
                .mapToInt(Student::marks)
                .average()
                .orElse(0);
        System.out.printf("Class average: %.2f%n", average);

        System.out.println("Above average (A-Z):");
        students.stream()
                .filter(s -> s.marks() > average)      
                .map(Student::name)
                .sorted()
                .forEach(name -> System.out.println("  " + name));
    }
}
