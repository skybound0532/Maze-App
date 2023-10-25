import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Maze
{
    private Square[][] maze;
    
    public Maze()
    {

    }

    boolean loadMaze(String fname)
    {
        String fileName = "src/" + fname;
        
        try (Scanner in = new Scanner(new File(fileName)))
        {
            int numRows = in.nextInt();
            int numCols = in.nextInt();

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
            ArrayList.add(maze[row - 1][col]);
        }
    }
}
