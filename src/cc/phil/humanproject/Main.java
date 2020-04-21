package cc.phil.humanproject;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Blum");
        Club club = new Club("Bayern München");

        printInstituteText(company);
        printInstituteText(club);

        company.doRecruiteMember(new OfficeEmployee("Otto", 49, "Backoffice"));
        company.doRecruiteMember(new OfficeEmployee("Sven", 27, "Backoffice"));

        company.doDissmissMember(1);

        humanDailyRoutine(company.getMember(0), "Käsfladen");

        officeEmployeeRoutine((OfficeEmployee) company.members.get(0));

        club.doRecruiteMember(new Forward("Hummels", 40, 15, "Links"));
        club.doRecruiteMember(new Goalkeeper("Neuer", 33, 1));
        club.doRecruiteMember(new Goalkeeper("Sommer", 28, 1));
        club.doRecruiteMember(company.getMember(0));  // This fails -> sout(name.get(..) + " ist kein Stürmer und kein ..

        humanDailyRoutine(club.members.get(0), "Schnitzel");
        humanDailyRoutine(club.members.get(1), "Pizza");

        forwardDataRoutine((Forward) club.members.get(0));
        forwardToScore((Forward) club.members.get(0));

        goalkeeperDataRoutine((Goalkeeper) club.members.get(1));
        goalkeeperToScore((Goalkeeper) club.members.get(1));
    }

    private static void humanDailyRoutine(Human human, String food) {
        System.out.println(human.getName());
        System.out.println(human.getAge());
        human.doEat(food);
        human.doSleep();
        System.out.println();
    }

    private static void officeEmployeeRoutine(OfficeEmployee officeEmployee) {
        officeEmployee.doPause();
        officeEmployee.doWork();
        System.out.println(officeEmployee.getDivision());
        System.out.println();
    }

    private static void forwardDataRoutine(Forward forward) {
        forward.doThrowIn();
        forward.doFoul();
        System.out.println(forward.toString() + " " + forward.getName() + " schiesst mit " + forward.getDominantFoot());
        System.out.println(forward.getName() + " Toranzahl: " + forward.getGoals());
        System.out.println(forward.getName() + " Medaillienanzahl: " + forward.getMedalCounter());
        System.out.println("Trikotnummer: " + forward.getTricotNumber());
        forward.doApplaud("Ole ole");
        forward.doExercise(60.5);
        System.out.println();
    }

    private static void forwardToScore(Forward forward) {
        for (int i = 0; i < 50; i++) {
            forward.shoot();
        }

        System.out.println("Toranzahl: " + forward.getGoals() + ", Medaillien: " + forward.getMedalCounter());
        System.out.println();
    }

    private static void goalkeeperDataRoutine(Goalkeeper goalkeeper) {
        goalkeeper.doPass();
        System.out.println(goalkeeper.toString() + " hält den Ball: " + goalkeeper.getIsHoldingBall());
        goalkeeper.setIsHoldingBall(true);
        System.out.println(goalkeeper.toString() + " hält den Ball: " + goalkeeper.getIsHoldingBall());
        System.out.println(goalkeeper.getName() + " gehaltene Bälle: " + goalkeeper.getProhibitGoals());
        System.out.println(goalkeeper.toString() + " Medaillenanzahl: " + goalkeeper.getMedalCounter());
        System.out.println("Trikotnummer: " + goalkeeper.getTricotNumber());
        goalkeeper.doExercise(120.35);
        System.out.println();
    }

    private static void goalkeeperToScore(Goalkeeper goalkeeper) {
        for (int i = 0; i < 50; i++) {
            goalkeeper.doProtect();
        }
        System.out.println("Gehaltene Bälle: " + goalkeeper.getProhibitGoals() + ", Medaillen: " + goalkeeper.getMedalCounter());
        System.out.println();
    }

    private static void printInstituteText(Institut institut) {
        System.out.println("Willkommen bei " + institut.getName());
        System.out.println();
    }
}
