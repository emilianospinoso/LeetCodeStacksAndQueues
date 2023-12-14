package a06SortingArrayDiffMethods;

public class SortingWays {


    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        bubbleSortArray(nums);
        for (int x : nums) {
            System.out.print(x + " - ");
        }
    }


    public static int[] bubbleSortArray(int[] nums) {
        //Time Complexity = O(n2)->Not efficient
        int n = nums.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap nums[j] and nums[j + 1]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in inner loop, array is sorted
            if (!swapped) {
                break;
            }
        }
        return nums;
    }
}