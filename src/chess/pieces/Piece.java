package chess.pieces;

import chess.actions.Movable;
import chess.other.Color;
import chess.other.Player;

public abstract class Piece implements Movable
{
    protected Color color;
    
    public void setColor(Color color)
    {
        this.color = color;
    }
}
