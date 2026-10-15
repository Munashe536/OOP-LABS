 
public class CarDemo {
    public static void main(String[] args) {
        // EXPLAIN: 'new' allocates each Car on the heap; c1, c2, c3 hold references
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.year = 2018;
        c1.mileage = 85000.5;

        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.year = 1985;
        c2.mileage = 240000;

        Car c3 = new Car();
        c3.brand = "Honda";
        c3.year = 2005;
        c3.mileage = 130250.75;

        c1.display();
        c2.display();
        c3.display();

        System.out.println(c1.brand + " antique? " + c1.isAntique());
        System.out.println(c2.brand + " antique? " + c2.isAntique());
        System.out.println(c3.brand + " antique? " + c3.isAntique());
    }
}
