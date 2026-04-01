package list.linkedlist.primitive;

public class IntegerLinkedList implements IntegerListInterface {

    private int numItems;
    private Node head;

    public IntegerLinkedList() {
        numItems = 0;
        head = new Node(0, null); // dummy node
    }

    private Node getNode(final int k) {
        if (k >= -1 && k <= numItems - 1) {
            Node currNode = head;
            for (int i = 0; i <= k; i++) {
                currNode = currNode.next;
            }
            return currNode;
        } else {
            return null;
        }
    }

    @Override
    public void add(final int k, final Integer x) {
        if (k < 0 || k > numItems) {
            return;
        }

        Node prevNode = getNode(k - 1);
        prevNode.next = new Node(x, prevNode.next);
        numItems++;
    }

    @Override
    public void append(final Integer x) {
        Node prevNode = head;

        while (prevNode.next != null) {
            prevNode = prevNode.next;
        }

        prevNode.next = new Node(x, null);
        numItems++;
    }

    @Override
    public Integer remove(final int k) {
        if (isEmpty()) {
            return null;
        }

        if (k < 0 || k > numItems - 1) {
            return null;
        }

        Node prevNode = getNode(k - 1);

        Integer tmp = prevNode.next.item;

        prevNode.next = prevNode.next.next;
        numItems--;

        return tmp;
    }

    // while문 스타일로 작성한다면 ?
    @Override
    public boolean removeItem(Integer x) {
//        Node prevNode = head;
//
//        while (!prevNode.next.item.equals(x)) {
//            prevNode = prevNode.next;
//        }
//
//        prevNode.next = prevNode.next.next;
//        numItems--;
//
//        return true;
        Node currNode = head;
        Node prevNode;

        for (int i = 0; i <= numItems - 1; i++) {
            prevNode = currNode;
            currNode = currNode.next;

            if (currNode.item.equals(x)) {
                prevNode.next = currNode.next;
                numItems--;

                return true;
            }
        }

        return false;
    }

    // 수정 필요
    @Override
    public Integer get(int k) {
        return getNode(k).item;
    }

    // 수정 필요
    @Override
    public void set(int k, Integer x) {
        getNode(k).item = x;
    }

    @Override
    public int indexOf(Integer x) {
        Node currNode = head.next;

        for (int i = 0; i <= numItems - 1; i++) {
            if (currNode.item.equals(x)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public int size() {
        return numItems;
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    @Override
    public void clear() {
        head = new Node(0, null);
        numItems = 0;
    }

    @Override
    public void printAll() {
        System.out.print("List: ");

        Node node = head.next;

        while (node != null) {
            if (node.next == null) {
                System.out.println(node.item);
            } else {
                System.out.print(node.item + ", ");
            }
            node = node.next;
        }
    }
}
