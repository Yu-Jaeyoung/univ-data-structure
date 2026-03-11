package practice.inheritance;

public class Main {
    static void main() {
        Basic basic = new Basic("홍길동", 22);
        System.out.println(basic.getName());
        System.out.println(basic.getAge());

        Extended extended = new Extended("홍길동", 22, "Hanbat", "010-0000-0000", 20240000);

        System.out.println(extended.getName());
        System.out.println(extended.getAge());
        System.out.println(extended.getAddress());
        System.out.println(extended.getPhoneNumber());
        System.out.println(extended.getStudentId());

        Basic basic2 = new Extended("홍길동", 22, "Hanbat", "010-0000-0000", 20240000);

        System.out.println(basic2.getName());
        System.out.println(basic2.getAge());
    }
}
