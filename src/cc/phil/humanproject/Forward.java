package cc.phil.humanproject;

public class Forward extends SoccerPlayer {
    // Membervariables
    //
    private String dominantFoot;
    private int goals;

    // Constructor
    //
    public Forward(String name, int age, int tricotNumber, String dominantFoot) {
        super(name, age, tricotNumber);
        this.dominantFoot = dominantFoot;
    }

    // Methodes
    //
    public void shoot() {
        if (getRandomSuccessPoints() == 1) {
            System.out.println("Tooor!!");
            doApplaud("Ole ole ole ole");
            goals++;
        } else {
            System.out.println("Daneben geschossen");
        }
    }

    @Override
    public String toString() {
        return "Stürmer";
    }

    public void doThrowIn() {
        System.out.println(toString() + " " + getName() + " wirft ein");
    }

    // Getter/Setter
    //
    public String getDominantFoot() {
        return dominantFoot;
    }

    public int getGoals() {
        return goals;
    }
}
