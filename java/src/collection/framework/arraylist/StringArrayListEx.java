package collection.framework.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayListEx {
    public static void main(final String[] args) {
        // 문자열만 삽입가능한 ArrayList 컬렉션 생성
        final ArrayList<String> arrayList = new ArrayList<>();

        // 키보드로부터 4개의 이름 입력받아 ArrayList에 삽입
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("이름을 입력하세요 >> ");
            String s = scanner.next(); // 키보드로부터 이름 입력
            arrayList.add(s); // ArrayList 컬렉션에 삽입
        }

        // ArrayList에 들어 있는 모든 이름 출력
        for (int i = 0; i < arrayList.size(); i++) {
            // ArrayList의 i 번째 문자열 얻어오기
            String name = arrayList.get(i);
            System.out.print(name + " ");
        }

        // 가장 긴 이름 출력
        int longestIndex = 0;
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(longestIndex).length() < arrayList.get(i).length()) {
                longestIndex = i;
            }
        }

        System.out.println("\n가장 긴 이름은 : " + arrayList.get(longestIndex));

        scanner.close();
    }
}
