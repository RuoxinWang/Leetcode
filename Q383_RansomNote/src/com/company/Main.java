package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String ransomNote1 = "a";
        String magazine1 = "b";
        String ransomNote2 = "aa";
        String magazine2 = "ab";
        String ransomNote3 = "aa";
        String magazine3 = "aab";
        System.out.println(canConstruct(ransomNote1, magazine1));
        System.out.println(canConstruct(ransomNote2, magazine2));
        System.out.println(canConstruct(ransomNote3, magazine3));
    }
    private static boolean canConstruct(String ransomNote, String magazine){
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            int count = map.getOrDefault(ch, 0) + 1;
            map.put(ch, count);
        }
        for(char ch : ransomNote.toCharArray()){
            int count = map.getOrDefault(ch,0) - 1;
            map.put(ch, count);
            if (count < 0){
                return false;
            }
        }
        return true;

    }
}
