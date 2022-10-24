package com.jasemwilson.chess.model.board;

import com.jasemwilson.chess.model.piece.IPiece;
import javafx.scene.paint.Color;

public class Tile implements ITile {
    private boolean _highlighted = false;

    private IPiece _currentPiece = null;

    private Color _color;

    public Tile(Color color, IPiece piece = null) {
        _color = color;
        _currentPiece = piece;
    }

    public boolean isHighlighted() {
        return _highlighted;
    }

    public void toggleHighlighted() {
        _highlighted = !_highlighted;
    }

    public IPiece getCurrentPiece() {
        return _currentPiece;
    }

    public void setCurrentPiece(IPiece newPiece) {
        _currentPiece = newPiece;
    }
}
