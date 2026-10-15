public class TemperatureDemo {
    public static void main(String[] args) {
        Temperature t = Temperature.ofCelsius(25);
        System.out.println("25 C      -> " + t);

        t.setFahrenheit(32);
        System.out.println("32 F      -> " + t);

        Temperature zero = Temperature.ofKelvin(0);
        System.out.println("0 K       -> " + zero);

        try {
            Temperature.ofCelsius(-300);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
        try {
            t.setCelsius(-273.16);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
        System.out.println("Still valid after rejection: " + t);
    }
}
