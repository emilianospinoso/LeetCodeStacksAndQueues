package a41TwoSums2;

public class SolutionTwoPointers {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 7, 10, 11};
        int target = 9;
        System.out.println(twoSum(numbers,target));
        System.out.println(numbers[0] + " - " + numbers[1]);
    }


    static int[] twoSum(int[] numbers, int target) {
        int[] solution = {-1, -1};
        int left = 0;
        int right = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[left] + numbers[right] == target) {
                solution[0] = left+1;
                solution[1] = right+1;
                return solution;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return solution;
    }
}
