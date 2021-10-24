package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] nums1 = {1,1,2};
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums1));
        System.out.println(removeDuplicates(nums2));
    }
    private static int removeDuplicates(int[] nums) {
        int n = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[n]){
                n++;
                nums[n] = nums[i];
            }
        }
        return n + 1;
    }
}
