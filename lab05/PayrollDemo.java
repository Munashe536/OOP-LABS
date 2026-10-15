
public class PayrollDemo {
    public static void main(String[] args) {
        Employee[] staff = {
            new Manager("Rudo", 3000, 800),
            new Developer("Kuda", 2500, 10),
            new Developer("Nyasha", 2600, 4),
            new Intern("Tino", 1200),         
        };

        double total = 0;

        for (Employee e : staff) {
            e.describe();
            total += e.calculatePay();
        }
        System.out.printf("Total payroll: %.2f%n", total);
    }
}
