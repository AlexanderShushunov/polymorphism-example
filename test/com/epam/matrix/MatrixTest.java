package com.epam.matrix;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MatrixTest {
    @Test
    public void add() throws Exception {
        ArrayToMatrixConverter converter = new ArrayToMatrixConverter();
        Matrix left = converter.convert(new int[][]
                {{1, 2}, {3, 4}});
        Matrix right = converter.convert(new int[][]
                {{2, 3}, {4, 5}});
        Matrix expect = converter.convert(new int[][]
                {{3, 5}, {7, 9}});
        assertTrue(same(left.add(right), expect));
    }

    @Test
    public void sub() throws Exception {
        ArrayToMatrixConverter converter = new ArrayToMatrixConverter();
        Matrix left = converter.convert(new int[][]
                {{1, 0}, {3, 55}});
        Matrix right = converter.convert(new int[][]
                {{2, 3}, {4, 5}});
        Matrix expect = converter.convert(new int[][]
                {{-1, -3}, {-1, 50}});
        assertTrue(same(left.sub(right), expect));
    }

    private boolean same(Matrix first, Matrix second) {
        if (first.getColumnCount() != second.getColumnCount()) {
            return false;
        }
        for (int row = 0; row < first.getRowCount(); row++) {
            for (int column = 0; column < first.getColumnCount(); column++) {
                if (first.getElement(row, column) != second.getElement(row, column)) {
                    return false;
                }
            }
        }
        return true;
    }


}