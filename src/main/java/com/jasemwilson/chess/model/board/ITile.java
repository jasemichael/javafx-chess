package com.jasemwilson.chess.model.board;

import com.jasemwilson.chess.model.piece.IPiece;
import javafx.scene.paint.Color;

public interface ITile {
    public boolean isHighlighted();

    public boolean isSelected();

    public IPiece getCurrentPiece();

    public void setCurrentPiece(IPiece newPiece);

    public Color getColor();

    public void setColor(Color color);

    public IPosition getPosition();

    public void setPosition(IPosition position);

    public void toggleHighlighted();

    public void toggleSelected();
}
