import javax.swing.*;
import java.awt.*;

public class visuals extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        for(int x = 0; x < maze.tileArray.length; x++)
        {
            for (int y = 0; y < maze.tileArray[x].length; y++)
            {
                if(maze.tileArray[x][y].isPlayer())
                {
                    //behind the shape
                    g.setColor(maze.tileArray[x][y].getColor());
                    g.drawRect(maze.tileArray[x][y].getCoordX(), maze.tileArray[x][y].getCoordY(), 50, 50);
                    g.fillRect(maze.tileArray[x][y].getCoordX(), maze.tileArray[x][y].getCoordY(), 50, 50);

                    //actual shape
                    g.setColor(maze.firstPlayer.getColor());

                    g.drawOval(maze.firstPlayer.getCoordX() + 5, maze.firstPlayer.getCoordY() + 5, 40, 40);
                    g.fillOval(maze.firstPlayer.getCoordX() + 5, maze.firstPlayer.getCoordY() + 5, 40, 40);
                }

                if(!maze.tileArray[x][y].isPlayer() && maze.tileArray[x][y].getShape().equals("SQUARE"))
                {
                    g.setColor(maze.tileArray[x][y].getColor());
                    g.drawRect(maze.tileArray[x][y].getCoordX(), maze.tileArray[x][y].getCoordY(), 50, 50);
                    g.fillRect(maze.tileArray[x][y].getCoordX(), maze.tileArray[x][y].getCoordY(), 50, 50);
                }
            }
        }
    }


}
