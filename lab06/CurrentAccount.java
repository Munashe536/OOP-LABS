public class CurrentAccount extends Account {
    public CurrentAccount(String id, double openingBalance) { super(id, openingBalance); }

    
    @Override public double monthlyFee() { return 10.0 + balance * 0.001; }
}
