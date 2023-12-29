package a28RotateArray;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        nums= rotate(nums, k);
        for (int n: nums){
            System.out.print(n + " - ");
        }
    }

    static int[] rotate(int[] nums, int k) {
        int tam= nums.length;
        int nums2[] = new int[tam];

        for (int i=0;i<tam;i++){
            if(i+k+1<tam){
                nums2[i]=nums[i+k+1];
            }else{
                nums2[i]=nums[i-k];
            }
        }

        return nums2;
    }
}
