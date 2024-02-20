package deepenOne;

import java.util.Scanner;

public class DrawingStar7_2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            for(int k = 0; k < t-i-1; k++){
                System.out.print(" ");
            }
            for(int j = 0; j < i*2+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = t-1; i > 0; i--){
            for(int k = t; k > i; k--){
                System.out.print(" ");
            }
            for(int j = 0; j < i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
