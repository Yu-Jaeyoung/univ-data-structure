package List.student;

import List.common.ListInterface;
import List.linkedlist_generic.LinkedList;

public class Main {
    public static void main(String[] args) {
        // ListInterface<Student> studentList = new ArrayList<>();
        ListInterface<Student> studentList = new LinkedList<>();

        studentList.add(0, new Student("가가가", "010-1234-1234"));
        studentList.add(1, new Student("나나나", "010-5678-5678"));
        studentList.add(2, new Student("다다다", "010-1234-5678"));

        studentList.printAll();

        studentList.removeItem(new Student("다다다", "010-1234-5678"));
        studentList.printAll();
    }
}
