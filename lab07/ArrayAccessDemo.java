
public class ArrayAccessDemo {


    static int getElement(int[] arr, int index) {
        try {
            return arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index " + index + ": " + e.getMessage());
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        System.out.println("data[2]  = " + getElement(data, 2));
        System.out.println("data[5]  = " + getElement(data, 5));
        System.out.println("data[-1] = " + getElement(data, -1));
        System.out.println("Program continues normally after the errors.");
    }
}
