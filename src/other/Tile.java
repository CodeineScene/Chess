package other;

public class Tile
{
    private String[] heightNotation = {"1","2","3","4","5","6","7","8"};
    private String[] widthNotation = {"A","B","C","D","E","F","G","H"};
    
    private int i;
    private int j;
    
    public Tile(int i, int j)
    {
        this.i = i;
        this.j = j;
    }
    
    public String getCode()
    {
        return widthNotation[i] + heightNotation[j];
    }
}