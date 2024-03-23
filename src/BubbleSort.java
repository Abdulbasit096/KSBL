import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        try  {
            FileReader reader = new FileReader("new.txt");
            BufferedReader br = new BufferedReader(reader);
            String[] numsStr = br.readLine().split(",");
            br.close();
            int[] arr = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                arr[i] = Integer.parseInt(numsStr[i]);
            }
            for (int i=0; i <arr.length; i++){
                for (int j=0; j<arr.length-1; j++){
                    if (arr[j] > arr[j+1]){
                        int temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            for (int n: arr){
                System.out.print(n + " ");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


}
