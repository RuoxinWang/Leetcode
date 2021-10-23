package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] nums1 = {1,2,3};
        int[] nums2 = {1,2,3,4};
        int[] nums3 = {-1,-2,-3};
        System.out.println(maximumProduct(nums1));
        System.out.println(maximumProduct(nums2));
        System.out.println(maximumProduct(nums3));
    }

    private static int maximumProduct(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);

        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[n - 1] * nums[0] * nums[1]);

    }

}
