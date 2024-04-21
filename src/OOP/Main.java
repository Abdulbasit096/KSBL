package OOP;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tries = 5;
        Scanner sc = new Scanner(System.in);
        String[][] boxes = new String[7][7];
        for (int i=0; i<boxes.length; i++){
            for (int j=0; j<boxes[i].length; j++){
                boxes[i][j] = "empty";
            }
        }
        int randomRow = (int) Math.floor(Math.random()*7);
        int randomCol = (int) Math.floor(Math.random()*7);
        boxes[randomRow][randomCol] = "Gift";
        System.out.println(Arrays.deepToString(boxes));
        System.out.println(randomCol);
        System.out.println(randomRow);
        while (tries != 0){
            System.out.println("Choose a row from 1-7: ");
            int userRow = sc.nextInt();
            System.out.println("Choose a col from 1-7: ");
            int userCol = sc.nextInt();
            if (randomRow==userRow && randomCol==userCol){
                System.out.println("Congrats you got the gift");
                break;
            }else if ((randomRow == userRow && randomCol != userCol) || (randomCol==userCol && randomRow != userRow)){
                System.out.println("Close try again ! You guessed one option wrong");

            }else{
                System.out.println("Try again ! You guessed both options wrong");
            }

            tries--;
            System.out.println(tries +" tries left");
        }


    }
}

