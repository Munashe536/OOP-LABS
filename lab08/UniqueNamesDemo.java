import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class UniqueNamesDemo {
    public static void main(String[] args) {
        List<String> names = List.of("Tariro", "Farai", "Rudo", "Farai", "Kuda", "Tariro", "Anesu", "Rudo");


        Set<String> unique = new LinkedHashSet<>(names);

        System.out.println("Original (" + names.size() + "): " + names);
        System.out.println("Unique   (" + unique.size() + "): " + unique);
    }
}
