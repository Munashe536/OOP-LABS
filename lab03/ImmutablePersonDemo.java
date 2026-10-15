import java.time.LocalDate;

public class ImmutablePersonDemo {
    public static void main(String[] args) {
        ImmutablePerson p1 = new ImmutablePerson("Farai", LocalDate.of(2003, 5, 14));
        ImmutablePerson p2 = p1.withName("Farai M.");

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p1 unchanged? " + p1.getName().equals("Farai"));
     
    }
}
