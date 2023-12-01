package a02ImplementStackUsingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();
    static int top;

    public static void main(String[] args) {
        Solution solution = new Solution(); // Crear una instancia de la clase Solution
        solution.push(3);
        solution.push(4);
        solution.push(5);
        solution.push(6);
        System.out.println("Elementos en q1: " + q1);
        solution.pop();
        System.out.println("Elementos en q1: " + q1);
    }

    // Push element x onto stack.
    public static void push(int x) {
        q1.add(x);
        top = x;
    }

    public static void pop() {
        while (q1.size() > 1) {
            top = q1.remove();
            q2.add(top);
        }
        q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
}
