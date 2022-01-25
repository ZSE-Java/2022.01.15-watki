package pl.edu.zse.notyfikacje;

public class Sender implements Runnable {


    @Override
    public void run() {
        try {
            synchronized (Main.communicationChannel) {
                System.out.println("Zaczynam działanie");
                Thread.sleep(2000);
                System.out.println("cos robie !!");
                Thread.sleep(2000);
                System.out.println("Dalej cos robie !!");
                Thread.sleep(2000);
                Main.flag = true;
                Main.communicationChannel.notifyAll();
                System.out.println("Wysłano notyfikacje");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
