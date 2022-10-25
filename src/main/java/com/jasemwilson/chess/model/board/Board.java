package com.jasemwilson.chess.model.board;

import com.jasemwilson.chess.model.piece.IPiece;

public class Board implements IBoard {
    private ITile [][] _board;

    public Board(ITile[][] board) {
        _board = board;
    }

    public ITile getTile(int row, int column) {
        return _board[row][column];
    }
}
