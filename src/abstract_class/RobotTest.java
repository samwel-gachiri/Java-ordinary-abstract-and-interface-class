package abstract_class;

public class RobotTest {
    public static void main(String[] args) {
        WeldingRobot myWeldingRobot = new WeldingRobot();
        myWeldingRobot.start();
        myWeldingRobot.performTask();
    }
}
