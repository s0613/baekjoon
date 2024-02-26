package Math;

import java.util.Scanner;

public class SumofDivisor_9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int cmd = sc.nextInt();
            int sum = 0;
            int[] arr = new int[cmd/2+1];
            if(cmd == -1) break;
            for(int i = 1; i <= cmd/2; i++){
                if(cmd % i == 0){
                    sum += i;
                    arr[i] = i;
                }
            }
            if(sum == cmd){
                System.out.print(cmd + " = 1");
                for(int i = 0; i < cmd/2 + 1; i++){
                    if(arr[i] != 0 && arr[i] != 1){
                        System.out.print(" + "+ arr[i]);
                    }
                }
                System.out.println();
            }else {
                System.out.println(cmd + " is NOT perfect.");
            }
        }
    }
}
