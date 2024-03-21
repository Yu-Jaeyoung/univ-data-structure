package arraylist1;

public class Main {
    public static void main(String[] args) {
        IntegerArrayList list = new IntegerArrayList();

        list.add(0, 300);
        list.add(1, 500);
        list.append(800);

        list.removeItem(300);

        Integer x = list.remove(0);
        System.out.println("삭제된 원소는 " + x + "입니다.");

        boolean result = list.removeItem(800);

        if (result) {
            System.out.println("삭제 성공");
        } else {
            System.out.println("삭제 실패");
        }

        list.printAll();
    }
}
