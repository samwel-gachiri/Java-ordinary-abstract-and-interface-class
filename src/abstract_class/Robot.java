package abstract_class;

public abstract class Robot{
    public void start(){
        System.out.println("clean");
    }
    public abstract void performTask();
}

class WeldingRobot extends Robot{
    @Override
    public void performTask(){
        System.out.println("Performing task!");
    }
}