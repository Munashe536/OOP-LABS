
public class Dog extends Animal {

    public Dog(String name) {
        super(name);        
    }

    public void speak() {
        System.out.println(name + " says Woof!");
    }

    public static void main(String[] args) {
        new Dog("Rex").speak();
    }
}
