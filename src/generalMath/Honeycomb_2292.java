package generalMath;

import java.util.Scanner;

public class Honeycomb_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int cnt = 0;
        while (true) {
            if(n <= num){
                break;
            }
            else{
                cnt++;
                num += 6*cnt;
            }
        }
        System.out.println(++cnt);
    }
}
