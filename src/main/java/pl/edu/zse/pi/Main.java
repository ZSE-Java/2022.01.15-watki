package pl.edu.zse.pi;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int allPoints = 2_000_000_000;
        int circlePoints = 0;

        Random random = new Random();

        long timeStart = System.currentTimeMillis();
        for(int i = 0; i < allPoints; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();

            double distance = Math.sqrt((x*x) + (y*y));

            if(distance < 1.0) {
                circlePoints++;
            }
        }

        double pi = (4.0 * (double) circlePoints) / (double) allPoints;

        long endTime = System.currentTimeMillis();
        System.out.println(pi);
        System.out.println(endTime - timeStart);
    }
}
