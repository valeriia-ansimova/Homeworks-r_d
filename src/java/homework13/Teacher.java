package homework13;

public class Teacher extends Human {

    @Override
    void sayName() {
        System.out.println("I'm teacher. My name is " + this.getFirstName() + " "+this.getLastName());
    }

    public void teach() {
        System.out.println("I'm teach students");
    }

    @Override
    public String toString() {
        return "Teacher{} " + super.toString();
    }
}
