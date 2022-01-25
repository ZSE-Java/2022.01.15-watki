package pl.edu.zse.executors;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService singleExecutor = Executors.newSingleThreadExecutor();

        singleExecutor.submit(new Watek(1));
        singleExecutor.submit(new Watek(2));
        singleExecutor.submit(new Watek(3));

        singleExecutor.shutdown();

        ExecutorService multiExecutor = Executors.newFixedThreadPool(4);

        multiExecutor.submit(new Watek(4));
        multiExecutor.submit(new Watek(5));
        multiExecutor.submit(new Watek(6));
        multiExecutor.submit(new Watek(7));
        multiExecutor.submit(new Watek(8));
        multiExecutor.submit(new Watek(9));

        multiExecutor.shutdown();

        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(4);

        scheduledExecutorService.schedule(new Watek(10), 5, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(11), 0, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();

    }
}
