package chess.other;

import chess.other.Color;
import chess.other.Board;

public class Game
{
    Board board;
    
    public Game(Player a, Player b)
    {
        this(a, b, Math.random() > 0.5);
    }
    
    public Game(Player a, Player b, boolean leftPlayerStarts)
    {
        if (leftPlayerStarts)
        {
            a.setColor(Color.WHITE);
            b.setColor(Color.BLACK);
        }
        else
        {
            a.setColor(Color.BLACK);
            b.setColor(Color.WHITE);
        }
        
        board = Board.create();
    }
}