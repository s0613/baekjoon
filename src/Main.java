import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str2 = sc.next();

        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuffer stringBuffer2 = new StringBuffer(str2);

        str = stringBuffer.reverse().toString();
        str2 = stringBuffer2.reverse().toString();


        int num = Integer.parseInt(str);
        int num2 = Integer.parseInt(str2);
        int max = num > num2 ? num : num2;
        System.out.print(max);

    }
}