package twoDimensionalArrangement;

import java.util.Scanner;

public class colorPaper_2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] totalPaper = new int[100][100];
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j = x; j < x+10; j++){
                for(int k = y; k < y+10; k++){
                    totalPaper[j][k] = -1;
                }
            }
        }
        int sum = 0;
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(totalPaper[i][j] != -1){
                    sum += 1;
                }
            }
        }
        System.out.println(10000-sum);
    }
}
