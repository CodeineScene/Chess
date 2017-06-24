package other;

import pieces.Bishop;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Piece;
import pieces.Queen;
import pieces.Rook;

public class PieceFactory
{
    
    PieceType piece;
    public Piece getPiece(PieceType type)
    {
        switch(type)
        {
            case KING:
                return new King();
            case QUEEN:
                return new Queen();
            case ROOK:
                return new Rook();
            case BISHOP:
                return new Bishop();
            case KNIGHT:
                return new Knight();
            case PAWN:
                return new Pawn();
        }
        
        return null;
    }
}