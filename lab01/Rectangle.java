 
public class Rectangle {
    double width;
    double height;

    
    void set(double w, double h) {
        width = w;
        height = h;
    }

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }

    void display() {
        System.out.printf("Rectangle %.1f x %.1f  area=%.1f  perimeter=%.1f%n",
                width, height, area(), perimeter());
    }
}
