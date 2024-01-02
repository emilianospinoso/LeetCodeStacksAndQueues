package a37WorkersBikes;

public class TestsWitsTwoArrays2d {


    public static void main(String[] args) {
        int[][] workers = {{0, 0}, {2, 4}};
        int[][] bikes = {{1, 2}, {3, 3}};
        System.out.println(assignBikes(workers, bikes));
    }

    static int assignBikes(int[][] workers, int[][] bikes) {
        int sum = 0;
        for (int i = 0; i < workers.length; i++) {
            sum += returnDistances(workers[i], bikes[i]);
        }
        return sum;
    }

    static int returnDistances(int[] worker, int[] bike) {
        //El resultado de la diferencia ABSOLUTA es NO negativa.
        return Math.abs(worker[0] - bike[0]) + Math.abs(worker[1] - bike[1]);

    }
}
