package cc.phil.humanproject;

public class Club extends Institut {
    // Constructor
    //
    public Club(String name) {
        super(name);
    }

    @Override
    public void doRecruiteMember(Human human) {
        if (human instanceof Forward) {
            members.add(human);
        }else if (human instanceof Goalkeeper){
            members.add(human);
        } else {
            System.out.println(human.getName() + " ist kein Stürmer und kein Torwart");
        }
    }
}
