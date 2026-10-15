
public class LinkedListDemo {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("alpha");
        list.add("beta");
        list.add("gamma");

        System.out.println("Size: " + list.size());
        for (String s : list) {                  
            System.out.println("  " + s);
        }

        MyLinkedList<Integer> nums = new MyLinkedList<>();
        for (int i = 1; i <= 5; i++) nums.add(i * i);
        int sum = 0;
        for (int n : nums) sum += n;
        System.out.println("Sum of squares 1..5 = " + sum);
    }
}
