import java.util.ArrayList;

class BadStack<T> extends ArrayList<T> {
    void push(T item) { add(item); }
    T pop()           { return remove(size() - 1); }
}

class GoodStack<T> {

    private final ArrayList<T> items = new ArrayList<>();

    void push(T item) { items.add(item); }

    T pop() {
        if (items.isEmpty()) throw new IllegalStateException("Stack is empty");
        return items.remove(items.size() - 1);
    }

    T peek() {
        if (items.isEmpty()) throw new IllegalStateException("Stack is empty");
        return items.get(items.size() - 1);
    }

    boolean isEmpty() { return items.isEmpty(); }
    int size()        { return items.size(); }
}

public class StackDemo {
    public static void main(String[] args) {
       
        BadStack<String> bad = new BadStack<>();
        bad.push("A");
        bad.push("B");
        bad.push("C");
        bad.add(0, "SNEAKY");     
        bad.remove(1);             
        System.out.println("BadStack after illegal operations: " + bad);
        System.out.println("  also exposes get(i), set(i,x), sort(...), clear(), ...");

     
        GoodStack<String> good = new GoodStack<>();
        good.push("A");
        good.push("B");
        good.push("C");
        
        System.out.println("GoodStack peek: " + good.peek());
        System.out.println("GoodStack pop order: " + good.pop() + good.pop() + good.pop());
        System.out.println("Empty now? " + good.isEmpty());
        
    }
}
