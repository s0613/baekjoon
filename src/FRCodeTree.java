import java.util.Scanner;
public class FRCodeTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int x = 0;
        int y = 0;
        int sum = 0;
        for(int i = 0; i < m; i++){
            char cmd = sc.next().charAt(0);
            int po = sc.nextInt();
            for(int j = 0; j < po; j++){

                if(cmd == 'S'){
                    sum += arr[++x][y];
                }else if( cmd == 'N'){
                    sum += arr[--x][y];
                }else if(cmd == 'E'){
                    sum += arr[x][++y];
                }else if( cmd == 'W'){
                    sum += arr[x][--y];
                }
            }


        }
        System.out.println(sum);
    }
}
