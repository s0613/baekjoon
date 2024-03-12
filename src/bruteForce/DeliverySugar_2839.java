package bruteForce;

import java.util.Scanner;

public class DeliverySugar_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 5){
            if(n == 3){
                System.out.println(1);
                return;
            }else {
                System.out.println(-1);
                return;
            }
        }
        int temp = n%5;
        int cnt = n/5;
        while(true){
            if(temp%3 == 0){
                cnt += temp/3;
                break;
            }else{
                temp += 5;
                cnt--;
            }
            if(temp > n){
                cnt = -1;
                break;
            }
        }
        System.out.println(cnt);
    }
}
