package a00MergeTwoArraysAndSort;

import java.util.Arrays;
import java.util.Random;

public class SolutionSort {
    /*
    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
     representing the number of elements in nums1 and nums2 respectively.
     */
    public static void main(String[] args) {

        int[] arr1 = {4, 3, 6, 0, 0, 0};
        int[] arr2 = {1, 9, 5};

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));


        //now merge the arrays:
        for (int i = 0; i < arr2.length; i++) {
            arr1[i + 3] = arr2[i];
        }
        System.out.println("Array 1: " + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("Array 1: " + Arrays.toString(arr1));
    }
}

