import java.util.Arrays;

public class Matrices {
    public static void main(String[] args) {
        int[][] matA = {{1,2},{3,4,5}};
        int[][] matB = {{5,6},{7,8}};
        int[][] matC = new int[matA.length][matA[0].length];

            for (int i=0; i < matC.length; i++){
                for (int j=0; j < matC[i].length; j++){
                    matC[i][j] = matA[i][j] + matB[i][j];
                }
            }
            System.out.println(Arrays.deepToString(matC));
    }
}
