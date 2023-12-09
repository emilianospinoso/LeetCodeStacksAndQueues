package a03RecursionPowerOf2;

public class RecursiveSolution {
    /*Given an integer n, return true if it is a power of two. Otherwise, return false.
    Example 1:
            Input: n = 1
            Output: true
            Explanation: 20 = 1    */
    public static void main(String[] args) {
        System.out.println(calculatePow(98743593, 0));
    }

    public static boolean calculatePow(int num, int base) {
        if (Math.pow(2, base) == num) {
            return true;
        } else if (Math.pow(2, base) < num) {
            return calculatePow(num, base + 1);
        } else if (Math.pow(2, base) > num) {
            return false;
        }
        return true;
    }
}