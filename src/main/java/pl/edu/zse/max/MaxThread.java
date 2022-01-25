package pl.edu.zse.max;

public class MaxThread implements Runnable {
    int startIndex;
    int stopIndex;

    public MaxThread(int startIndex, int stopIndex) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
    }

    public void run() {
        int max = Main.tab[0];

        for(int i = this.startIndex; i < this.stopIndex; i++) {
            if(Main.tab[i] > max) {
                max = Main.tab[i];
            }
        }

        Main.results.add(max);
    }
}
