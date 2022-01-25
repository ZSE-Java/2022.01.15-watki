package pl.edu.zse.notyfikacje;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static Object communicationChannel = new Object();
    public static boolean flag = false;

    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);

        executorService.schedule(new Reciever(), 0, TimeUnit.SECONDS);
        executorService.schedule(new Sender(), 5, TimeUnit.SECONDS);

        executorService.shutdown();
    }
}
