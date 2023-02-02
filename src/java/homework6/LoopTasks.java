package homework6;

public class LoopTasks {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        int resFactorial = 1;
        for (int i = 1; i <= 7; i++){
            resFactorial = resFactorial * i;
        }
        System.out.println(resFactorial);

        int resSum = 1;
        int firstNumber = 0;
        int secondNumber = 1;
        while(resSum < 100) {
            System.out.println(resSum);
            resSum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = resSum;

        }

        }
    }
