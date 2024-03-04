package timeComplexity;

import java.util.Scanner;

public class AlgorithmClass4_24265 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();


        System.out.println(n*(n-1)/2);
        System.out.print(2);
    }
}

/**
 * 내부 for (n-1) + (n-2) + (n-3) +...+ 1 = n(n-1)/2
 */
