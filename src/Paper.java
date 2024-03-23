import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Paper {

    public static void main(String[] args) {
        powerTable(2,6,10);
    }

    public static void powerTable(int num , int start, int end) {
        if (start > end){
            System.out.println("Invalid range.");
        }else {
            for (int i = start; i<=end; i++){
                System.out.println(num + " to the power " + i + " = " + (int)Math.pow(num,i));
            }
        }

    }

    public static void toggleCase(String s){
        String newStr = "";
        String lower = s.toLowerCase();
        for (int i=0; i<lower.length(); i++){
            if (lower.charAt(i) == 'a' || lower.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                newStr += lower.charAt(i);
            }else{
                newStr += lower.charAt(i) -32;
            }


        }
        System.out.println(newStr);
    }


    public static void triangularMatrix(int[][] mat){
        
    }

}
