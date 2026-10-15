
public class Greeting implements Greeter1, Greeter2 {

    @Override
    public void hello() {
        Greeter1.super.hello();      
        Greeter2.super.hello();      
        System.out.println("Hello from Greeting itself (conflict resolved)");
    }

    public static void main(String[] args) {
        new Greeting().hello();
    }
}
