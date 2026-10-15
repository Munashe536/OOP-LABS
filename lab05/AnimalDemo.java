
public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] farm = { new Cat(), new Cow(), new Duck(), new Animal() };


        for (Animal a : farm) {
            a.sound();
        }
    }
}
