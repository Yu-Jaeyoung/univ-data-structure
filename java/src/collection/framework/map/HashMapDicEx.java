package collection.framework.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapDicEx {
    public static void main(String[] args) {
        // 영어 단어와 한글 단어의 쌍을 저장하는 HashMap 컬렉션 생성
        Map<String, String> dictionary = new HashMap<>();

        // 3 개의 (key, value) 쌍을 dictionary에 저장
        dictionary.put("baby", "아기");
        dictionary.put("love", "사랑");
        dictionary.put("apple", "사과");

        // 맵의 모든 키 값을 반환하는 메소드 keySet 사용
        Set<String> words = dictionary.keySet();
        for (String word : words) {
            System.out.println(word + " : " + dictionary.get(word));
        }

        // 영어 단어를 입력받고 한글 단어 검색
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("찾고 싶은 단어는? ");
            String eng = scanner.next();

            // 해시맵에서 '키' eng의 '값' kor 검색
            String kor = dictionary.get(eng);
            if (kor == null) {
                System.out.println(eng + "는 없는 단어 입니다.");
            } else {
                System.out.println(kor);
            }

        }
        scanner.close();
    }
}
