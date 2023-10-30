import java.util.*;
public class MazeTest
{
    public static void main(String[] args)
    {
        Maze maze = new Maze();
        maze.loadMaze("maze-1");
        Square square = maze.getStart();
        System.out.println(square.getRow());
        System.out.println(square.getCol());
        System.out.println(square);
        ArrayList<Square> sq = new ArrayList<>();
        sq = maze.getNeighbors(square);

        for (Square s: sq)
        {
            System.out.println(s);
        }
        //maze.getStart();
        square = maze.getFinish();

        System.out.println(square.getRow());
        System.out.println(square.getCol());
        System.out.println(square);
    }
}  