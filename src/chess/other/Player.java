package chess.other;

import chess.other.Color;
import chess.pieces.Bishop;
import chess.pieces.King;
import chess.pieces.Knight;
import chess.pieces.Pawn;
import chess.pieces.Queen;
import chess.pieces.Rook;

public class Player
{
    private String name;
    private Color color;

    public Player()
    {
        this("");
    }
    
    public Player(String name)
    {
        this.name = name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setColor(Color color)
    {
        this.color = color;
    }
}