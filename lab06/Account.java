
public abstract class Account {
    private final String id;
    protected double balance;

    protected Account(String id, double openingBalance) {
        this.id = id;
        this.balance = openingBalance;
    }

    public String getId()       { return id; }
    public double getBalance()  { return balance; }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive");
        balance += amount;
    }


    public abstract double monthlyFee();

 
    public void applyMonthlyFee() {
        balance -= monthlyFee();
    }

    @Override
    public String toString() {
        return String.format("%-15s %s balance=%.2f fee=%.2f",
                getClass().getSimpleName(), id, balance, monthlyFee());
    }
}
