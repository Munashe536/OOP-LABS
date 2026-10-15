
public class Intern extends Employee {
    private static final double STIPEND_RATE = 0.5;  
    private static final double ALLOWANCE = 100.0;

    public Intern(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculatePay() {
        return baseSalary * STIPEND_RATE + ALLOWANCE;
    }
}
