import java.util.HashSet;
import java.util.Set;


public class BookSetDemo {
    public static void main(String[] args) {
        Set<Book> shelf = new HashSet<>();

        System.out.println("add Java Basics:           " + shelf.add(new Book("978-1", "Java Basics")));
        System.out.println("add Data Structures:       " + shelf.add(new Book("978-2", "Data Structures")));
        // Different object, same ISBN (even a different title): add() returns false
        System.out.println("add duplicate ISBN 978-1:  " + shelf.add(new Book("978-1", "Java Basics (2nd copy)")));

        System.out.println("Set size: " + shelf.size() + "  -> " + shelf);
        System.out.println("contains ISBN 978-2? " + shelf.contains(new Book("978-2", "anything")));


    }
}
