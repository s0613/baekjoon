package bruteForce;

import java.util.Scanner;

public class MovieDirectorShom_1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        String str = "666";
        while(cnt != n){
            int temp = Integer.parseInt(str);
            temp++;
            str = String.valueOf(temp);
            if(str.contains("666")){
                cnt++;
            }
        }
        System.out.print(str);
    }
}
