import java.util.Map;


public class CoinDemo {
    public static void main(String[] args) {
        int[] amounts = {0, 1, 30, 41, 99, 142};
        for (int amount : amounts) {
            Map<Coin, Integer> coins = Coin.fewestCoins(amount);
            int total = coins.values().stream().mapToInt(Integer::intValue).sum();
            System.out.printf("%3d cents -> %d coin(s) %s%n", amount, total, coins);
        }
    }
}
