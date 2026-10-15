 
public class Circle {

     
    private static int count = 0;

    private double radius;

     
    public Circle(double radius) {
        this.radius = radius;    
    }

   
    public Circle() {
        this(1.0);              
    }

    
    public static int getCount() {
        return count;
    }

    public double getRadius() { return radius; }

    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle(radius=%.2f, area=%.2f)", radius, area());
    }
}
