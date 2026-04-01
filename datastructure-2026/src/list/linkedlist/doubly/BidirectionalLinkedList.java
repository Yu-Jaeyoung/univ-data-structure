package list.linkedlist.doubly;


public class BidirectionalLinkedList<E> {
    private int numItems;
    private BidirectionalNode<E> head;

    private BidirectionalNode<E> getNode(final int k) {
        return null;
    }

    public void add(final int k, final E x) {
        BidirectionalNode<E> prevNode = getNode(k - 1);

        BidirectionalNode<E> newNode = new BidirectionalNode<>();

        newNode.prev = prevNode;
        newNode.next = prevNode.next;
        prevNode.next.prev = newNode;
        prevNode.next = newNode;

        // etc
    }

    public E remove(final int k) {
        // etc
        BidirectionalNode<E> currNode = getNode(k);
        currNode.prev.next = currNode.next;
        currNode.next.prev = currNode.prev;

        numItems--;

        return currNode.item;
    }
}
