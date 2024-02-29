import java.util.Arrays;
public class RecursionFunction {


        public static void main(String[] args) {
            // 입력 받기
            int n = 4;  // 예시로 n = 4
            int k = 3;  // 예시로 k = 3

            // 조합 생성을 위한 재귀 함수 호출
            generateCombinations(n, k);
        }

        public static void generateCombinations(int n, int k) {
            // 1 이상 n 이하의 수로 이루어진 배열 생성
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = i + 1;
            }

            // 조합 생성을 위한 재귀 함수 호출
            backtrack(numbers, k, 0, new int[k], 0);
        }

        private static void backtrack(int[] numbers, int k, int currentIndex, int[] combination, int start) {
            if (currentIndex == k) {
                // 배열을 문자열로 변환하여 출력
                System.out.println(Arrays.toString(combination));
                return;
            }

            for (int i = start; i < numbers.length; i++) {
                combination[currentIndex] = numbers[i];
                // 다음 단계로 이동
                backtrack(numbers, k, currentIndex + 1, combination, i + 1);
            }
        }
    }

