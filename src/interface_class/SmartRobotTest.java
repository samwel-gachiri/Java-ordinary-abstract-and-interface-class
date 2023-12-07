package interface_class;

public class SmartRobotTest {
    public static void main(String []args){
        SmartCleaningRobot smartCleaningRobot = new SmartCleaningRobot();
        smartCleaningRobot.navigate();
        smartCleaningRobot.performTask();
    }
}