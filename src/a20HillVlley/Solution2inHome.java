package a20HillVlley;

public class Solution2inHome {

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 2, 2};
        System.out.println(cantCastles(nums));
    }

    static int cantCastles(int[] nums) {

        int n = nums.length;
        int sum = 0;
        for (int i = 1; i < n - 1; i++) {  //Start with i=1 for avoid out of bound.
            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                // Peak becouse nums[i] is greater than both its neighbors
                sum += nums[i];
            } else if (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]) {
                // Valley because nums[i] is smaller than both its neighbors
                sum += nums[i];
            }
        }

        return sum;
    }

}
