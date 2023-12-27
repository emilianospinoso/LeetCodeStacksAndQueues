package a21Rolls;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] A = {3, 2, 4, 3};
        int F = 2;
        int M = 4;

        int[] result = solution(A, F, M);

        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] A, int F, int M) {
        int tam = A.length;
        // Calculate the sum of known rolls
        int knownSum = 0;
        for (int i = 0; i < tam; i++) {
            knownSum += A[i];
        }
        int total = tam + F;   // this is going to be the total number of rollsl
        int sumToAVG = M * total - knownSum;
        int[] results = new int[F]; //The array with the missing rolls

        int remainingDifference = sumToAVG - F;
        for (int i = F - 1; i >= 0; i--) {
            int maxIncrement = Math.min(remainingDifference, 5);
            results[i] += maxIncrement;
            remainingDifference -= maxIncrement;
        }

        return results;
    }
}
