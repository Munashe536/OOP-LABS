
public class Temperature {

    private static final double ABSOLUTE_ZERO_K = 0.0;

   
    private double kelvin;

    private Temperature(double kelvin) {
        setKelvin(kelvin);
    }

    public static Temperature ofCelsius(double c)    { return new Temperature(c + 273.15); }
    public static Temperature ofFahrenheit(double f) { return new Temperature((f - 32) * 5.0 / 9.0 + 273.15); }
    public static Temperature ofKelvin(double k)     { return new Temperature(k); }


    private void setKelvin(double kelvin) {
        if (kelvin < ABSOLUTE_ZERO_K) {
            throw new IllegalArgumentException("Temperature is below absolute zero (minimum is 0 K = -273.15 C)");
        }
        this.kelvin = kelvin;
    }

    public double getKelvin()     { return kelvin; }
    public double getCelsius()    { return kelvin - 273.15; }
    public double getFahrenheit() { return getCelsius() * 9.0 / 5.0 + 32; }

    public void setCelsius(double c)    { setKelvin(c + 273.15); }
    public void setFahrenheit(double f) { setKelvin((f - 32) * 5.0 / 9.0 + 273.15); }

    @Override
    public String toString() {
        return String.format("%.2f C | %.2f F | %.2f K", getCelsius(), getFahrenheit(), getKelvin());
    }

   
}
