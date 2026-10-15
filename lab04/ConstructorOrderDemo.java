
public class ConstructorOrderDemo {
    public static void main(String[] args) {
        System.out.println("Creating an ElectricCar...");
        ElectricCar e = new ElectricCar("Tesla", 4, 75);
        System.out.println("Done: " + e.make + " has been fully built");
    }
}
