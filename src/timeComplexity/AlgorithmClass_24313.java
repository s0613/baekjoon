package timeComplexity;

import java.util.Scanner;

public class AlgorithmClass_24313 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 함수 f(n) = a1n + a0 의 계수 입력 받기
        int a1 = scanner.nextInt();
        int a0 = scanner.nextInt();

        // 양의 정수 c 입력 받기
        int c = scanner.nextInt();

        // 양의 정수 n0 입력 받기
        int n0 = scanner.nextInt();

        // O(n) 정의를 확인하는 함수 호출하여 결과 출력
        System.out.println(checkOnotation(a1, a0, c, n0));
    }

    // O(n) 정의를 확인하는 함수
    public static int checkOnotation(int a1, int a0, int c, int n0) {
        // O(n) 정의를 만족하는지 확인
        for (int n = n0; n <= 100; n++) {
            if (a1 * n + a0 > c * n) {
                return 0;  // O(n) 정의를 만족하지 않으면 0 반환
            }
        }
        return 1;  // 모든 n에 대해 O(n) 정의를 만족하면 1 반환
    }
}
