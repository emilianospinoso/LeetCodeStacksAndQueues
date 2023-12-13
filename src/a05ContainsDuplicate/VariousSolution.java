package a05ContainsDuplicate;

import java.util.Arrays;

public class VariousSolution {
    /*
    Given an integer array nums, return true if any value appears at least twice in the array,
    and return false if every element is distinct.
     */
    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 1};

        //first approach:Linear Search (Brute force)
        //System.out.println(firstApproachLinear(nums));
        System.out.println(secondApproachSorting(nums));

    }

    private static boolean firstApproachLinear(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean secondApproachSorting(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == i + 1) {
                return true;
            }
        }
        return false;
    }
}
