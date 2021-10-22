package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    char[] chars1 = {'a','a','b','b','c','c','c'};
        char[] chars2 = {'a'};
        char[] chars3 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        char[] chars4 = {'a','a','a','b','b','a','a'};
        compress(chars1);
        compress(chars2);
        compress(chars3);
        compress(chars4);
        System.out.println(Arrays.toString(chars1));
        System.out.println(Arrays.toString(chars2));
        System.out.println(Arrays.toString(chars3));
        System.out.println(Arrays.toString(chars4));
    }

    private static int compress(char[] chars) {
        int n = chars.length;
        int current = 0;

        for(int i  = 0; i < n; ){
            int j = i;
            while(j < n-1 && chars[j] == chars[j+1]){
                j++;
            }
            chars[current++] = chars[i];
            if(i != j){
                String times = (j - i + 1) + "";
                for(int m = 0; m < times.length(); m++){
                    chars[current++] = times.charAt(m);
                }
            }
            i = j + 1;
        }
        return current;
    }
}
