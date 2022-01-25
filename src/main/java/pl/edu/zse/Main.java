package pl.edu.zse;

public class Main {
    public static void main(String[] args) {
        /*Watek w = new Watek(1);
        Watek w2 = new Watek(2);
        w.start();
        w2.start();*/

        Thread t1 = new Thread(new LepszyWatek(1));
        Thread t2 = new Thread(new LepszyWatek(2));

        t1.start();
        t2.start();
    }
}
