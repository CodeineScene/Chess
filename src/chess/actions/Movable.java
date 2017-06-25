package chess.actions;

import chess.other.Square;

public interface Movable 
{
    public boolean isValidMove(Square start, Square finish);
}
