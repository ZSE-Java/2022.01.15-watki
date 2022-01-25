package pl.edu.zse.pi2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> threadCirclePoints = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        int allPoints = 2_000_000_000;
        int circlePoints = 0;

        //System.out.println(-5.0/0.0);

        long startTime = System.currentTimeMillis();
        Thread t1 = new Thread(new PointGenerator(allPoints/4));
        Thread t2 = new Thread(new PointGenerator(allPoints/4));
        Thread t3 = new Thread(new PointGenerator(allPoints/4));
        Thread t4 = new Thread(new PointGenerator(allPoints/4));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        for (int element : threadCirclePoints) {
            circlePoints += element;
        }

        double pi = (4.0 * (double) circlePoints) / (double) allPoints;
        long endTime = System.currentTimeMillis();
        System.out.println(pi);
        System.out.println(endTime - startTime);
    }
}
