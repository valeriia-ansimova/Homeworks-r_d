package homework13;

public class Student extends Human {

    @Override
    void sayName() {
        System.out.println("I'm student. My name is " + this.getFirstName() + " " + this.getLastName());
    }

    public void studying() {
        System.out.println("I'm studying");
    }

    @Override
    public String toString() {
        return "Student{} " + super.toString();
    }
}
