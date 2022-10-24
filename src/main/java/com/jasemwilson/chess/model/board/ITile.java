package com.jasemwilson.chess.model.board;

import com.jasemwilson.chess.model.piece.IPiece;

public interface ITile {
    public boolean isHighlighted();

    public IPiece getCurrentPiece();

    public void setCurrentPiece(IPiece newPiece);

    public void toggleHighlighted();
}
