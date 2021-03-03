import tiles.tile;

import javax.swing.*;
import java.time.Clock;

public class runner extends JPanel
{
    static int winX = maze.desiredArray[0].length * 50 + 50; //window size x form tiles.tile # * tiles.tile size (varies based on screen res)
    static int winY = maze.desiredArray.length * 50 + 80; //window size y form tiles.tile # * tiles.tile size (varies based on screen res)

    public static boolean gameActive = true; //temp

    //private static Clock clock = Clock.systemUTC();
    //public static long time = 0;

    public static void main(String args[])
    {
        System.out.println("RUNNING...");
        //maze
        maze.main(args);

        //frame
        JFrame frame = new JFrame("Java Test Game");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(winX, winY);

        //visuals
        visuals newStage = new visuals();
        frame.add(newStage);
        frame.repaint();

        //movement
        movement playerMove = new movement();
        frame.addKeyListener(playerMove); //adds KeyListener to JFrame

        //player movement
        while(gameActive)
        {
            frame.repaint();
            //time += clock.millis(); //not sure this is the best way
            /*if(time % 100000 == 0) //movement in a direction
            {
                if(maze.tileArray[maze.firstPlayer.getCoordX() / 50][maze.firstPlayer.getCoordY() / 50 + 1].getPassable())
                {
                    frame.repaint();
                    maze.firstPlayer.moveTo(maze.firstPlayer.getCoordX(), maze.firstPlayer.getCoordY() + 1);
                    frame.repaint();
                }
            }*/
        }

        System.out.println("GAME HAS ENDED");
        frame.getDefaultCloseOperation();
    }

    public void endGame()
    {
        gameActive = false;
    }
}
