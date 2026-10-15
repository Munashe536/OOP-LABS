 
public class Car {

    // EXPLAIN: instance variables = the STATE of each Car object
    String brand;
    int year;
    double mileage;   // in kilometres

    // EXPLAIN: behaviour that reads the object's own fields
    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Mileage: " + mileage + " km");
    }

    // EXPLAIN: a car is antique when it is MORE than 25 years old (strictly greater)
    boolean isAntique() {
        int currentYear = java.time.Year.now().getValue();
        return (currentYear - year) > 25;
    }
}
