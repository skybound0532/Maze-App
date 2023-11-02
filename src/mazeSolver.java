

public abstract class MazeSolver
{
    public abstract void makeEmpty();

    public abstract boolean isEmpty();

    public abstract void add(Square sq);

    public abstract Square next();

    private Maze maze;
    private String solution;
    private boolean solved;

    public MazeSolver(Maze maze)
    {
        this.maze = maze;
        solved = false;
        makeEmpty();
    }

    public boolean isSolved()
    {
        return this.isEmpty() || solved;
    }
    
    public String getPath()
    {
        return solution;
    }

    public Square step()
    {
        ArrayList<Square> toCheck;
        
        if(!this.isSolved())
        {
            toCheck = this.next().getNeighbors();
            while
        }
    }

    public void solve()
    {
        while(!this.isSolved())
        {
            step();
        }
    }
}
