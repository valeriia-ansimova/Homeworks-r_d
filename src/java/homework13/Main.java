package homework13;

public class Main {
    public static void main(String[] args) {

        Human teacher1 = new Teacher();
        teacher1.setFirstName("Boris");
        teacher1.setLastName("Johnson");
        teacher1.setSex("male");
        teacher1.setAge(50);

        Human student1 = new Student();
        student1.setFirstName("Olena");
        student1.setLastName("Ivanova");
        student1.setSex("female");
        student1.setAge(22);

        student1.goToUniversity();
        ((Student)student1).studying();
        student1.sayName();

        teacher1.sayName();
        teacher1.goToUniversity();
        ((Teacher)teacher1).teach();

        System.out.println(teacher1);
        System.out.println(student1);
    }
}
