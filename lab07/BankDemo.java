
public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC-001", "Tendai", 500.00);
        System.out.println(acc);

        try {
            acc.withdraw(100);
            System.out.println("Withdrew 100 -> " + acc);
            acc.withdraw(5000);                       
            System.out.println("This line is never reached");
        } catch (InsufficientFundsException e) {
            System.out.println("Failed: " + e.getMessage());
            System.out.printf("You are short by %.2f%n", e.getShortfall());
        }
        System.out.println("Balance unchanged by failed withdrawal: " + acc.getBalance());
    }
}
