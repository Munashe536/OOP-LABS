
public class SchoolDemo {
    public static void main(String[] args) {
        Student s = new Student("Tariro", 20, "Software Engineering");
        Teacher t = new Teacher("Mr Moyo", 45, "Web Technologies");


        s.display();
        t.display();

     
        System.out.println(s.getName() + " studies " + s.getCourse());
        System.out.println(t.getName() + " teaches " + t.getSubject());

       
        System.out.println("Student is a Person? " + (s instanceof Person));
        System.out.println("Teacher is a Person? " + (t instanceof Person));
    }
}
