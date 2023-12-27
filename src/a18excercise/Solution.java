package a18excercise;

import java.util.HashSet;
import java.util.Set;

public class Solution {
/*given an array int[] A   of N integers, returns the smallest positive integer (greater than 0)  that does not ocurr in A.
FOR EXAMPLE, given A={1,2,3}   RETURN 4.   GIVEN A={-1,-3}  RETURN 1. IN JAVA */

    public static void main(String[] args) {

        int[] example1 = {1, 2, 3};
        int result1 = solution(example1);
        System.out.println("Result for example 1: " + result1);

        int[] example2 = {-1, -3};
        int result2 = solution(example2);
        System.out.println("Result for example 2: " + result2);
    }


    public static int solution(int[] A) {
        Set<Integer> nums = new HashSet<>();
        //ADD all the int in an array....
        for (int i = 0; i < A.length; i++) {
            nums.add(A[i]);
        }

        //i start with the smallest that is 1
        int smallestNPositive = 1;
        while (nums.contains(smallestNPositive)) {
            smallestNPositive++; //iterate adding one to the number that i find.
        }
        return smallestNPositive;
    }

}
