package pl.edu.zse.max;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static int[] tab = new int[200000000];
    public static List<Integer> results = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();

        for(int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(2000000000);
        }

        /*long startTime = System.currentTimeMillis();
        int max = tab[0];

        for(int element : tab) {
            if(element > max) {
                max = element;
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println(max);
        System.out.println(endTime - startTime);*/

        long startTime = System.currentTimeMillis();
        Thread t1 = new Thread(
                new MaxThread(0,50000000));
        Thread t2 = new Thread(
                new MaxThread(50000000, 100000000));
        Thread t3 = new Thread(
                new MaxThread(100000000,150000000));
        Thread t4 = new Thread(
                new MaxThread(150000000, 200000000));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        int max = Main.results.get(0);
        for(int i = 1; i < Main.results.size(); i++) {
            if(max < Main.results.get(i)) {
                max = Main.results.get(i);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(max);
        System.out.println(endTime - startTime);
    }
}
