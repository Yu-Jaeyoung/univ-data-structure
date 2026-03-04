package list.linkedlist;

public class IntegerLinkedList implements IntegerListInterface {

    private int numItems = 0;
    private Node head = new Node(-1, null);

    @Override
    public void add(int k, Integer x) {
        if (k < 0 || k > numItems) {
            return;
        }

        // prevNode를 찾는 과정
        Node prevNode = getNode(k - 1);
        /*
        for (int i = 0; i < k; i++) {
            prevNode = prevNode.next;
        }
        */

        prevNode.next = new Node(x, prevNode.next);

        numItems++;
    }

    private Node getNode(int k) {
        if (k >= -1 && k <= numItems - 1) {
            Node currNode = head;

            for (int i = 0; i <= k; i++) {
                currNode = currNode.next;
            }

            return currNode;
        } else {
            return null; // 에러
        }
    }

    @Override
    public void append(Integer x) {
        Node prevNode = head;

        while (prevNode.next != null) {
            prevNode = prevNode.next;
        }

        prevNode.next = new Node(x, prevNode.next);

        numItems++;
    }

    @Override
    public Integer remove(int k) {
        if (k < 0 || k > numItems - 1) {
            return null;
        }

        Node prevNode = getNode(k - 1);
        Node removingNode = prevNode.next;
        prevNode.next = removingNode.next;
        numItems--;

        return removingNode.item;
    }

    @Override
    public boolean removeItem(Integer x) {
        Node currNode = head, prevNode;

        for (int i = 0; i < numItems; i++) {
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

    @Override
    public Integer get(int k) {
        if (k < 0 || k > numItems - 1) {
            return null;
        }

        return getNode(k).item;
    }

    @Override
    public void set(int k, Integer x) {
        if (k < 0 || k > numItems - 1) {
            return;
        }

        getNode(k).item = x;
    }

    @Override
    public int indexOf(Integer x) {
        for (int i = 0; i < numItems; i++) {
            if (getNode(i).item.equals(x)) {
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
        head = new Node(-1, null);
    }

    @Override
    public void printAll() {
        Node node = head.next; // 더미 노드 다음부터 시작

        while (node != null) {
            System.out.println(node.item);
            node = node.next;
        }
    }
}
