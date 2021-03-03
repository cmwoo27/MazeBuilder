import tiles.gameEnd;
import tiles.player;
import tiles.tile;
import tiles.wall;
import java.awt.*;

public class maze
{
    public static int [][] desiredArray = new int[][] //too lazy to fix coordinate system so array is flipped by making y = x in a new array
            {
                //0 = spawn, 1 = blank, 2 = wall, 9 = endGame
                    {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                    {2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 2},
                    {2, 1, 2, 2, 2, 2, 1, 2, 1, 2, 1, 2, 1, 2, 2, 1, 2, 2, 2},
                    {2, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 1, 1, 2, 1, 1, 1, 1, 2},
                    {2, 1, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2},
                    {2, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2},
                    {2, 1, 2, 1, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2},
                    {2, 1, 2, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 0},
                    {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2},
                    {2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9},
                    {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}
            };

    public static int [][] mazeArray = new int[desiredArray[0].length][desiredArray.length]; // = new int[][] //visual rep of maze is rot and flipped across y

    public static player firstPlayer = new player(0,0);

    public static tile [][] tileArray = new tile[mazeArray.length][mazeArray[0].length]; //tiles.tile rep of maze

    public static void main(String args[])
    {
        for(int x = 0; x < desiredArray.length; x++)
        {
            for(int y = 0; y < desiredArray[0].length; y++)
            {
                mazeArray[y][x] = desiredArray[x][y];
            }
        }

        System.out.println("maze working");

        for(int x = 0; x < mazeArray.length; x++)
        {
            for (int y = mazeArray[x].length - 1; y >= 0; y--)//HERE
            {
                if (mazeArray[x][y] == 0) //player spawn
                {
                    tileArray[x][y] = new tile(50 * x, 50 * y, Color.WHITE, true, "SQUARE", true);
                    //tileArray[x][y] = new player(0, 0);
                    firstPlayer.moveTo(50 * x, 50 * y);
                }


                if (mazeArray[x][y] == 1) //blank
                {
                    tileArray[x][y] = new tile(50 * x, 50 * y, Color.WHITE, true, "SQUARE", false);
                }

                if (mazeArray[x][y] == 2) //tiles.wall
                {
                    tileArray[x][y] = new wall(50 * x, 50 * y); //idk why i have to swap these

                }

                if (mazeArray[x][y] == 9)
                {
                    tileArray[x][y] = new gameEnd(50 * x, 50 * y); //this shit is messy af
                }
            }
        }
    }
}
