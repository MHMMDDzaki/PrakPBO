import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(50);

        // Process 1000 data using multiple threads
        for (int i = 1; i <= 1000; i++) {


            Runnable worker = new MyRunnable(i);
            executorService.execute(worker);
        }

        // Shutdown the executor service
        executorService.shutdown();

        // Wait for all tasks to complete
        while (!executorService.isTerminated()) {
            // Do nothing, just wait
        }

        System.out.println("All data processing has finished.");
    }
}

class MyRunnable implements Runnable {
    private int data;
    public MyRunnable(int data) {
        this.data = data;
    }

    @Override
    public void run() {
        System.out.println("Processing data: " + data);
        // Perform data processing here

        System.out.println("Data processing complete: " + data);
    }
}