package Assignments_and_Quizes.Assignment1;

public class Main {
    public static void main(String[] args) {
        //Q4
        Player player1 = new Player("John");
        Player player2 = new Player("Cena");

        Game game = new Game(player1,player2);
        System.out.println("\n\n"+game.playGame().toUpperCase());
        //        Question 3
//        try{
//            Distance distance1 = new Distance(4,"feet");
//            Distance distance2 = new Distance(2,"YARD");
//            System.out.println(distance1.addDistance(distance2));
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }


        // Question 2
//        Rectangle rect1 = new Rectangle(new Point(-2, 4), new Point(3, -5));
//        System.out.println("RECTANGLE 1");
//        System.out.println("Area: " + rect1.getArea());
//        System.out.println("Perimeter: " + rect1.getPerimeter());
//        System.out.println("Is square? " + rect1.isSquare());
//
//        Rectangle rect2 = new Rectangle(new Point(-10, 6), new Point(5, 2));
//        System.out.println("\n\nRECTANGLE 2");
//        System.out.println("Area: " + rect2.getArea());
//        System.out.println("Perimeter: " + rect2.getPerimeter());
//        System.out.println("Is square? " + rect2.isSquare());
//
//        Rectangle rect3 = new Rectangle(new Point(-2, 2), new Point(-1, 1));
//        System.out.println("\n\nRECTANGLE 3");
//        System.out.println("Area: " + rect3.getArea());
//        System.out.println("Perimeter: " + rect3.getPerimeter());
//        System.out.println("Is square? " + rect3.isSquare());






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
