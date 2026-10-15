public class ElectricCar extends Car {
    private int batteryKwh;

    public ElectricCar(String make, int doors, int batteryKwh) {
        super(make, doors);                   
        this.batteryKwh = batteryKwh;
        System.out.println("3. ElectricCar constructor: " + batteryKwh + " kWh battery");
    }
}
