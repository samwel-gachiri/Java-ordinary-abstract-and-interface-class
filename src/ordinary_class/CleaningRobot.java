package ordinary_class;

public class CleaningRobot {
    public void clean() {
        System.out.println("Cleaning in progress...");
    }

    public static void main(String[] args) {

        CleaningRobot cleaningRobot = new CleaningRobot();
        cleaningRobot.clean();
    }
}