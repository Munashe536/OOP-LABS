import java.util.Arrays;


public class BubbleSortDemo {


    static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        boolean swapped;
        for (int pass = 0; pass < arr.length - 1; pass++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - pass; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) break;           
        }
    }

    public static void main(String[] args) {
        Integer[] nums = {42, 7, 19, 3, 88, 1};
        String[] names = {"Tariro", "Farai", "Rudo", "Anesu", "Kuda"};

        bubbleSort(nums);
        bubbleSort(names);

        System.out.println("Integer[]: " + Arrays.toString(nums));
        System.out.println("String[]:  " + Arrays.toString(names));

        
    }
}
