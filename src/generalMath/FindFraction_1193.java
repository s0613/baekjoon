package generalMath;

import java.util.Scanner;

public class FindFraction_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        int col = 0;
        int row = 0;
        point:
        while(true){
            if(col % 2 == 1){
                while(col != -1){
                    cnt++;
                    if(cnt == n){
                        System.out.println(row+1 + "/" + (col+1));
                        break point;
                    }
                    if(col == 0){
                        row++;
                        break;
                    }
                    row++;
                    col--;
                }

            }else{
                while(row != -1){
                    cnt++;
                    if(cnt == n){
                        System.out.println(row + 1 + "/" + (col + 1));
                        break point;
                    }
                    if(row == 0){
                        col++;
                        break;
                    }
                    row--;
                    col++;
                }
            }

        }
    }
}
