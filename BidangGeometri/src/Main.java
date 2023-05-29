import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {
        Connector connector = new Connector();
        try {
            ExecutorService executorService = Executors.newFixedThreadPool(50);
            RandomAccessFile file = new RandomAccessFile("data.txt", "rw");

            // Process 1000 data and write to file using multiple threads
//            for (int i = 1; i <= 1000; i++) {
//                Random random = new Random();
//                int randomNumber = random.nextInt(12) + 1;
//                Runnable worker = new Multithread(randomNumber, file);
//                executorService.execute(worker);
//            }

            // Process an upload data to mysql also write file using multiple threads
            for (int i = 1; i <= 50; i++) {
                Random random = new Random();
                int randomNumber = random.nextInt(12) + 1;
                Runnable worker = new Multithread(randomNumber, file);
                executorService.execute(worker);
            }

            // Shutdown the executor service
            executorService.shutdown();

            // Wait for all tasks to complete
            while (!executorService.isTerminated()) {
                // Do nothing, just wait
            }

            System.out.println("All data processing has finished.");

            file.close();
            System.out.println("Data have been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}