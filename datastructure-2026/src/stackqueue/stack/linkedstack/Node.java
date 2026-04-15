package stackqueue.stack.linkedstack;

public class Node<E> {
    E item;
    Node<E> next;

    public Node() {
    }

    public Node(final E item, final Node<E> next) {
        this.item = item;
        this.next = next;
    }
}
