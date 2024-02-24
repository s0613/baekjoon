package generalMath;

import java.util.Scanner;

public class SnailDreamUp_2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        int b = sc.nextInt();
        int v = sc.nextInt();
        Double vb = (v-a);
        Double ab = a-b;
        double n = Math.ceil(vb/ab);
        System.out.println((int)(n+1));
    }
}
