package com.company;

public class Main {

    public static void main(String[] args) {
        int x1 = 121;
        int x2 = -121;
        int x3 = 10;
        int x4 = -101;
        System.out.println(isPalindrome(x1));
        System.out.println(isPalindrome(x2));
        System.out.println(isPalindrome(x3));
        System.out.println(isPalindrome(x4));
    }
    private static boolean isPalindrome(int x) {
        if(x < 0) return false;
        String res = Integer.toString(x);
        int left_pointer = 0;
        int right_pointer = res.length() -1;

        while(left_pointer <= right_pointer){
            if(res.charAt(left_pointer) == res.charAt(right_pointer)){
                left_pointer++;
                right_pointer--;
            }else if(left_pointer == right_pointer){
                return true;
            }else{
                return false;
            }
        }
        return true;
    }
}

