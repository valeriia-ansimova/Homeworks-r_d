package homework8;

import java.util.Random;

public class ArrayHandler {

    public static void main(String[] args) {
        int length = 10;
        int[] arr = new int[length];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + ", ");
        }

        System.out.print("\n");
        int min = getMin(arr);
        System.out.println("Minimum number is " + min);
        int max = getMax(arr);
        System.out.println("Maximum number is " + max);
        int average = calculateAverage(arr);
        System.out.println("Arithmetic average is  " + average);
        int sum = sumArray(arr);
        System.out.println("Sum of array elements is " + sum);
    }

    public static int getMin(int[] arr) {
        int minNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNumber) {
                minNumber = arr[i];
            }
        }
        return minNumber;
    }

    public static int getMax(int[] arr) {
        int maxNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }
        return maxNumber;
    }

    private static int calculateAverage(int[] arr) {
        int sum = sumArray(arr);
        return sum / arr.length;
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }
}
