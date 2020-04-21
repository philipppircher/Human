package cc.phil.humanproject;

public class OfficeEmployee extends Human {
    // Membervariables
    //
    private boolean isWorking;
    private String division;

    // Constructor
    //
    public OfficeEmployee(String name, int age, String division) {
        super(name, age);
        this.division = division;
    }

    // Methodes
    //
    public void doWork() {
        isWorking = true;
        System.out.println(getName() + " arbeitet: " + isWorking);
    }

    public void doPause() {
        isWorking = false;
        System.out.println(getName() + " pausiert, arbeiten: " + isWorking);
    }

    @Override
    public String toString() {
        return "BüroAngestellte/r";
    }

    // Getter
    public String getDivision() {
        return division;
    }
}
