
public class TemperatureDemo {
    public static void main(String[] args) {
        Temperature t1 = Temperature.fromCelsius(25);
        Temperature t2 = Temperature.fromFahrenheit(212);
        System.out.println("25 C   -> " + t1);
        System.out.println("212 F  -> " + t2);
        
    }
}
