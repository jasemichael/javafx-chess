package com.jasemwilson.chess.model.board;

import com.jasemwilson.chess.model.piece.IPiece;

import java.util.List;

public class KillSection implements IKillSection {

    private List<IPiece> _section;

    @Override
    public void add(IPiece piece) {
        _section.add(piece);
    }
}
