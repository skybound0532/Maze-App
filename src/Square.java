public class Square
{
    private int row;
    private int col;
    private int type;
    
    public Square(int row, int col, int type)
    {
        this.row = row;
        this.col = col;
        this.type = type;
    }

    public String toString()
    {
        if(type==0) return "_";
        if(type==1) return "#";
        if(type==2) return "S";
        if(type==3) return "E";
        if(type==4) return "o";
        if(type==5) return ".";
        return "x";
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
}
