package com.jasemwilson.chess.model.piece;

import com.jasemwilson.chess.model.board.IPosition;

public class Move implements IMove {
    private MoveType _moveType;
    private IPosition _position;

    public Move(IPosition position, MoveType moveType) {
        _position = position;
        _moveType = moveType;
    }
}
