package cc.phil.humanproject;

public class Company extends Institut {
    // Constructor
    //
    public Company(String name) {
        super(name);
    }

    @Override
    public void doRecruiteMember(Human human) {
        if (human instanceof OfficeEmployee){
            members.add(human);
        } else {
            System.out.println(human.getName() + " ist kein Büroarbeiter");
        }
    }
}
