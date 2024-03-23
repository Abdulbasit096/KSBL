package Assignments_and_Quizes.Quiz1;

public class Glass {
    public int liquidLevel = 200;



    public void drink(int ml) {
        if (ml > 0 && ml <= liquidLevel) {
            liquidLevel -= ml;
            System.out.println("You drank " + ml + " ml. Assignments_and_Quizes.Quiz1.Glass now has " + liquidLevel + " ml.");
        } else {
            System.out.println("Invalid amount. Assignments_and_Quizes.Quiz1.Glass has " + liquidLevel + " ml.");
        }
    }

    // Method to refill the glass to 200 ml
    public void refill() {
        liquidLevel = 200;
        System.out.println("Assignments_and_Quizes.Quiz1.Glass refilled to 200 ml.");
    }
}