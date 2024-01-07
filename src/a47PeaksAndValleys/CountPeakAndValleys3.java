package a47PeaksAndValleys;

import java.util.ArrayList;
import java.util.List;

public class CountPeakAndValleys3 {
    //TODO:DO THE SAME THAT BEFORE, BUT WITHOUT ELIMINATE THE REPEATED ELEMENTS. YOU HAVE TO MAKE A SLIDING WINDOW
    //THAT GOES INCREASING MEANWHILE THE NUMBER IS THE SAME.
    //With this: You study valleys and sliding window too.

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
        int tam = 0;
        int j = 1;
        //Remove duplicates consecutives
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println("Eliminate repeated nums.");
        for (int i = 0; i < j; i++) {
            System.out.println(nums[i]);
        }

        for (int i = 1; i < j - 1; i++) {
            if ((nums[i] > nums[i + 1]) && (nums[i] > nums[i - 1])) {
                peaks.add(i);
                System.out.println("Peak found at:" + i);
            } else if ((nums[i] < nums[i - 1]) && (nums[i] < nums[i + 1])) {
                valleys.add(i);
                System.out.println("Valley found at:" + i);
            }
        }
        peaksAndValleys = peaks.size() + valleys.size();
        return peaksAndValleys;
    }
}
