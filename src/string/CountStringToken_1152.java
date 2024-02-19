package string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountStringToken_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        int cnt = stringTokenizer.countTokens();
        System.out.print(cnt);

    }
}
