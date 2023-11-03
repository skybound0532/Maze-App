

public class MazeSolverStack extends MazeSolver
{
    MyStack<Square> worklist;
    
    public MazeSolverStack(Maze maze)
    {
        super(maze);
    }

    public void makeEmpty()
    {
        worklist = new MyStack<>();
    }

    public boolean isEmpty()
    {
        return worklist.isEmpty();
    }

    public void add(Square sq)
    {
        worklist.push(sq);
    }

    public Square next()
    {
        return worklist.pop();
    }
}
