package list.linkedlist_generic;


public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

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
