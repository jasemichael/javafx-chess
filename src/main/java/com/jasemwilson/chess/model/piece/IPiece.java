package com.jasemwilson.chess.model.piece;

import com.jasemwilson.chess.model.board.IBoard;
import com.jasemwilson.chess.model.board.IPosition;

public interface IPiece {
    public IPosition[] getPossibleMoves(IBoard[][] board);
}
