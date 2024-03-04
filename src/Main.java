import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        int cnt = 0;
        if(n == 1) {
            System.out.println(0);
            System.out.println(0);
            return;
        }
        for(int i = 1; i <= n-1; i++){
            for(int j = i + 1; j <= n; j++){
                cnt++;
            }
        }
        System.out.println(cnt);
        System.out.print(2);
    }
}