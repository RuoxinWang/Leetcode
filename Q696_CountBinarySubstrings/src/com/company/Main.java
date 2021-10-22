package com.company;

public class Main {

    public static void main(String[] args) {
	    String s1 = "00110011";
        String s2 = "10101";
        System.out.println(countBinarySubstrings(s1));
        System.out.println(countBinarySubstrings(s2));
    }
    private static int countBinarySubstrings(String s) {
        char[] chars = s.toCharArray();
        int current = 1;
        int previous = 0;
        int count = 0;
        for(int i = 1; i < chars.length;i++){
            if(chars[i] == chars[i - 1]){
                current++;
            }else{
                count += Math.min(current, previous);
                previous = current;
                current = 1;
            }
        }
        return Math.min(current, previous) + count;
    }
}
