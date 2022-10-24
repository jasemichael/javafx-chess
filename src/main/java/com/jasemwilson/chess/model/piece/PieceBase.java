package com.jasemwilson.chess.model.piece;

import com.jasemwilson.chess.model.board.ITile;
import com.jasemwilson.chess.model.player.IPlayer;

public abstract class PieceBase implements IPiece {

    private final IPlayer _owner;

    public PieceBase(IPlayer owner) {
        _owner = owner;
    }
}
