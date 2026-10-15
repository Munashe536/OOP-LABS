
record Student(String name, int age) { }

public class StudentRecordDemo {
    public static void main(String[] args) {
        Student a = new Student("Tariro", 20);
        Student b = new Student("Tariro", 20);
        Student c = new Student("Farai", 22);

        System.out.println("Print:        " + a);              
        System.out.println("a.equals(b):  " + a.equals(b));      
        System.out.println("a == b:       " + (a == b));           
        System.out.println("a.equals(c):  " + a.equals(c));
        System.out.println("Component:    name=" + a.name() + ", age=" + a.age());
        System.out.println("Same hashCode for equal records? " + (a.hashCode() == b.hashCode()));
    }
}
