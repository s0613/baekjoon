package repetition;

import java.util.Scanner;

public class Sekai_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Double[] arr = new Double[n];
        Double max = 0.0;
        for(int i = 0; i < n; i++){
            Double temp = sc.nextDouble();
            if(temp > max){
                max = temp;
            }
            arr[i] = temp;
        }
        Double sum = 0.0;
        for(int i = 0; i < n; i++){
            arr[i] = arr[i]/max*100;
            sum += arr[i];
        }
        System.out.print(sum/n);
    }
}
