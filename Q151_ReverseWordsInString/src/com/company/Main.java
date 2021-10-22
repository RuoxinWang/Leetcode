package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        String s1 = "the sky is blue";
        String s2 = "  hello world   ";
        String s3 = "a good   example";
        String s4 = "  Bob    Loves  Alice   ";
        String s5 = "Alice does not even like bob";
        System.out.println(reverseWords(s1));
        System.out.println(reverseWords(s2));
        System.out.println(reverseWords(s3));
        System.out.println(reverseWords(s4));
        System.out.println(reverseWords(s5));
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.trim().split("\\s+");

        for(int i = words.length - 1; i >= 0; --i) {
            sb.append(words[i] + " ");
        }

        return sb.toString().trim();
    }
}

