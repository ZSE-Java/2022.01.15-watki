package pl.edu.zse.notyfikacje;

public class Reciever implements Runnable {

    @Override
    public void run() {
        try {
            synchronized (Main.communicationChannel) {
                System.out.println("Zaczynam czekać");
                while (!Main.flag) {
                    Main.communicationChannel.wait();
                }
                System.out.println("Odebrałem sygnał");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
