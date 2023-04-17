package homework22;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        int squaring = squaring(nextInt);
        System.out.println(squaring);
    }

    public static int squaring(int number) {
        if (number >= 0) {
            return number * number;
        } else {
            throw new IllegalArgumentException("Enter a number greater than zero");
        }

    }

}
