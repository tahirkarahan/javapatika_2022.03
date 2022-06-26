package com.patika.java101.datastructure;

public class FindOutTransposeMatrix {
    public static void main(String[] args) {
        //Initialize matrix a
        int[][] a = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int row = a.length;
        int column = a[0].length;

        //Declare array t with reverse dimensions
        int[][] t = new int[column][row];

        //Calculates transpose of given matrix
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                t[i][j] = a[j][i];
            }
        }
        System.out.println("Transpose of given matrix: ");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

    }
}
