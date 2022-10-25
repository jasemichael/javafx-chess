package com.jasemwilson.chess.model.board;

public class Position implements IPosition {

    private int _row;
    private int _column;

    public Position(int row, int column) {
        _row = row;
        _column = column;
    }

    @Override
    public int getRow() {
        return _row;
    }

    @Override
    public void setRow(int row) {
        _row = row;
    }

    @Override
    public int getColumn() {
        return _column;
    }

    @Override
    public void setColumn(int column) {
        _column = column;
    }
}
