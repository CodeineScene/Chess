package chess;

import chess.other.Game;
import chess.other.Player;


public class MainClass
{
    public static void main(String[] args)
    {
        Player playerOne = new Player();
        Player playerTwo = new Player();
        
        Game game = new Game(playerOne, playerTwo);
    }
}