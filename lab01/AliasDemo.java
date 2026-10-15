 
public class AliasDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.width = 4;
        r1.height = 5;

        Rectangle r2 = r1;       
        r2.width = 10;

        System.out.println("r1.width after changing r2.width = " + r1.width);
        System.out.println("Same object? (r1 == r2) " + (r1 == r2));

        
        Rectangle r3 = new Rectangle();
        r3.width = r1.width;
        r3.height = r1.height;
        r3.width = 99;
        System.out.println("r1.width after changing the real copy r3 = " + r1.width);
        System.out.println("Same object? (r1 == r3) " + (r1 == r3));
    }
}
