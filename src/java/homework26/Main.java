package homework26;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Callable<Integer>> tasks = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            tasks.add(new MyCallable());
        }

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
        List<Future<Integer>> futures = fixedThreadPool.invokeAll(tasks);
        for (Future<Integer> integerFuture : futures) {
            System.out.println(integerFuture.get());
        }

        fixedThreadPool.shutdown();
    }
}
