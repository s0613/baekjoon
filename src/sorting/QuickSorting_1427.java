package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class QuickSorting_1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        for (String a : str) {
            System.out.print(a);
        }
    }
}
