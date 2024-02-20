package deepenOne;

import java.util.Scanner;

public class GroupWordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i < n; i++){
            boolean isTrue = true;
            String str = sc.next();
            for(int j = 0; j < str.length()-1; j++){
                int cnt2 = 0;
                if(str.charAt(j) != str.charAt(j+1)){
                    cnt2 = j;
                    for(int k = j+2; k < str.length(); k++){
                        if(str.charAt(k) == str.charAt(j)){
                            isTrue = false;
                            break;
                        }
                    }
                    if(!isTrue){
                        break;
                    }else{
                        j = cnt2;
                    }
                }
            }
            if(isTrue){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
