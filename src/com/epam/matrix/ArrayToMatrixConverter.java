package com.epam.matrix;

public class ArrayToMatrixConverter {
    public Matrix convert(int[][] elements) {
        // check
        Matrix ret = new Matrix(getRowCount(elements), getColumnCount(elements));
        for (int row = 0; row < getRowCount(elements); row++) {
            for (int column = 0; column < getColumnCount(elements); column++) {
                ret.setElement(row, column, elements[row][column]);
            }
        }
        return ret;
    }

    private static int getRowCount(int[][] elements) {
        return elements.length;
    }

    private static int getColumnCount(int[][] elements) {
        return elements[0].length;
    }
}