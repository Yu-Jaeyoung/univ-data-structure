package collection.framework.arraylist;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new LinkedList<>();

        studentList.add(0, new Student("가가가", "010-1234-1234"));
        studentList.add(1, new Student("나나나", "010-5678-5678"));
        studentList.add(2, new Student("다다다", "010-1234-5678"));

        for (Student student : studentList) {
            System.out.println(student);
        }

        System.out.println("---------------------------------------------------");
        studentList.remove(new Student("다다다", "010-1234-5678"));

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
