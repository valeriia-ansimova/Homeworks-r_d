package homework14;

public class Main {
    public static void main(String[] args) {

        Driveable driver1 = new Driver();
        driver1.startMoving();
        driver1.stopMoving();

        Flyable pilot1 = new Pilot();
        pilot1.riseIntoTheAir();
        pilot1.landing();
    }
}
