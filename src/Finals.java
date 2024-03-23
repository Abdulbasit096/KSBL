public class Finals {
    public static void main(String[] args) {
        butterfly(4);
    }

    public static void squareHollow(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if (i == 1 || i == n || j == 1 || j == n){
                System.out.print("* ");

                }else{
                System.out.print("  ");

                }
            }
            System.out.println();
        }
    }
    public static void numberTriangular(int n){
        for (int i=1; i<=n; i++) {
            for (int s=n; s>=i; s--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void numberIncreasing(int n){
        for (int i=1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void numberIncreasingReverse(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void numberChanging(int n){
        int num = 1;
        for (int i=1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void zeroOneTriangle(int n){
        for (int i=1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {

                if ((i+j) % 2 == 0){
                    System.out.print(1 +" ");

                }else{
                    System.out.print(0 +" ");
                }
            }
            System.out.println();
        }
    }
    public static void palindromeTriangular(int n) {

        for (int i = 1; i <= n; i++) {
            for (int s=1; s< 2* (n-i); s++){
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
                System.out.println();
        }
    }

    public static void rhombus(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void diamond(int n){
        for (int i=1; i<=n; i++){
            for (int s=n; s>i; s--){
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i=n-1; i>=1; i--){
            for (int s=n; s>i; s--){
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            for (int j=0; j<n; j++){
                System.out.print(" ");

            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n-1; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
