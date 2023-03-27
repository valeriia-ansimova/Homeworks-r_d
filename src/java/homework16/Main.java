package homework16;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        NumberSaver numberSaver = new NumberSaver();

        numberSaver.addToLongList(257);
        numberSaver.addToLongList(6852);
        numberSaver.addToLongList(3);

        numberSaver.addToShortList(3);
        numberSaver.addToShortList(53);
        numberSaver.addToShortList(33434);

        System.out.println(numberSaver);

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Vasya-1"));
        students.add(new Student("Vasya-2"));
        students.add(new Student("Vasya-3"));
        students.add(new Student("Vasya-4"));
        students.add(new Student("Vasya-5"));
        students.add(new Student("Vasya-177"));

        System.out.println(students);
    }
}
