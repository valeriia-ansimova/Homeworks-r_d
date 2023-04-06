package homework19;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Anna", 56),
                new Student("Viktor", 80),
                new Student("Viktoriia", 60),
                new Student("Petr", 70),
                new Student("Daniia", 75),
                new Student("Anton", 85),
                new Student("Kateryna", 55),
                new Student("Ivan", 10),
                new Student("Igor", 90),
                new Student("Alex", 65));

        List<Student> studentsSortedByName =students.stream()
                .sorted(new StudentNameComparator())
                .collect(Collectors.toList());

        List<Student> studentsSortedByAverageScore =students.stream()
                .sorted(new StudentAverageScoreComparator())
                .toList();

        students.forEach(System.out::println);
        System.out.println("-----------");
        studentsSortedByName.forEach(System.out::println);
        System.out.println("-----------");
        studentsSortedByAverageScore.forEach(System.out::println);
    }
}
