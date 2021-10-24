package com.company;

public class Main {

    public static void main(String[] args) {
	    String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix(strs2));
    }
    private static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        String pre = strs[0];

        for(int i = 0; i < strs.length; i++){
            while(!strs[i].startsWith(pre)){
                pre = pre.substring(0, pre.length() - 1);
            }
        }
        return pre;
    }
}
