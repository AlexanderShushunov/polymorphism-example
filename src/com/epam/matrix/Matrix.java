package com.epam.matrix;

import com.epam.opertions.Addition;
import com.epam.opertions.Operation;
import com.epam.opertions.Subtraction;

public class Matrix {

    private int[][] elements;

    public Matrix(int rowCount, int columnCount) {
        elements = new int[rowCount][columnCount];
    }

    public int getElement(int row, int column) {
        // check
        return elements[row][column];
    }

    public void setElement(int row, int column, int element) {
        // check
        elements[row][column] = element;
    }


    public int getRowCount() {
        return elements.length;
    }

    public int getColumnCount() {
        return elements[0].length;
    }

    public Matrix multiply(Matrix right) {
        return new Matrix(1, 1);
    }

    public Matrix add(Matrix other) {
        return calculate(other, new Addition());
    }

    public Matrix sub(Matrix other) {
       return calculate(other, new Subtraction());
    }

    public Matrix calculate(Matrix other, Operation operation) {
        Matrix ret = new Matrix(getRowCount(), getColumnCount());
        for (int row = 0; row < getRowCount(); row++) {
            for (int column = 0; column < getColumnCount(); column++) {
                ret.elements[row][column]
                        = operation.calculate(this.elements[row][column], other.elements[row][column]);
            }
        }
        return ret;
    }

    public int calcDetermenant() {
        return 0;
    }


}
