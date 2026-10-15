
public class CircleDemo {
    public static void main(String[] args) {
        System.out.println("Circles before: " + Circle.getCount());   // works with no object

        Circle c1 = new Circle(2.5);
        Circle c2 = new Circle();      
        Circle c3 = new Circle(4);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("Circles created: " + Circle.getCount());
    }
}
