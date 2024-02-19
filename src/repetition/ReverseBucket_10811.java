package repetition;

import java.util.Scanner;

public class ReverseBucket_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }
        for(int i = 0; i < m; i++){
            int j = sc.nextInt();
            int k = sc.nextInt();
            int jNum = j;
            int kNum = k;
            int range = k-j+1;
            for(int l = 0; l < range/2; l++){
                int temp = arr[jNum-1];
                arr[jNum-1] = arr[kNum-1];
                arr[kNum-1] = temp;
                kNum--;
                jNum++;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
