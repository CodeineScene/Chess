package chess.pieces;

import chess.other.Square;

public class King extends Piece 
{
    @Override
    public boolean isValidMove(Square start, Square finish)
    {
        int diffI = Math.abs(finish.getI() - start.getI());
        int diffJ = Math.abs(finish.getJ() - start.getJ());
        
        return diffI < 2 && diffJ < 2 && (diffI == 1 || diffJ == 1);
    }
}
