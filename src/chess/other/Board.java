package chess.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import chess.pieces.Piece;

public class Board
{
    private static final int boardDimension = 8;
    
    private Map<Square, Piece> tiles;
    
    private Board()
    {
        tiles = new HashMap();
    }
    
    private void placePiece(Square square, Piece piece)
    {
        tiles.put(square, piece);
    }
    
    public static Board create()
    {
        Board board = new Board();
    
        board.placePiece(Square.A1, new PieceFactory(PieceType.ROOK, Color.WHITE).build());
        board.placePiece(Square.B1, new PieceFactory(PieceType.KNIGHT, Color.WHITE).build());
        board.placePiece(Square.C1, new PieceFactory(PieceType.BISHOP, Color.WHITE).build());
        board.placePiece(Square.D1, new PieceFactory(PieceType.QUEEN, Color.WHITE).build());
        board.placePiece(Square.E1, new PieceFactory(PieceType.KING, Color.WHITE).build());
        board.placePiece(Square.F1, new PieceFactory(PieceType.BISHOP, Color.WHITE).build());
        board.placePiece(Square.G1, new PieceFactory(PieceType.KNIGHT, Color.WHITE).build());
        board.placePiece(Square.H1, new PieceFactory(PieceType.ROOK, Color.WHITE).build());
         
        board.placePiece(Square.A2, new PieceFactory(PieceType.PAWN, Color.WHITE).build());
        board.placePiece(Square.B2, new PieceFactory(PieceType.PAWN, Color.WHITE).build());
        board.placePiece(Square.C2, new PieceFactory(PieceType.PAWN, Color.WHITE).build());
        board.placePiece(Square.D2, new PieceFactory(PieceType.PAWN, Color.WHITE).build());
        board.placePiece(Square.E2, new PieceFactory(PieceType.PAWN, Color.WHITE).build());
        board.placePiece(Square.F2, new PieceFactory(PieceType.PAWN, Color.WHITE).build());
        board.placePiece(Square.G2, new PieceFactory(PieceType.PAWN, Color.WHITE).build());
        board.placePiece(Square.H2, new PieceFactory(PieceType.PAWN, Color.WHITE).build());
        
        board.placePiece(Square.A8, new PieceFactory(PieceType.ROOK, Color.BLACK).build());
        board.placePiece(Square.B8, new PieceFactory(PieceType.KNIGHT, Color.BLACK).build());
        board.placePiece(Square.C8, new PieceFactory(PieceType.BISHOP, Color.BLACK).build());
        board.placePiece(Square.D8, new PieceFactory(PieceType.QUEEN, Color.BLACK).build());
        board.placePiece(Square.E8, new PieceFactory(PieceType.KING, Color.BLACK).build());
        board.placePiece(Square.F8, new PieceFactory(PieceType.BISHOP, Color.BLACK).build());
        board.placePiece(Square.G8, new PieceFactory(PieceType.KNIGHT, Color.BLACK).build());
        board.placePiece(Square.H8, new PieceFactory(PieceType.ROOK, Color.BLACK).build());
        
        board.placePiece(Square.A7, new PieceFactory(PieceType.PAWN, Color.BLACK).build());
        board.placePiece(Square.B7, new PieceFactory(PieceType.PAWN, Color.BLACK).build());
        board.placePiece(Square.C7, new PieceFactory(PieceType.PAWN, Color.BLACK).build());
        board.placePiece(Square.D7, new PieceFactory(PieceType.PAWN, Color.BLACK).build());
        board.placePiece(Square.E7, new PieceFactory(PieceType.PAWN, Color.BLACK).build());
        board.placePiece(Square.F7, new PieceFactory(PieceType.PAWN, Color.BLACK).build());
        board.placePiece(Square.G7, new PieceFactory(PieceType.PAWN, Color.BLACK).build());
        board.placePiece(Square.H7, new PieceFactory(PieceType.PAWN, Color.BLACK).build());
        
        return board;
    }
}