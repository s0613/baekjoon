package generalMath;

import java.util.Scanner;

public class MiddleMoveAlgorithm_2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int init = 2;
        for(int i = 0; i < n; i++){
            init = init*2 - 1;
        }
        System.out.println((int)Math.pow(init,2));
    }
    // 점의 개수는 한 변의 점 개수에 제곱이다
}
