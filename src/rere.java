import java.util.Scanner;

public class rere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int min = 1000;
        for(int i = x-1; i < x1; i++){
            for(int j = y-1; j < y1; j++){
                if(min > arr[i][j]) min = arr[i][j];
            }
        }
        System.out.println(min);
    }
}
