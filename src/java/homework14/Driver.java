package homework14;

public class Driver extends Human implements Driveable {

    public void startMoving(){
        System.out.println("The car is going");
    }

    public void stopMoving(){
        System.out.println("The car stopped");
    }

    @Override
    public String toString() {
        return "Driver{} " + super.toString();
    }
}
