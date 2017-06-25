package chess.pieces;

import chess.other.Square;

public class Queen extends Piece 
{
    @Override
    public boolean isValidMove(Square start, Square finish)
    {
        int diffI = Math.abs(finish.getI() - start.getI());
        int diffJ = Math.abs(finish.getJ() - start.getJ());
        
        return (diffI == diffJ && diffI != 0) 
                || (diffI > 0 && diffJ == 0) 
                || (diffJ > 0 && diffI == 0);
    }
}
