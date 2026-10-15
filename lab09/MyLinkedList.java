import java.util.Iterator;
import java.util.NoSuchElementException;


public class MyLinkedList<T> implements Iterable<T> {


    private static class Node<E> {
        E value;
        Node<E> next;
        Node(E value) { this.value = value; }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void add(T value) {
        Node<T> n = new Node<>(value);
        if (head == null) head = tail = n;
        else { tail.next = n; tail = n; }
        size++;
    }

    public int size() { return size; }


    private class ListIterator implements Iterator<T> {
        private Node<T> current = head;      

        @Override public boolean hasNext() { return current != null; }

        @Override public T next() {
            if (current == null) throw new NoSuchElementException();
            T v = current.value;
            current = current.next;
            return v;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }
}
