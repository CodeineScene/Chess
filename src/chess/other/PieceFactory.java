package chess.other;

import chess.other.Color;
import chess.pieces.Bishop;
import chess.pieces.King;
import chess.pieces.Knight;
import chess.pieces.Pawn;
import chess.pieces.Piece;
import chess.pieces.Queen;
import chess.pieces.Rook;

public class PieceFactory
{
    PieceType pieceType;
    Color color;
    
    public PieceFactory(PieceType pieceType, Color color)
    {
        setType(pieceType);
        setColor(color);
    }
    
    private PieceFactory setType(PieceType pieceType)
    {
        this.pieceType = pieceType;
        return this;
    }
    
    private PieceFactory setColor(Color color)
    {
        this.color = color;
        return this;
    }
            
    public Piece build()
    {
        Piece newPiece = null;
        
        switch(this.pieceType)
        {
            case KING:
                newPiece = new King();
                break;
            case QUEEN:
                newPiece = new Queen();
                break;
            case ROOK:
                newPiece = new Rook();
                break;
            case BISHOP:
                newPiece = new Bishop();
                break;
            case KNIGHT:
                newPiece = new Knight();
                break;
            case PAWN:
            default:
                newPiece = new Pawn();
                break;
        }
        
        newPiece.setColor(this.color);
        
        return null;
    }
}