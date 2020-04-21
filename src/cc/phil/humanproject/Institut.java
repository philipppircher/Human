package cc.phil.humanproject;

import java.util.ArrayList;

public abstract class Institut {
    // Membervariables
    //
    private String name;
    public ArrayList<Human> members = new ArrayList<>();

    // Constructor
    //
    public Institut(String name) {
        this.name = name;
    }

    // Methodes
    //
    public void doRecruiteMember(Human human) {
        members.add(human);
    }

    public void doDissmissMember(int index) {
        System.out.println(members.get(index).getName() + " wurde entlassen");
        System.out.println();
        members.remove(index);
    }

    // Constructor
    //
    public Institut(String name, double capital) {
        this.name = name;
    }

    // Getter/Setter
    //
    public String getName() {
        return name;
    }

    public Human getMember(int index) {
        return members.get(index);
    }
}
