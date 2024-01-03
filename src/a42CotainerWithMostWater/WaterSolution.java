package a42CotainerWithMostWater;

public class WaterSolution {

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }


    static int maxArea(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int maximumArea = 0;

        for (int i = 0; i < height.length - 1; i++) {
            maximumArea = Math.max(maximumArea, (height[leftPointer] + height[rightPointer])*(rightPointer-leftPointer));
            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return maximumArea;
    }
}
