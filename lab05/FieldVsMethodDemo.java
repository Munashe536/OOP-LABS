
class Parent {
    String name = "Parent-field";
    String getName() { return "Parent-method"; }
}

class Child extends Parent {
    String name = "Child-field";               
    @Override
    String getName() { return "Child-method"; }
}

public class FieldVsMethodDemo {
    public static void main(String[] args) {
        Parent ref = new Child();              

        System.out.println("ref.getName() -> " + ref.getName());    
        System.out.println("ref.name      -> " + ref.name);        

        Child real = (Child) ref;               
        System.out.println("real.name     -> " + real.name);      
    }
}
