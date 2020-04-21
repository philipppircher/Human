package cc.phil.humanproject;

import java.util.Random;

public abstract class SoccerPlayer extends Athlet {
    // Membervariables
    //
    private int tricotNumber;
    private int foulCounter;

    // Constructor
    //
    public SoccerPlayer(String name, int age, int tricotNumber) {
        super(name, age);
        this.tricotNumber = tricotNumber;
    }

    // Methodes
    //
    public void doFoul() {
        System.out.println("Spieler " + getName() + ", " + tricotNumber + ", macht ein Foul");
        System.out.println("Insgesamt Anzahl Fouls: " + ++foulCounter);
    }

    public int getRandomSuccessPoints() {
        Random random = new Random();
        int number = random.nextInt(10);
        int value = 0;

        if (number % 2 == 0) {
            value++;
            setScoreForMedal();
        }
        return value;
    }

    // Getter
    //
    public int getTricotNumber() {
        return tricotNumber;
    }

}
