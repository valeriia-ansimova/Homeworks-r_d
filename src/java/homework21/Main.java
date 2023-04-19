package homework21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isEnteredNumber = false;
        while (!isEnteredNumber) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter your number: ");
                int number = scan.nextInt();
                isEnteredNumber = true;
                System.out.println(number);
            } catch (InputMismatchException e) {
                System.out.println("InputMismatchException: You are entered invalid number");
            }
        }
    }
}
