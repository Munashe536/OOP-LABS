
public abstract class Shape {

    public abstract double area();
    public abstract double perimeter();

   
    public void describe() {
        System.out.printf("%-10s area=%8.2f  perimeter=%8.2f%n",
                getClass().getSimpleName(), area(), perimeter());
    }
}
