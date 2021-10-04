package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int[][] matrix3 = {{1}};
        int[][] matrix4 = {{1,2},{3,4}};
        rotate(matrix1);
        rotate(matrix2);
        rotate(matrix3);
        rotate(matrix4);

    }

    public void rotate(int[][] matrix) {
        int A = matrix.length;
        int B = matrix[0].length;
        int[][] result = new int[B][A];
        for(int i = 0; i < B; i++)
            for(int j = 0; j < A; j++)
                result[i][j] = matrix[j][i];

        //System.out.println(Arrays.deepToString(result));


    }
}
