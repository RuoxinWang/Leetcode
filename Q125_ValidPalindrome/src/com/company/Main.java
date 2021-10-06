package com.company;

public class Main {

    public static void main(String[] args) {
	    String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
    }

    public static boolean isPalindrome(String s) {
        String sNew = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        if(sNew == null || sNew.length() <= 1){
            return true;
        }
        char[] arr = sNew.toCharArray();
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            if(arr[start] !=arr[end]){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}
