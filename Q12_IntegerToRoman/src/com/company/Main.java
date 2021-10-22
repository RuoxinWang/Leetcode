package com.company;

public class Main {

    public static void main(String[] args) {
	    int num1 = 3;
        int num2 = 4;
        int num3 = 9;
        int num4 = 58;
        int num5 = 1994;
        System.out.println(intToRoman(num1));
        System.out.println(intToRoman(num2));
        System.out.println(intToRoman(num3));
        System.out.println(intToRoman(num4));
        System.out.println(intToRoman(num5));
    }
    private static String intToRoman(int num) {
        String M[] = {"","M","MM","MMM","MMMM"};
        String C[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String X[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String I[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};

        return M[num / 1000] + C[(num / 100) % 10] + X[(num / 10) % 10] + I[num % 10];
    }
}
