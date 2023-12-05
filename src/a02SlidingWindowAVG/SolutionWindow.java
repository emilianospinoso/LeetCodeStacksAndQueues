package a02SlidingWindowAVG;

import java.util.LinkedList;
import java.util.Queue;

public class SolutionWindow {
   static Queue<Integer> q1 = new LinkedList<>();
    static int window =3;

    public static void main(String[] args) {
        SolutionWindow solution = new SolutionWindow(); // Crear una instancia de la clase Solution
        solution.push(3);
        System.out.println("Elementos en q1: " + q1);
        solution.push(1);
        System.out.println("Elementos en q1: " + q1);
        solution.push(10);
        System.out.println("Elementos en q1: " + q1);
        solution.push(3);
        System.out.println("Elementos en q1: " + q1);
        solution.push(5);
        System.out.println("Elementos en q1: " + q1);

    }

    // Push element x into stack and return sum of the last[WINDOW] items of the queue
    public static int push(int x) {

        int sum=0;
        q1.add(x);
        while (q1.size() > window) {
            q1.remove();
        }

        for (int num:q1) {
            sum+=num;
            sum=sum/window;

        }
        System.out.println(sum);
        return sum;
    }

}
