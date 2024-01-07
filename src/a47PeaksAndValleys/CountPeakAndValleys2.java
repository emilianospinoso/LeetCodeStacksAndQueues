package a47PeaksAndValleys;

import java.util.ArrayList;
import java.util.List;

public class CountPeakAndValleys2 {
    public static void main(String[] args) {
        // Ejemplo de llamada a la función y salida
        int result = 0;
        int[] heights = new int[]{2, 4, 1, 1, 6, 5};
        result = countHillValley(heights);
        System.out.println(result);
    }

    public static int countHillValley(int[] nums) {
        int peaksAndValleys = 0;
        List<Integer> peaks = new ArrayList<>();
        List<Integer> valleys = new ArrayList<>();
        int tam = nums.length;
        int right = 2;
        int left = 0;
        int i = 1;

        //{2, 4, 1, 1, 6, 5}
        while (right < tam) {
            while (nums[i] == nums[right]) {
                right++;
            }
            if ((nums[i] > nums[right]) && (nums[i] > nums[left])) {
                peaks.add(i);
                System.out.println("Peak found at:" + i);
            } else if ((nums[i] < nums[left]) && (nums[i] < nums[right])) {
                valleys.add(i);
                System.out.println("Valley found at:" + i);
            }
            right++;
            i = right - 1;
            left = i - 1;
        }
        peaksAndValleys = peaks.size() + valleys.size();
        return peaksAndValleys;
    }
}
