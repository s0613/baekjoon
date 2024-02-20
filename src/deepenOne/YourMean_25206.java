package deepenOne;

import java.util.Scanner;

public class YourMean_25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double sum = 0.0;
        Double sumCredit = 0.0;
        for(int i = 0; i < 20; i++){
            String str = sc.next();
            Double credit = sc.nextDouble();
            String a = sc.next();
            if(a.equals("P")  ){
                continue;
            }
            sumCredit += credit;

            if(a.equals("A+")){
                sum += credit*4.5;
            }
            else if(a.equals("A0")){
                sum += credit*4.0;
            }else if(a.equals("B+")){
                sum += credit*3.5;
            }
            else if(a.equals("B0")){
                sum += credit*3.0;
            }
            else if(a.equals("C+")  ){
                sum += credit*2.5;
            }
            else if(a.equals("C0")  ){
                sum += credit*2.0;
            }
            else if(a.equals("D+")  ){
                sum += credit*1.5;
            }
            else if(a.equals("D0")  ){
                sum += credit*1.0;
            }
            else if(a.equals("F")  ){
                sum += credit*0.0;
            }
        }
        System.out.println(sum/sumCredit);
    }
}
