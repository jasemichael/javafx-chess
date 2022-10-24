package com.jasemwilson.chess.model.board;

public interface IBoard {
    public void highlightTile(int row, int column);

    public ITile getTile(int row, int column);
}
