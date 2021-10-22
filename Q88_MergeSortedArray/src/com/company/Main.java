package com.company;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int[] nums3 = {1};
        int[] nums4 = {};
        int[] nums5 = {0};
        int[] nums6 = {1};
        merge(nums1, 3, nums2, 3);
        merge(nums3,1,nums4,0);
        merge(nums5,0,nums6,1);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums3));
        System.out.println(Arrays.toString(nums5));

    }
    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = m + n - 1;

        while(m - 1 >= 0 || n - 1 >= 0){
            int x = m - 1 >= 0 ? nums1[m - 1] : Integer.MIN_VALUE;
            int y = n - 1 >= 0 ? nums2[n - 1] : Integer.MIN_VALUE;

            if(x > y){
                nums1[end--] = x;
                m--;
            }else{
                nums1[end--] = y;
                n--;
            }
        }

    }
}
