
public class MazeSolverQueue extends MazeSolver{
    MyQueue<Square> worklist;
    public MazeSolverQueue(Maze maze)
    {
        super(maze);
    }
    
    public void makeEmpty()
    {
        worklist = new MyQueue<>();
    }

    public boolean isEmpty()
    {
        return worklist.isEmpty();
    }

    public void add(Square sq)
    {
        worklist.enqueue(sq);
    }

    public Square next()
    {
        return worklist.dequeue();
    }
}
