package com.company;

public class Main {

    public static void main(String[] args) {
	    String[] wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding";
        String word2 = "practice";
        System.out.println(shortestDistance(wordsDict, word1, word2));
        String word3 = "makes";
        String word4 = "coding";
        System.out.println(shortestDistance(wordsDict, word3, word4));
    }

    private static int shortestDistance(String[] wordsDict, String word1, String word2) {
        int n1 = -1;
        int n2 = -1;
        int min = wordsDict.length;

        for(int i = 0; i < wordsDict.length; i++){
            if(wordsDict[i].equals(word1)){
                n1 = i;
            }else if(wordsDict[i].equals(word2)){
                n2 = i;
            }
            if(n1 != -1 && n2 != -1){
                min = Math.min(min, Math.abs(n1 - n2));
            }
        }
        return min;
    }
}
