package pl.edu.zse.pi2;

import java.util.Random;

public class PointGenerator implements Runnable {

    int pointsToGenerate;
    Random random = new Random();

    public PointGenerator(int pointsToGenerate) {
        this.pointsToGenerate = pointsToGenerate;
    }

    @Override
    public void run() {
        int circlePoints = 0;
        for(int i = 0; i < pointsToGenerate; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();

            double distance = Math.sqrt((x*x) + (y*y));

            if(distance < 1.0) {
                circlePoints++;
            }
        }

        Main.threadCirclePoints.add(circlePoints);
    }
}
