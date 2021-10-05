package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        spiralOrder(matrix1);
        spiralOrder(matrix2);
        System.out.println(spiralOrder(matrix1));
        System.out.println(spiralOrder(matrix2));
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if(matrix.length == 0){
            return result;
        }

        int beginRow = 0;
        int endRow = matrix.length - 1;
        int beginColumn = 0;
        int endColumn = matrix[0].length - 1;

        while(beginRow <= endRow && beginColumn <= endColumn){
            //Right
            for(int i = beginColumn; i <= endColumn; i++){
                result.add(matrix[beginRow][i]);
            }
            beginRow++;

            //Down
            for(int i = beginRow; i <= endRow; i++){
                result.add(matrix[i][endColumn]);
            }
            endColumn--;

            if(beginRow <= endRow){
                //Left
                for(int i = endColumn; i >= beginColumn; i--){
                    result.add(matrix[endRow][i]);
                }
            }
            endRow--;

            if(beginColumn <= endColumn){
                //Up
                for(int i = endRow; i >= beginRow; i--){
                    result.add(matrix[i][beginColumn]);
                }
            }
            beginColumn++;
        }
        return result;


    }
}
