package a29GarminSlidingWindow;


/*                    SLIDING WINDOW
Given an array of integers and a number k, find the maximum sum of a subarray of size k.
Examples:
Input  : arr[] = {100, 200, 300, 400},  k = 2
Output : 700

Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4
Output : 39
Explanation: We get maximum sum by adding subarray {4, 2, 10, 23} of size 4.*/
public class SolutionSlidingW {

    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println(maxSum(nums,k));
    }

    static int maxSum(int nums[], int k) {
        int tam = nums.length;
        int res = 0;
        if (k > tam) {
            System.out.println("Not processed for insuficient q of data.");
            return 0;
        }
        //Calculate the first iteration.
        for (int i = 0; i < k; i++) {
            res += nums[i];
        }
        //Calculate the next iteration with a auxiliar.  If aux is greater than res, then assign
        //move to the right eliminating the first element of the window.
        int auxSum = res;  //this is KEYYYYYYYYYYYYYYYYYYY.
        for (int i = k; i < nums.length; i++) {
            auxSum += nums[i] - nums[i - k];
            if (auxSum > res) {
                res = auxSum;
            }
        }

        return res;
    }
}
