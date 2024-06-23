package com.hrishi.design.chess;

import com.hrishi.design.chess.piece.Piece;
import com.hrishi.design.chess.piece.RookPiece;

import java.util.Arrays;

public class ChessGame {

    static RookPiece rookPieceT1_1;
    static RookPiece rookPieceT1_2;
    static RookPiece rookPieceT2_1;
    static RookPiece rookPieceT2_2;


    public static void main(String[] args) {
        System.out.println("Starting ChessGame!");

        initializePieces();

        nextMove(Team.T1, rookPieceT1_1, new Position(1,1));
    }

    static void initializePieces() {
        rookPieceT1_1 = new RookPiece(Team.T1, new Position(0,0));
        rookPieceT1_2 = new RookPiece(Team.T1, new Position(0,7));
        rookPieceT2_1 = new RookPiece(Team.T1, new Position(7,0));
        rookPieceT2_2 = new RookPiece(Team.T1, new Position(7,7));
    }

    static void nextMove(Team team, Piece piece, Position newPos) {
        if(piece.isValidMove(newPos)) {
            // update new position
            // check if game over
        }
    }
}
