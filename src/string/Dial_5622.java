package string;

import java.util.Scanner;

public class Dial_5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 65;
        String str = sc.next();
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            switch (str.charAt(i)){
                case 'A','B','C': sum += 3; break;
                case 'D', 'E','F': sum += 4; break;
                case 'G', 'H','I': sum += 5; break;
                case 'J', 'K','L': sum += 6; break;
                case 'M', 'N','O': sum += 7; break;
                case 'P', 'Q','R','S': sum += 8; break;
                case 'T', 'U','V': sum += 9; break;
                case 'W','X', 'Y','Z': sum += 10; break;

            }
        }
        System.out.print(sum);

    }
}
