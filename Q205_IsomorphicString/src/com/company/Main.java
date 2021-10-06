package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    String s1 = "egg";
        String t1 = "add";
        String s2 = "foo";
        String t2 = "bar";
        String s3 = "paper";
        String t3 = "title";

        System.out.println(isIsomorphic(s1,t1));
        System.out.println(isIsomorphic(s2,t2));
        System.out.println(isIsomorphic(s3,t3));
    }

    public static boolean isIsomorphic(String s, String t) {
        /*
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for(int i = 0, j = 0; i < s.length() && j < t.length(); i++, j++){
            if(mapS.put(s.charAt(i),i) != mapT.put(t.charAt(j),j)){
                return false;
            }
        }
        return true;

         */

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        if(s.length() != t.length()) return false;

        char[] sNew = new char[256];
        char[] tNew = new char[256];

        for(int i = 0; i < s.length(); i++){
            if(sNew[s1[i]] == 0 && tNew[t1[i]] == 0){
                sNew[s1[i]] = t1[i];
                tNew[t1[i]] = s1[i];
            }else{
                if(sNew[s1[i]] != t1[i] || tNew[t1[i]] != s1[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
