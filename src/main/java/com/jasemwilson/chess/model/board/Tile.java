package com.jasemwilson.chess.model.board;

import com.jasemwilson.chess.model.piece.IPiece;
import javafx.scene.paint.Color;

public class Tile implements ITile {
    private boolean _highlighted = false;
    private boolean _selected = false;
    private IPiece _currentPiece;
    private Color _color;
    private IPosition _position;

    public Tile(Color color, IPiece piece, IPosition position) {
        _color = color;
        _currentPiece = piece;
        _position = position;
    }

    public boolean isHighlighted() {
        return _highlighted;
    }

    public boolean isSelected() { return _selected; }

    public void toggleHighlighted() {
        _highlighted = !_highlighted;
    }

    public void toggleSelected() { _selected = !_selected; }

    public IPiece getCurrentPiece() {
        return _currentPiece;
    }

    public void setCurrentPiece(IPiece newPiece) {
        _currentPiece = newPiece;
    }

    public Color getColor() { return _color; }

    public void setColor(Color color) { _color = color; }

    public IPosition getPosition() {
        return _position;
    }

    public void setPosition(IPosition position) {
        _position = position;
    }
}
