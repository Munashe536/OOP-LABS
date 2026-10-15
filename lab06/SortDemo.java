import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>(List.of(
                new Student("Tariro", 72), new Student("Farai", 58),
                new Student("Rudo", 91),   new Student("Anesu", 58)));

        Collections.sort(list);                       // uses compareTo -> by name
        System.out.println("By name (Comparable):     " + list);


        Comparator<Student> byMarksDesc =
                Comparator.comparingInt(Student::getMarks).reversed()
                          .thenComparing(Student::getName);
        list.sort(byMarksDesc);
        System.out.println("By marks desc (Comparator): " + list);

        list.sort((a, b) -> Integer.compare(a.getMarks(), b.getMarks()));
        System.out.println("By marks asc (lambda):      " + list);
    }
}
