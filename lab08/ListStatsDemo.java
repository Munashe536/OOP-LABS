import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListStatsDemo {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(14, 7, 39, 2, 21, 56, 8, 33, 90, 5));

        int sum = 0;
        for (int n : numbers) sum += n;          

        int max = Collections.max(numbers);

        List<Integer> reversed = new ArrayList<>(numbers);
        Collections.reverse(reversed);         

        System.out.println("List:     " + numbers);
        System.out.println("Sum:      " + sum);
        System.out.println("Maximum:  " + max);
        System.out.println("Reversed: " + reversed);
    }
}
