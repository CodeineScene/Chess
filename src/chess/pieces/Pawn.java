package chess.pieces;

import chess.other.Color;
import chess.other.Square;

public class Pawn extends Piece
{
    @Override
    public boolean isValidMove(Square start, Square finish)
    {
        int diffI = Math.abs(finish.getI() - start.getI());
        int diffJ = finish.getJ() - start.getJ();
        
        if (this.color == Color.WHITE && diffJ < 0)
            return false;
        else if (this.color == Color.BLACK && diffJ > 0)
            return false;
        
        diffJ = Math.abs(diffJ);
        
        if (diffJ == 2)
            return diffI == 0;
        
        if (diffJ == 1)
            return diffI < 2;
        
        return false;
    }
}