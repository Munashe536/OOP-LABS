
public class StackDemo {
    public static void main(String[] args) {
        MyStack<Integer> ints = new MyStack<>();
        ints.push(10); ints.push(20); ints.push(30);
        System.out.println(ints);
        System.out.println("peek = " + ints.peek());
        System.out.println("pop  = " + ints.pop());
        System.out.println("pop  = " + ints.pop());
        System.out.println("isEmpty? " + ints.isEmpty() + ", size = " + ints.size());

        MyStack<String> words = new MyStack<>();
        words.push("generic");
        words.push("stacks");
        System.out.println(words + " -> pop " + words.pop());


        try {
            new MyStack<Double>().pop();
        } catch (IllegalStateException e) {
            System.out.println("Popping an empty stack: " + e.getMessage());
        }
    }
}
