package cc.phil.humanproject;

public abstract class Athlet extends Human {
    // Membervariables
    //
    private int scoreForMedal;
    private int medalCounter;

    // Constructor
    //
    public Athlet(String name, int age) {
        super(name, age);
    }

    // Methodes
    //
    public void doExercise(double timeInMinutes) {
        System.out.println("ich übe " + timeInMinutes + " minuten");
    }

    public void doApplaud(String text) {
        System.out.println(this.toString() + " applaudiert: " + text);
    }

    // Getter/Setter
    //
    public void setScoreForMedal() {
        this.scoreForMedal++;

        if (scoreForMedal == 5) {
            System.out.println("Medaille erhalten");
            System.out.println("Gesamt Medaillen: " + ++medalCounter);
            scoreForMedal = 0;
        }
    }

    public int getMedalCounter() {
        return medalCounter;
    }
}
