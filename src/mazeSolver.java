import java.util.ArrayList;
import java.util.Stack;

public abstract class MazeSolver
{
    public abstract void makeEmpty();

    public abstract boolean isEmpty();

    public abstract void add(Square sq);

    public abstract Square next();

    private Maze maze;
    private String solution;

    public MazeSolver(Maze maze)
    {
        this.maze = maze;
        this.makeEmpty();
        this.add(maze.getStart());
    }

    public boolean isSolved()
    {
        return this.isEmpty() || solution != null;
    }
    
    public String getPath()
    {
        if(solution == null)
        {
            return "No solution found.";
        }
        
        return solution;
    }

    public Square step()
    {
        // ArrayList<Square> toCheck;
        Square current = null;
        ArrayList<Square> neighbors;

        if(!this.isEmpty())
        {
            current = this.next();
            
            if(current.getType() == 3)
            {
                Stack<Square> path = new Stack<>();
                Square iterator = current;
                
                while(iterator.getPrevious().getType() != 2)
                {
                    path.push(iterator.getPrevious());
                    iterator = iterator.getPrevious();
                }

                StringBuilder sb = new StringBuilder();
                Square temp;

                while(!path.isEmpty())
                {
                    temp = path.pop();

                    sb.append("[" + temp.getRow() + "," + temp.getCol() + "]");
                }

                solution = new String(sb);

                return current;
            }

            neighbors = maze.getNeighbors(current);

            for(Square s : neighbors)
            {
                if(s.getType() == 0)
                {
                    s.setPrevious(current);
                    s.setType(4);
                    this.add(s);
                }
            }

            current.setType(5);
        }
        
        return current;
    }

    public void solve()
    {
        while(!this.isSolved())
        {
            step();
        }
    }
}
