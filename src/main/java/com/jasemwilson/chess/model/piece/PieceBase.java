package com.jasemwilson.chess.model.piece;

import com.jasemwilson.chess.model.board.IBoard;
import com.jasemwilson.chess.model.board.IPosition;
import com.jasemwilson.chess.model.player.IPlayer;

public abstract class PieceBase implements IPiece {

    private final IPlayer _owner;

    public PieceBase(IPlayer owner) {
        _owner = owner;
    }

    public abstract IMove[] getPossibleMoves(IBoard[][] board);
}
