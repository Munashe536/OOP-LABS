
public class ShapeDemo {
    public static void main(String[] args) {
      
        Shape[] shapes = { new Circle(3), new Rectangle(4, 5), new Square(6) };
        double totalArea = 0;
        for (Shape s : shapes) {
            s.describe();
            totalArea += s.area();
        }
        System.out.printf("Total area: %.2f%n", totalArea);
    }
}
