package cc.phil.humanproject;

public abstract class Human {
    // Membervariables
    //
    private String name;
    private int age;

    //Constructor
    //
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methodes
    //
    public void doEat(String foodName) {
        System.out.println(name + " isst gerade " + foodName);
    }

    public void doSleep() {
        System.out.println(name + " schläft gerade");
    }

    // Getter/Setter
    //
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
