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
    // private boolean solved;

    public MazeSolver(Maze maze)
    {
        this.maze = maze;
        this.makeEmpty();
        this.add(maze.getStart());
        // solved = false;
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
                    temp.setType(6);

                    // solution += "[" + temp.getRow() + "," + temp.getCol() + "]";

                    sb.append("[" + temp.getRow() + "," + temp.getCol() + "]");
                }

                solution = new String(sb);
                // System.out.println(solution);
                // this.solved = true;
                // this.maze.reset();

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
                
                if(s.getType() == 3)
                {
                    s.setPrevious(current);
                    this.add(s);
                }
            }

            if(current.getType() == 4)
            {
                current.setType(5);
            }
        }
        
        return current;
    }

    public void solve()
    {
        while(!this.isSolved())
        {
            step();
        }

        this.maze.reset();
    }
}
