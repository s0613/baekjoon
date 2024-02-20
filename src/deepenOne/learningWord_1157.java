package deepenOne;
import java.util.Arrays;
import java.util.Scanner;

public class learningWord_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toUpperCase();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        str = String.valueOf(chars);
        int[] arr = new int[str.length()];
        int arrCnt = 0;
        int max = -1;
        char maxChar = str.charAt(0);
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                arr[arrCnt] += 1;
            }else{
                arrCnt++;
            }
            if(arr[arrCnt] > max){
                max = arr[arrCnt];
                maxChar = str.charAt(i);
            }
        }
        
        boolean isTrue = true;
        int duplication = 0;
        for(int i = 0; i < str.length(); i++){
            if(arr[i] == max){
                duplication += 1;
                if(duplication > 1) {isTrue =false; break;}
            }
        }

        if(isTrue){
            System.out.print(maxChar);
        }else{
            System.out.println("?");
        }
    }
}
