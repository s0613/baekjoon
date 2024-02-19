package string;

import java.util.Scanner;
public class SearchAlphabet_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int j = 0; j < 26; j++){
            char n = 'a';
            for(int i = 0; i < str.length(); i++){

                if(str.charAt(i) == n+j){
                    System.out.print(i + " ");
                    break;
                }else if(i == str.length()-1){
                    System.out.print(-1 + " ");
                    break;
                }
            }

        }



    }
}
