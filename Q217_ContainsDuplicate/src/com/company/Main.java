package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	    int[] nums1 = {1,2,3,1};
        int[] nums2 = {1,2,3,4};
        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums1));
        System.out.println(containsDuplicate(nums2));
        System.out.println(containsDuplicate(nums3));
    }
    private static boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length <= 1) return false;
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}
