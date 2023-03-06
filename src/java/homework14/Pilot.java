package homework14;

public class Pilot extends Human implements Flyable {

    public void riseIntoTheAir(){
        System.out.println("The plane is in fly");
    }

    public void landing(){
        System.out.println("The plane is landed");
    }

    @Override
    public String toString() {
        return "Pilot{} " + super.toString();
    }
}
