package Assignments_and_Quizes.Assignment1;

public class Game {

    private final Player player1;
    private final Player player2;

    private int rounds;

    public Game(Player p1, Player p2){
        this.player1 = p1;
        this.player2 = p2;
        this.rounds = 0;
    }


    public String playGame(){
        System.out.println("Dice game started");
        System.out.printf("Player 1: %s\n",this.player1.getPlayerName());
        System.out.printf("Player 2: %s\n",this.player2.getPlayerName());
        while (rounds != 5){
            System.out.printf("\n\nRound %d\n\n",this.rounds+1);
            int p1Dice = this.player1.throwDice();
            int p2Dice = this.player2.throwDice();
            System.out.printf("%s rolled %d\n",this.player1.getPlayerName(),p1Dice);
            System.out.printf("%s rolled %d\n",this.player2.getPlayerName(),p2Dice);
            if (p1Dice  >p2Dice){
                this.player1.setNumOfWins(this.player1.getNumOfWins()+1);
                System.out.printf("%s won this round\n",this.player1.getPlayerName());
            }else if(p2Dice>p1Dice) {
                this.player2.setNumOfWins(this.player2.getNumOfWins()+1);
                System.out.printf("%s won this round\n",this.player2.getPlayerName());
            }else{
                System.out.println("Round tied");
            }
            System.out.printf("%s : %d vs %s : %d\n",this.player1.getPlayerName(),this.player1.getNumOfWins(),this.player2.getPlayerName(),this.player2.getNumOfWins());
            this.rounds++;
        }


        if (this.player1.getNumOfWins() > this.player2.getNumOfWins()){
            return this.player1.getPlayerName() + " won the game";
        }else{
            return this.player2.getPlayerName() + " won the game";
        }
    }

}
