package list.linkedlist;

public class Main {
    public static void main(String[] args) {
        IntegerLinkedList linkedList = new IntegerLinkedList();

        linkedList.add(0, 5);
        linkedList.add(1, 8);
        linkedList.add(1, 1);

        linkedList.append(9);
        linkedList.append(10);

        linkedList.printAll();
        System.out.println("----------");
        linkedList.remove(1);
        linkedList.printAll();
        System.out.println("----------");
        linkedList.removeItem(10);
        linkedList.printAll();
    }
}
