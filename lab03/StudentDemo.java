
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student("Tariro", 72);
        System.out.println(s);

        s.setMarks(55);
        System.out.println("After update: " + s);
        s.setMarks(35);
        System.out.println("After update: " + s);

        try {
            s.setMarks(150);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
        try {
            s.setMarks(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
        System.out.println("Marks unchanged after rejections: " + s.getMarks());
    }
}
