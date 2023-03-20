package homework17;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> hashNumbers = new HashSet<>();
        Set<Integer> linkedNumbers = new LinkedHashSet<>();
        Set<Integer> treeNumbers = new TreeSet<>();

        Random random = new Random();
        for ( int i = 0 ; i < 1000; i++){
           int randomNumber = random.nextInt(1,51);
            hashNumbers.add(randomNumber);
            linkedNumbers.add(randomNumber);
            treeNumbers.add(randomNumber);
        }

        System.out.println(hashNumbers);
        System.out.println(linkedNumbers);
        System.out.println(treeNumbers);
    }
}
