package pl.edu.zse.join;

public class Main {

    public static int value = 0;
    public static Object lock = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(new Incrementator());
        Thread t2 = new Thread(new Incrementator());
        Thread t3 = new Thread(new Incrementator());

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {

        }

        System.out.println(value);
    }
}
