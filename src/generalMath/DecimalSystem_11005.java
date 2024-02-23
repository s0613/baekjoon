package generalMath;

import java.util.Scanner;

public class DecimalSystem_11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num = sc.nextInt();
        String str = "";
        while(true){
            if(num1 / num == 0 && num1 % num == 0) break;
            int temp = num1 % num;
            num1 /= num;
            if(temp > 9) str += (char)(temp+55);
            else str += (char)(temp+48);
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        str = stringBuffer.reverse().toString();
        System.out.println(str);
    }
}
