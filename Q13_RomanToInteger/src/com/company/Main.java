package com.company;

public class Main {

    public static void main(String[] args) {
	    String s1 = "III";
        String s2 = "IV";
        String s3 = "IX";
        String s4 = "LVIII";
        String s5 = "MCMXCIV";
        System.out.println(romanToInt(s1));
        System.out.println(romanToInt(s2));
        System.out.println(romanToInt(s3));
        System.out.println(romanToInt(s4));
        System.out.println(romanToInt(s5));


    }
    private static int romanToInt(String s) {
        int sum = 0;

        if(s.indexOf("IV") != -1){sum -= 2;}
        if(s.indexOf("IX") != -1){sum -= 2;}
        if(s.indexOf("XL") != -1){sum -= 20;}
        if(s.indexOf("XC") != -1){sum -= 20;}
        if(s.indexOf("CD") != -1){sum -= 200;}
        if(s.indexOf("CM") != -1){sum -= 200;}

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'I') sum += 1;
            if(c == 'V') sum += 5;
            if(c == 'X') sum += 10;
            if(c == 'L') sum += 50;
            if(c == 'C') sum += 100;
            if(c == 'D') sum += 500;
            if(c == 'M') sum += 1000;
        }
        return sum;
    }
}
