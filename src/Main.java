import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][n];
        int gps = 'S';
        int x = 0;
        int y = 0;
        for(int i = 0; i < m; i++){
            char cmd = sc.next().charAt(0);
            if(cmd == 'R'){
                if(gps == 'S'){
                    gps = 'W';
                }else if(gps == 'W'){
                    gps = 'N';
                } else if (gps == 'N') {
                    gps = 'E';
                } else if (gps == 'E') {
                    gps = 'S';
                }
            }else{
                if(gps == 'S'){
                    arr[++x][y] += 1;
                }else if( gps == 'N'){
                    arr[--x][y] += 1;
                }else if(gps == 'E'){
                    arr[x][++y] += 1;
                }else if( gps == 'W'){
                    arr[x][--y] += 1;
                }
            }


        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
