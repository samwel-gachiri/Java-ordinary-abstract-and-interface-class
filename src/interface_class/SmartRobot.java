package interface_class;

public interface SmartRobot {
    void navigate();

    void performTask();
}

class SmartCleaningRobot implements SmartRobot{

    @Override
    public void navigate() {
        System.out.println("navigation in progress...");
    }

    @Override
    public void performTask() {
        System.out.println("Smart cleaning in progress...");
    }
}

