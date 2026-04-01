package list.linkedlist.doubly;

public class BidirectionalNode<E> {
    E item;
    BidirectionalNode<E> prev;
    BidirectionalNode<E> next;

    public BidirectionalNode() {
    }

    public BidirectionalNode(
            final E x,
            BidirectionalNode<E> prev,
            BidirectionalNode<E> next
    ) {
        this.item = x;
        this.prev = prev;
        this.next = next;
    }
}
