package Math;

import java.util.Scanner;

public class PrimeNumber_2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n - m+1];
        for (int i = 0; i <= n - m; i++) {
            int cnt = 0;
            int temp = m + i;

            for (int j = 1; j <= m + i; j++) {
                if (temp % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                arr[i] = temp;
                sum += temp;
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            int min = 100000;
            for (int i = 0; i <= n-m; i++) {
                if (min > arr[i] && arr[i] != 0) {
                    min = arr[i];
                }
            }
            System.out.println(min);
        }
    }
}
