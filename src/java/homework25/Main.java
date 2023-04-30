package homework25;

public class Main {

    public static void main(String[] args) {
        MyThreadExample myThreadExample = new MyThreadExample();

        Thread thread1 = new Thread(myThreadExample);
        Thread thread2 = new Thread(myThreadExample);

        thread1.start();
        thread2.start();
    }
}
