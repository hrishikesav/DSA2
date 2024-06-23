package com.hrishi.design.chess.piece;

import com.hrishi.design.chess.PieceType;
import com.hrishi.design.chess.Position;
import com.hrishi.design.chess.Team;

public abstract class Piece {
    Position currentPosition;
    Team team;
    PieceType pieceType;

    public Piece(Team team, PieceType pieceType, Position position) {
        this.team = team;
        this.pieceType = pieceType;
        this.currentPosition = position;
    }

    public abstract boolean isValidMove(Position newPos);
}
