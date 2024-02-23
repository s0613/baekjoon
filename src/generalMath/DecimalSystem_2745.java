package generalMath;

import java.util.Scanner;

public class DecimalSystem_2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = sc.nextInt();
        int sum = 0;
        int j = 0;
        for(int i = str.length()-1; i >= 0; i--){
            int temp = (int)str.charAt(i);
            if(temp >= 65){
                temp -= 55;
            }else temp -= 48;
            sum += temp * Math.pow(num, j);
            j++;
        }
        System.out.print(sum);
    }
}
