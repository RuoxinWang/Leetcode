package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       int[] nums1 = {0,1,0,3,12};
       int[] nums2 = {0};
       moveZeroes(nums1);
       moveZeroes(nums2);
       System.out.println(Arrays.toString(nums1));
       System.out.println(Arrays.toString(nums2));
    }

    private static void moveZeroes(int[] nums) {

        int result = 0;

        for (int num : nums) {
            if (num != 0) nums[result++] = num;
        }

        while(result < nums.length){
            nums[result++] = 0;
        }
    }

}
