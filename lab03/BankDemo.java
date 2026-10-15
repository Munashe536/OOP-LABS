import java.util.List;

// Lab 3 - Exercise 3: shows the history and that the returned list cannot be modified
public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC-001", "Tendai", 500.00);
        acc.deposit(250.00);
        acc.withdraw(100.00);
        acc.withdraw(5000.00);

        List<String> h = acc.getHistory();
        System.out.println("Transaction history for " + acc.getAccountNumber() + ":");
        for (String line : h) {
            System.out.println("  " + line);
        }

        try {
            h.add("DEPOSIT 1000000.00 (forged)");
        } catch (UnsupportedOperationException e) {
            System.out.println("Tampering blocked: the history list is unmodifiable");
        }
        try {
            h.clear();
        } catch (UnsupportedOperationException e) {
            System.out.println("Erasing blocked too");
        }

        acc.deposit(10);
        System.out.println("Real history size now: " + acc.getHistory().size()
                + " (old snapshot still " + h.size() + ")");
    }
}
