package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    int[] nums1 = {2,2,1};
        int[] nums2 = {4,1,2,1,2};
        int[] nums3 = {1};
        System.out.println(singleNumber(nums1));
        System.out.println(singleNumber(nums2));
        System.out.println(singleNumber(nums3));
    }
    private static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        for(int num : nums){
            if(map.get(num) == 1){
                return num;
            }
        }
        return 0;
    }
}
