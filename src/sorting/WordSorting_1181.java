package sorting;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSorting_1181 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); // 정수 입력 후 남은 개행 문자 제거

        TreeSet<String> words = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 먼저 길이에 대해 비교
                if (o1.length() != o2.length()) {
                    return o1.length() - o2.length();
                }
                // 길이가 같다면 사전 순으로 비교
                return o1.compareTo(o2);
            }
        });

        for (int i = 0; i < N; i++) {
            words.add(scanner.nextLine());
        }

        // 결과 출력
        for (String word : words) {
            System.out.println(word);
        }
    }
}