package Assignments_and_Quizes.Assignment1;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Question 2
        Rectangle rect1 = new Rectangle(new Point(4, 8), new Point(3, 4));
        System.out.println("RECTANGLE 1");
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());
        System.out.println("Is square? " + rect1.isSquare());

        Rectangle rect2 = new Rectangle(new Point(10, 6), new Point(5, 2));
        System.out.println("\n\nRECTANGLE 2");
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
        System.out.println("Is square? " + rect2.isSquare());






        // Question 1
//        BankAccount firstAcc = new BankAccount("PKMEZN001",4000);
//        BankAccount secondAcc = new BankAccount("PKMEZN002",2000);
//        BankAccount thirdAcc = new BankAccount("PKMEZN003",90000);
//
//        System.out.println("Account number --------------- Balance");
//        System.out.println(firstAcc.getAccNumber()+" --------------- Rs "+firstAcc.showBalance());
//
//        firstAcc.deposit(10000);
//        firstAcc.withdraw(9500);
//        firstAcc.withdraw(4000);
//        firstAcc.withdraw(100);
//
//        System.out.println("\n\n\n\nAccount number --------------- Balance");
//        System.out.println(secondAcc.getAccNumber()+" --------------- Rs "+secondAcc.showBalance());
//
//        secondAcc.deposit(10000);
//        secondAcc.withdraw(7500);
//        secondAcc.withdraw(4000);
//        secondAcc.withdraw(100);
//
//        System.out.println("\n\n\n\nAccount number --------------- Balance");
//        System.out.println(thirdAcc.getAccNumber()+" --------------- Rs "+thirdAcc.showBalance());
//
//        thirdAcc.deposit(10000);
//        thirdAcc.withdraw(95000);
//        thirdAcc.withdraw(4500);
//        thirdAcc.withdraw(100);
    }
}
