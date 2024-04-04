package List.linkedlist_generic;

public class Node<E> {

    E item;
    Node<E> next;

    public Node(final E x, final Node<E> next) {
        this.item = x;
        this.next = next;
    }
}