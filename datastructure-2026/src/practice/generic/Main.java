package practice.generic;

import practice.inheritance.Basic;

public class Main {

    // generic method
    static <T> T unboxing(Box<T> box) {
        return box.getContent();
    }

    static void main() {
        Box<String> box = new Box<>();
        box.setContent("This is Box");

        System.out.println(box.getContent());

        Box<Integer> box2 = new Box<>();
        box2.setContent(10);
        System.out.println(box2.getContent());

        Box<Double> box3 = new Box<>();
        box3.setContent(10.0);
        System.out.println(box3.getContent());

        Box<Basic> box4 = new Box<>();
        box4.setContent(new Basic("Guildong Hong", 22));
        Basic basic = box4.getContent();
        System.out.println(basic.getName());
        System.out.println(basic.getAge());

        Box<String> box5 = new Box<>();
        box5.setContent("This is Box");
        String content = unboxing(box5);
        System.out.println(content);
    }
}
