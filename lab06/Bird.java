public class Bird implements Flyable {
    private final String species;
    public Bird(String species) { this.species = species; }
    @Override public void fly() { System.out.println(species + " flaps its wings and flies"); }
}
