public class Square
{
    private int row;
    private int col;
    private int type;
    private Square previous;
    
    public Square(int row, int col, int type)
    {
        this.row = row;
        this.col = col;
        this.type = type;
        this.previous = null;
    }

    public String toString()
    {
        switch(type)
        {
            case 0: return "_";
            case 1: return "#";
            case 2: return "S";
            case 3: return "E";
            case 4: return "o";
            case 5: return ".";
            default:
                return "x";
        }
    }

    public int getRow()
    {
        return row;
    }

    public int getCol()
    {
        return col;
    }

    public int getType()
    {
        return type;
    }

    public void setType(int type)
    {
        this.type = type;
    }

    public void reset()
    {
        if(this.type > 3)
        {
            type = 0;
        }
    }

    public Square getPrevious()
    {
        
        return previous;
    }

    public void setPrevious(Square prev)
    {
        this.previous = prev;
    }
}
