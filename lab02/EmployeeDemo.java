
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tendai", "Finance", 1500);
        Employee e2 = new Employee("Rudo", "IT");
        Employee e3 = new Employee("Kuda");
        Employee e4 = new Employee(e1);      
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        
        e4.setSalary(9999);
        System.out.println("\nAfter changing the copy's salary:");
        System.out.println(e1);
        System.out.println(e4);
    }
}
