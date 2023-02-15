package homework10;

public class Student {
    private String name;
    private String lastName;
    private int age;
    private String sex;
    private int successRating;

    public Student() {
    }

    public Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Student(String name, String lastName, int age, String sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getSuccessRating() {
        return successRating;
    }

    public void setSuccessRating(int successRating) {
        this.successRating = successRating;
    }

    public void studying() {
        System.out.println("Attended the lecture");
    }

    public void doingHomework() {
        this.successRating = this.successRating + 1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", successRating='" + successRating + '\'' +
                '}';
    }

}
