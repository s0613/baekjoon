package twoDimensionalArrangement;

import java.util.Scanner;

public class MaxValue_2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col = 0;
        int row = 0;
        int max = -1;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                int temp = sc.nextInt();

                if(max < temp){
                    max = temp;
                    row = i+1;
                    col = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(row + " " + col);
    }
}
