package homework27;

import java.util.Random;

public class DigitsGenerator implements Runnable {

    @Override
    public void run() {
        int nextInt = 0;
        while (nextInt != 5) {
            nextInt = new Random().nextInt(1, 11);
            System.out.println(nextInt);
        }
        Thread.currentThread().interrupt();
    }
}
