package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    int[] nums1 = {0,1,2,4,5,7};
        int[] nums2 = {0,2,3,4,6,8,9};
        int[] nums3 = {};
        int[] nums4 = {-1};
        int[] nums5 = {0};
        System.out.println(summaryRanges(nums1));
        System.out.println(summaryRanges(nums2));
        System.out.println(summaryRanges(nums3));
        System.out.println(summaryRanges(nums4));
        System.out.println(summaryRanges(nums5));
    }
    private static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums == null || nums.length == 0) return result;

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            while(i < nums.length - 1 && nums[i] + 1 == nums[i + 1]){
                i++;
            }

            if(num != nums[i]){
                result.add(num + "->" + nums[i]);
            }else{
                result.add(num + "");

            }
        }
        return result;
    }
}
