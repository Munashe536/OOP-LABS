public class Aeroplane implements Flyable {
    private final String model;
    public Aeroplane(String model) { this.model = model; }
    @Override public void fly() { System.out.println(model + " takes off using jet engines"); }
}
