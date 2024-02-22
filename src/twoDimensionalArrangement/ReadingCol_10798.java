package twoDimensionalArrangement;

import java.util.Scanner;

public class ReadingCol_10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[5][15];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 15; j++){
                arr[i][j] = ' ';
            }
        }
        String[] str = new String[5];
        for(int i = 0; i < 5; i++){
            str[i] = sc.nextLine();
        }
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < str[i].length(); j++){
                arr[i][j] = str[i].charAt(j);
            }
        }

        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 5; j++){
                if(arr[j][i] == ' ') continue;
                System.out.print(arr[j][i]);
            }
        }
    }
}
