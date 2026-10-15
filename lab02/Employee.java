
public class Employee {

    private static int nextId = 1000;        
    private final int employeeId;
    private String name;
    private String department;
    private double salary;

    
    public Employee(String name, String department, double salary) {
        this.employeeId = nextId++;          
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

   
    public Employee(String name, String department) {
        this(name, department, 500.0);
    }

    
    public Employee(String name) {
        this(name, "Unassigned");
    }

    
    public Employee(Employee other) {
        this(other.name, other.department, other.salary);
    }

    public int getEmployeeId()   { return employeeId; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return String.format("Employee #%d %s | %s | %.2f", employeeId, name, department, salary);
    }
}
