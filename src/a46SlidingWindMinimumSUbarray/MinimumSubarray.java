package a46SlidingWindMinimumSUbarray;

public class MinimumSubarray {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(target, nums));
    }

    static int minSubArrayLen(int target, int[] nums) {
            int left = 0;
            int total = 0;
            int res = Integer.MAX_VALUE;

            for (int right = 0; right < nums.length; right++) {
                total += nums[right];
                while (total >= target) {
                    res = Integer.min(right - left + 1, res); //ME QUEDO con el menor.
                    total -= nums[left];
                    left++;
                }
            }
            if (res == Integer.MAX_VALUE) {
                return 0;
            }

            return res;
    }

}