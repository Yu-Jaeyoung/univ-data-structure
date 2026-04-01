package list.linkedlist.generic;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        try {
            list.add(0, "300");
            list.add(1, "400");
            list.add(0, "500");
            list.append("600");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        list.printAll();


        String removeItem = list.remove(2);
        System.out.println(removeItem);
        list.printAll();

        String getItem = list.get(2);
        System.out.println(getItem);

        int index = list.indexOf("500");
        System.out.println(index);

        list.set(2, "100");
        list.printAll();

        list.clear();
        list.printAll();
    }
}
