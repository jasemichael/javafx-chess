package com.jasemwilson.chess.model.board;

import com.jasemwilson.chess.model.piece.IPiece;

public class Board implements IBoard {
    private ITile [][] _board;

    public Board(ITile[][] board) {
        _board = board;
    }

    public IPiece getPiece(int row, int column) {
        return _board[row][column].getCurrentPiece();
    }

    public void setPiece(IPiece piece, int row, int column) {
        _board[row][column].setCurrentPiece(piece);
    }
}
