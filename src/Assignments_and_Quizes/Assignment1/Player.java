package Assignments_and_Quizes.Assignment1;

public class Player {

    private final String playerName;

    private int numOfWins;

    public Player(String playerName){
        this.playerName = playerName;
        this.numOfWins = 0;
    }

    public int throwDice(){
        return (int)(Math.floor(Math.random()*6)+1);
    }


    public int getNumOfWins() {
        return numOfWins;
    }

    public void setNumOfWins(int numOfWins) {
        this.numOfWins = numOfWins;
    }

    public String getPlayerName() {
        return playerName;
    }

}
