package pl.edu.zse;

public class LepszyWatek implements Runnable {

    int threadNumber;

    public LepszyWatek(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Watek: " + this.threadNumber + " i: " + i);
        }
    }
}
