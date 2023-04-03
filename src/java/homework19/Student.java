package homework19;

public class Student {

    private String name;
    private int averageScore;

    public Student(String name, int averageScore) {
        this.name = name;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
