package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numQ1_1 = {1,2,3,2};
        int[] numQ1_2 = {1,1,1,1,1};
        int[] numQ1_3 = {1,2,3,4,5};
        sumOfUnique(numQ1_1);
        sumOfUnique(numQ1_2);
        sumOfUnique(numQ1_3);

    }
    private static int sumOfUnique(int[] num1) {

        int[] uniqueFrequency = new int[255];
        int sum = 0;

        for(int i = 0; i < num1.length; i++){
            uniqueFrequency[num1[i]]++;
        }

        for(int i = 0; i < num1.length; i++){
            if(uniqueFrequency[num1[i]] == 1)
                sum += num1[i];
        }
        System.out.println(sum);

        return sum;

    }
}
