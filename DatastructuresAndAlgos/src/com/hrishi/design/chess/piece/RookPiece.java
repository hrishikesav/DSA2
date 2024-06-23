package com.hrishi.design.chess.piece;

import com.hrishi.design.chess.PieceType;
import com.hrishi.design.chess.Position;
import com.hrishi.design.chess.Team;

public class RookPiece extends Piece{
    public RookPiece(Team team, Position position) {
        super(team, PieceType.ROOK, position);
    }

    @Override
    public boolean isValidMove(Position newPos) {
        return false;
    }
}
