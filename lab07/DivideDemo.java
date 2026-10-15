import java.util.InputMismatchException;
import java.util.Scanner;


public class DivideDemo {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the first integer: ");
            int a = in.nextInt();                   
            System.out.print("Enter the second integer: ");
            int b = in.nextInt();

            int result = a / b;                
            System.out.println(a + " / " + b + " = " + result);
            System.out.printf("Exact value: %.3f%n", (double) a / b);

        } catch (InputMismatchException e) {
            System.out.println("\nInvalid input: please enter whole numbers only.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (java.util.NoSuchElementException e) {
            System.out.println("\nNo input was provided.");
        } finally {
            System.out.println("Program finished.");
        }
    }
}
