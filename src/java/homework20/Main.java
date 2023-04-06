package homework20;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> students = List.of(
                "Bond",
                "Walter",
                "Grimm",
                "Carrey",
                "Smith",
                "Grim",
                "Bond",
                "Carrey",
                "Smith",
                "Walter",
                "Bond",
                "Walter",
                "Grimm",
                "Carrey",
                "Smith",
                "Grim",
                "Bond",
                "Carrey",
                "Smith",
                "Walter");

        Map<String, Long> studentMap
                = students.stream()
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(studentMap);

        List<Integer> randomIntegers
                = new Random().ints(20, 0, 100)
                .boxed().toList();

        int resultSum = randomIntegers.stream()
                .reduce(0, Integer::sum);
        System.out.println(randomIntegers);
        System.out.println(resultSum);
    }
}
