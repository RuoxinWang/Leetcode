package com.company;

public class Main {

    public static void main(String[] args) {
	    String haystack1 = "hello";
        String needle1 = "ll";
        String haystack2 = "aaaaa";
        String needle2 = "bba";
        String haystack3 = "";
        String needle3 = "";
        System.out.println(strStr(haystack1, needle1));
        System.out.println(strStr(haystack2, needle2));
        System.out.println(strStr(haystack3, needle3));
    }

    private static int strStr(String haystack, String needle) {
        if(needle == null || needle.length() == 0) return 0;
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int j = 1;
                for(j = 1; j < needle.length(); j++){
                    if(haystack.charAt(i + j) != needle.charAt(j)) break;
                }

                if(j == needle.length()){
                    return i;
                }
            }
        }

        return -1;
    }
}
