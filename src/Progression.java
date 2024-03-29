import java.util.Scanner;

public class Progression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n-k; i++){
            for(int j = i+k; j < n; j++){
             if(Math.abs(arr[i]-arr[j]) > max){
                 max = Math.abs(arr[i]-arr[j]);
             }
            }
        }
        System.out.println(max);


    }
}