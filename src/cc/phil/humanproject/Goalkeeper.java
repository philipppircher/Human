package cc.phil.humanproject;

public class Goalkeeper extends SoccerPlayer {
    // Membervariables
    //
    private int prohibitGoals;
    private boolean isHoldingBall;

    // Constructor
    //
    public Goalkeeper(String name, int age, int tricotNumber) {
        super(name, age, tricotNumber);
    }

    // Methodes
    //
    public void doPass() {
        System.out.println(toString() + " " + getName() + " gibt pass ins Mittelfeld");
    }

    public void doProtect() {
        if (getRandomSuccessPoints() == 1) {
            System.out.println(this.toString() + " hält den Ball");
            prohibitGoals++;
        } else {
            System.out.println("Nicht gehalten");
        }
    }

    @Override
    public String toString() {
        return "Torwart";
    }

    // Getter/Setter
    //
    public boolean getIsHoldingBall() {
        return isHoldingBall;
    }

    public void setIsHoldingBall(boolean holdingBall) {
        this.isHoldingBall = holdingBall;
    }

    public int getProhibitGoals() {
        return prohibitGoals;
    }
}
