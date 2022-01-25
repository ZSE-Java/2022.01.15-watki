package pl.edu.zse.join;

public class Incrementator implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Incrementator.increment();
        }
    }

    private static synchronized void increment() {
        Main.value++;
    }
}
