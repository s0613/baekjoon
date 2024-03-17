package sorting;

import java.io.*;

public class NumSorting_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 입력으로 주어지는 수의 범위가 10,000 이하이므로 최대 10,000까지의 숫자를 담는 배열 생성
        int[] count = new int[10001];

        // 각 수의 등장 횟수 count에 기록하기
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num]++;
        }

        // 등장 횟수(count)만큼 해당 수 출력하기
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            if (count[i] > 0) {
                for (int j = 0; j < count[i]; j++) {
                    stringBuilder.append(i).append("\n");
                }
            }
        }

        System.out.println(stringBuilder);
    }
}
