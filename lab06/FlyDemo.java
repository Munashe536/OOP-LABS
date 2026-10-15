
public class FlyDemo {
    public static void main(String[] args) {
        Flyable[] things = { new Bird("Fish eagle"), new Aeroplane("Boeing 737") };
        for (Flyable f : things) {
            f.fly();
        }
    }
}
