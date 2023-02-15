package homework10;

import java.util.Random;

public class ArrayProcessor {

    public  int[] createArray(int length) {
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    public void  printArray(int[] array){
        System.out.println();
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public void sortArrayLowestToHiest(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            for (int j = i; j < array.length - 1; j++){
                if ( array[i] > array[j + 1]){
                    int temp = array[i];
                    array[i] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void sortArrayHiestToLowest(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            for (int j = i; j < array.length - 1; j++){
                if ( array[i] < array[j + 1]){
                    int temp = array[i];
                    array[i] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "ArrayProcessor{}";
    }

}
