package com.patika.java101.datastructure;

import java.util.Arrays;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println("row number is: " + matris.length);// numbers of row
        System.out.println("column number is: " + matris[0].length);// number of column
        // to print out array using for loop
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                 System.out.print(matris[i][j]+ ",");
            }
            System.out.println();
        }

        // to print out array using forEach loop
        for (int[] row : matris) {
            for (int col : row) {
                System.out.print(col + ",");
            }
            System.out.println();
        }
    }
}
