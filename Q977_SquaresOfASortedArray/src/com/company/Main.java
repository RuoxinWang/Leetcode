package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numQ2_1 = {-4,-1,0,3,10};
        int[] numQ2_2 = {-7,-3,2,3,11};
        sortedSquares(numQ2_1);
        sortedSquares(numQ2_2);
    }
    private static int[] sortedSquares(int[] num2){

        int[] squares = new int[num2.length];
        int left_pointer = 0;
        int right_pointer = num2.length-1;

        for(int i = num2.length-1; i >=0; i--) {
            if(Math.abs(num2[left_pointer]) > num2[right_pointer]){
                squares[i] = num2[left_pointer] * num2[left_pointer];
                left_pointer++;
            }else{
                squares[i] = num2[right_pointer]* num2[right_pointer];
                right_pointer--;
            }
        }

        System.out.println(Arrays.toString(squares));

        return squares;



    }
}
