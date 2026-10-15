
public class Temperature {

    private final double celsius;

    
    private Temperature(double celsius) {
        this.celsius = celsius;
    }

    
    public static Temperature fromCelsius(double c) {
        return new Temperature(c);
    }

    public static Temperature fromFahrenheit(double f) {
        return new Temperature((f - 32) * 5.0 / 9.0);
    }

    public double getCelsius()    { return celsius; }
    public double getFahrenheit() { return celsius * 9.0 / 5.0 + 32; }

    @Override
    public String toString() {
        return String.format("%.1f C / %.1f F", getCelsius(), getFahrenheit());
    }

    
}
