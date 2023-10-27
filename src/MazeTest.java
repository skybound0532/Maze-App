import java.util.*;
public class MazeTest
{
    public static void main(String[] args)
    {
        Maze maze = null;;
        maze.loadMaze("maze-1");
        ArrayList <Square> sq = new ArrayList<>();
        maze.getNeighbors(Square sq);
        //maze.getStart();
        //maze.getFinish();
    }
}  