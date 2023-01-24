package homework5;

public class LogicalOperators {

    public static void main(String[] args) {
        int num1 = 111;
        int num2 = 18;
        graterNumber(num1, num2);
        smallestNumber(num1, num2);
        oddEvaluation(num1);
        oddEvaluation(num2);
    }

    private static void graterNumber(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("The largest number is " + num1);
        } else if (num1 < num2) {
            System.out.println("The largest number is " + num2);
        } else {
            System.out.println("The numbers are equal ");
        }
    }

    private static void smallestNumber(int num1, int num2) {
        if (num1 < num2) {
            System.out.println("The smallest number is " + num1);
        } else if (num1 > num2) {
            System.out.println("The smallest number is " + num2);
        } else {
            System.out.println("The numbers are equal ");
        }
    }

    private static void oddEvaluation(int num1) {
        int a = num1 % 2;
        if (a == 0) {
            System.out.println("The number is even");
        } else{
            System.out.println("the number is odd");
        }
    }
}





