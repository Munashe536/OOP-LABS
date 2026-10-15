
public class AccountDemo {
    public static void main(String[] args) {
        Account[] accounts = {
            new SavingsAccount("SAV-1", 500),
            new SavingsAccount("SAV-2", 2500),
            new CurrentAccount("CUR-1", 3000)
        };

        System.out.println("Before month end:");
        for (Account a : accounts) System.out.println("  " + a);

        accounts[0].deposit(700);         
        for (Account a : accounts) a.applyMonthlyFee();

        System.out.println("After deposit to SAV-1 and fees:");
        for (Account a : accounts) System.out.println("  " + a);
    }
}
