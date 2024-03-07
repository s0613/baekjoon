package bruteForce;

import java.util.Scanner;

public class SeparateSum_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 0;
        for(int i = 1; i < n; i++){
            String temp = String.valueOf(n-i);
            int sum = 0;
            for(int j = 0; j < temp.length(); j++){
                String str = temp.substring(j,j+1);
                sum += Integer.parseInt(str);
            }
            sum += Integer.parseInt(temp);
            if(sum == n){
                min = Integer.parseInt(temp);
            }
        }
        System.out.println(min);

    }
}
