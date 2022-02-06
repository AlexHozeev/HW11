package com.alexshab;

import java.util.Arrays;

public class Matrix {

    public static final int[][] MATRIX = {
            {10, 20, 30, 40},
            {50, 60, 70, 80},
            {100,200,300,400}
    };

    public static void main(String[] args) {

        print(MATRIX);
        System.out.println();
        print(swapColumns(MATRIX, 1, 2));
        System.out.println();
        print(swapRows(MATRIX, 2, 1));
        System.out.println();
        print(multiply(MATRIX, 10));
        System.out.println();
        System.out.println(Arrays.toString(toArray(MATRIX)));
        System.out.println();
        System.out.println(maxValue(MATRIX));

    }


     // swapColumns(int[][] matrix, i, j) - меняет 2 столбца местами

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


     //  swapColumns(int[][] matrix, i, j) - меняет 2 столбца местами

    public static int[][] swapColumns(int[][] matrix, int firstColumn, int secondColumn) {
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][firstColumn - 1];
            matrix[i][firstColumn - 1] = matrix[i][secondColumn - 1];
            matrix[i][secondColumn - 1] = temp;
        }
        return matrix;
    }


     // swapRows(int[][] matrix, i, j) - меняет 2 рядка местами

    public static int[][] swapRows(int[][] matrix, int firstRow, int secondRow) {
        int[] tempRow = matrix[firstRow - 1];
        matrix[firstRow - 1] = matrix[secondRow - 1];
        matrix[secondRow - 1] = tempRow;
        return matrix;
    }


    // mul(int[][] matrix, int value) - умножает матрицу на число

    public static int[][] multiply(int[][] matrix, int value) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= value;
            }
        }
        return matrix;
    }


     //  toArray(int[][] matrix) - превращает матрицу в массив. Например если была матрица на 3x4 то вернуть массив из 12 элементов

    public static int[] toArray(int[][] matrix) {
        int[] array = new int[matrix.length * matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                array[i * matrix[i].length + j] = matrix[i][j];
            }
        }
        return array;
    }


     // max(int[][] matrix) - возвращает максимальный элемент матрицы

    public static int maxValue(int[][] matrix) {
        int maxValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (maxValue < matrix[i][j]) {
                    maxValue = matrix[i][j];
                }
            }
        }
        return maxValue;
    }
}