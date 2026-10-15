
public enum Coin {

    QUARTER(25), DIME(10), NICKEL(5), PENNY(1);

    private final int cents;

    Coin(int cents) { this.cents = cents; }  

    public int getCents() { return cents; }


    public static java.util.Map<Coin, Integer> fewestCoins(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative");
        java.util.Map<Coin, Integer> result = new java.util.EnumMap<>(Coin.class);
        int remaining = amount;
        for (Coin c : values()) {
            int count = remaining / c.cents;
            if (count > 0) {
                result.put(c, count);
                remaining -= count * c.cents;
            }
        }
        return result;
    }
}
