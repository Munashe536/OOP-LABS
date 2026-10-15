public class SavingsAccount extends Account {
    public SavingsAccount(String id, double openingBalance) { super(id, openingBalance); }


    @Override public double monthlyFee() { return balance >= 1000 ? 0.0 : 2.50; }
}
