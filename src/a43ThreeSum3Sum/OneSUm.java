package a43ThreeSum3Sum;

import java.util.*;

public class OneSUm {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(nums, target));

    }


    static int[] twoSum(int[] nums, int target) {
        Set<Integer> values = new HashSet<>();
        Queue<Integer> resultsQueue = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            values.add(nums[i]);
        }

        for (Integer n : nums) {
            int toFind = target - n;
            if (values.contains(toFind)) {
                resultsQueue.add(toFind);
                resultsQueue.add(n);
            }
        }

        // Convert Queue to array
        int[] resultsArray = new int[resultsQueue.size()];
        int i = 0;
        while (!resultsQueue.isEmpty()) {
            resultsArray[i++] = resultsQueue.poll();
        }

        return resultsArray;
    }
}
