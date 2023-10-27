import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Maze
{
    private Square[][] maze;
    private int numRows;
    private int numCols;
    
    public Maze()
    {

    }

    boolean loadMaze(String fname)
    {
        String fileName = "src/" + fname;
        
        try (Scanner in = new Scanner(new File(fileName)))
        {
            this.numRows = in.nextInt();
            this.numCols = in.nextInt();

            in.nextLine();

            this.maze = new Square[numRows][numCols];

            for(int row = 0; row < numRows; row++)
            {
                for(int col = 0; col < numCols; col++)
                {
                    maze[row][col] = new Square(row, col, in.nextInt());
                }
                
                in.nextLine();
            }

            /*
            for(int row = 0; row < numRows; row++)
            {
                for(int col = 0; col < numCols; col++)
                {
                    System.out.print(maze[row][col] + " ");
                }
                System.out.println();
            }
            */

            return true;
        }
        catch (FileNotFoundException e)
        {
            return false;
        }
    }

    public ArrayList<Square> getNeighbors(Square sq)
    {
        ArrayList<Square> results = new ArrayList<>();

        int row = sq.getRow();
        int col = sq.getCol();

        if(row > 0)
        {
            results.add(maze[row - 1][col]);
        }
        if(row < maze.length - 1)
        {
            results.add(maze[row + 1][col]);
        }
        if(col > 0)
        {
            results.add(maze[row][col - 1]);
        }
        if(col < maze[0].length - 1)
        {
            results.add(maze[row][col + 1]);
        }

        return results;
    }

    public Square getStart()
    {
        Square start = null;

        for(int row = 0; row < numRows; row++)
        {
            for(int col = 0; col < numCols; col++)
            {
                if(maze[row][col].getType() == 2);
                {
                    start = maze[row][col];
                }
            }
        }
        
        return start;
    }

    public Square getEnd()
    {
        Square end = null;

        for(int row = 0; row < numRows; row++)
        {
            for(int col = 0; col < numCols; col++)
            {
                if(maze[row][col].getType() == 3);
                {
                    end = maze[row][col];
                }
            }
        }
        
        return end;
    }

    public void reset()
    {
        for(int row = 0; row < numRows; row++)
        {
            for(int col = 0; col < numCols; col++)
            {
                maze[row][col].reset();
            }
        }
    }

    public String toString()
    {
        String result = null;
        
        for(int row = 0; row < numRows; row++)
        {
            for(int col = 0; col < numCols; col++)
            {
                result += (maze[row][col] + " ");
            }

            result += "\n";
        }

        return result;
    }
}
