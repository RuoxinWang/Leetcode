package com.company;

public class Main {

    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        String num3 = "456";
        String num4 = "77";
        String num5 = "0";
        String num6 = "0";
        System.out.println(addStrings(num1, num2));
        System.out.println(addStrings(num3, num4));
        System.out.println(addStrings(num5, num6));


    }

    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        char[] num1Array = num1.toCharArray();
        char[] num2Array = num2.toCharArray();
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry == 1) {
            int a = i >= 0 ? (num1Array[i--] - '0') : 0;
            int b = j >= 0 ? (num2Array[j--] - '0') : 0;
            int sum = a + b + carry;
            sb.insert(0, sum % 10);
            carry = sum / 10;
        }
        return sb.toString();
    }
}
