package com.company;

public class Main {

    public static void main(String[] args) {
	    String s1 = "aba";
        String s2 = "abca";
        String s3 = "abc";
        System.out.println(validPalindrome(s1));
        System.out.println(validPalindrome(s2));
        System.out.println(validPalindrome(s3));
    }
    private static boolean validPalindrome(String s) {
        int left_pointer = 0;
        int right_pointer = s.length() - 1;

        while(left_pointer <= right_pointer){
            if(s.charAt(left_pointer) != s.charAt(right_pointer)){
                return helperMethod(s, left_pointer + 1, right_pointer) || helperMethod(s, left_pointer, right_pointer - 1);
            }
            left_pointer++;
            right_pointer--;
        }
        return true;
    }

    private static boolean helperMethod(String s, int i, int j) {
        int left_pointer = i;
        int right_pointer = j;

        while(left_pointer <= right_pointer){
            if(s.charAt(left_pointer) != s.charAt(right_pointer)){
                return false;
            }

            left_pointer++;
            right_pointer--;
        }
        return true;
    }
}
