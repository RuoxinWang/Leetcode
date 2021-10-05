package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{1,2,3},{4,5,6}};
        transpose(matrix1);
        transpose(matrix2);
    }

    private static int[][] transpose(int[][] matrix) {

        int A = matrix.length;
        int B = matrix[0].length;
        int[][] result = new int[B][A];
        for(int i = 0; i < B; i++) {
            for (int j = 0; j < A; j++) {
                result[i][j] = matrix[j][i];
            }
        }

        System.out.println(Arrays.deepToString(result));

        return result;

    }


}
