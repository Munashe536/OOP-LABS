
public class Employee {
    private final String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() { return name; }

    public double calculatePay() {
        return baseSalary;
    }

    public void describe() {
        System.out.printf("%-8s (%s) earns %.2f%n", name, getClass().getSimpleName(), calculatePay());
    }
}
