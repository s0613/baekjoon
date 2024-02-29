import java.util.Scanner;

public class Progression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int total = 0;
        for(int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        int min = 1000000;
        for(int i = 0; i < n-k; i++){
            int sum = 0;
            for(int j = i; j < i+k; j++){
                sum += arr[j];
            }
            if(min > sum){
                min = sum;
            }
        }
        System.out.println(total-min);



    }
}