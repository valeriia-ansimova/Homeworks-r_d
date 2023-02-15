package homework10;

public class OopFirstRunner {

    public static void main(String[] args) {
        workWithSchool();
        workWithArray();
    }

    private static void workWithSchool() {
        Student student1 = new Student();
        student1.setName("Vasia");
        student1.setAge(35);
        student1.setSex("male");
        student1.setSuccessRating(0);

        System.out.println(student1);
        student1.doingHomework();
        System.out.println(student1);
        student1.studying();

        Teacher teacher1 = new Teacher();
        teacher1.setName("Oleksii");
        teacher1.setSex("male");
        teacher1.setSecondName("Kapustnyk");

        System.out.println(teacher1);
        teacher1.teach();

        Student student2 = new Student();
        student2.setName("Anna");
        student2.setSex("female");
        student2.setSuccessRating(0);

        System.out.println(student2);
        student2.doingHomework();
        student2.doingHomework();
        System.out.println(student2);
    }

    private static void workWithArray() {
        ArrayProcessor arrayProcessor = new ArrayProcessor();

        int[] newArray = arrayProcessor.createArray(10);
        arrayProcessor.printArray(newArray);
        arrayProcessor.sortArrayLowestToHiest(newArray);
        arrayProcessor.printArray(newArray);
        arrayProcessor.sortArrayHiestToLowest(newArray);
        arrayProcessor.printArray(newArray);
    }

}
