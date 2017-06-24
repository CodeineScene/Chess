package pieces;

import actions.Movable;
import other.Player;

public abstract class Piece implements Movable
{
    private Player owner;
    
    public Player getOwner()
    {
        return owner;
    }
    
    public Piece setOwner(Player owner)
    {
        this.owner = owner;
        return this;
    }
}
