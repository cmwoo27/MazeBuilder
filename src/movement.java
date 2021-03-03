import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

public class movement implements KeyListener
{
    /*public boolean rightPressed = false;
    public boolean leftPressed = false;
    public boolean upPressed = false;
    public boolean downPressed = false;*/

    public movement()
    {
    }

    public void keyTyped(KeyEvent e)
    {
    }

    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            //System.out.println("right press");
            //rightPressed = true;
        }

        if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            //System.out.println("left press");
            //leftPressed = true;
        }

        if(e.getKeyCode() == KeyEvent.VK_UP)
        {
            //System.out.println("up press");
            //upPressed = true;
        }

        if(e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            //System.out.println("down press");
            //downPressed = true;
        }
    }

    public void keyReleased(KeyEvent e) //actual stuff happens on key release, not press; to change, just swap method headers
    {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
        {

            System.out.println(maze.tileArray[maze.firstPlayer.getCoordX() / 50 + 1][maze.firstPlayer.getCoordY() / 50].getType());

            if(maze.tileArray[maze.firstPlayer.getCoordX() / 50 + 1][maze.firstPlayer.getCoordY() / 50].getType().equals("GAME")) //only did it with the right move cause its messy af and im lazy
            {
                if(!maze.tileArray[maze.firstPlayer.getCoordX() / 50 + 1][maze.firstPlayer.getCoordY() / 50].isGameRun())
                {
                    maze.tileArray[maze.firstPlayer.getCoordX() / 50 + 1][maze.firstPlayer.getCoordY() / 50].playerHere();
                    maze.tileArray[maze.firstPlayer.getCoordX() / 50][maze.firstPlayer.getCoordY() / 50].playerOut();

                    maze.firstPlayer.moveTo(maze.firstPlayer.getCoordX() + 50, maze.firstPlayer.getCoordY());

                    runner.gameActive = false;
                    System.out.println("false");
                    System.out.println(runner.gameActive);
                }
            }

            if(maze.tileArray[maze.firstPlayer.getCoordX() / 50 + 1][maze.firstPlayer.getCoordY() / 50].getPassable())
            {
                maze.tileArray[maze.firstPlayer.getCoordX() / 50 + 1][maze.firstPlayer.getCoordY() / 50].playerHere();
                maze.tileArray[maze.firstPlayer.getCoordX() / 50][maze.firstPlayer.getCoordY() / 50].playerOut();

                maze.firstPlayer.moveTo(maze.firstPlayer.getCoordX() + 50, maze.firstPlayer.getCoordY());
            }

            System.out.println(maze.firstPlayer.getCoordX() / 50 + ", " + maze.firstPlayer.getCoordY() / 50); //new pos
        }

        if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            System.out.println(maze.tileArray[maze.firstPlayer.getCoordX() / 50 - 1][maze.firstPlayer.getCoordY() / 50].getType());

            if(maze.tileArray[maze.firstPlayer.getCoordX() / 50 - 1][maze.firstPlayer.getCoordY() / 50].getPassable())
            {
                maze.tileArray[maze.firstPlayer.getCoordX() / 50 - 1][maze.firstPlayer.getCoordY() / 50].playerHere();
                maze.tileArray[maze.firstPlayer.getCoordX() / 50][maze.firstPlayer.getCoordY() / 50].playerOut();

                maze.firstPlayer.moveTo(maze.firstPlayer.getCoordX() - 50, maze.firstPlayer.getCoordY());
            }
            System.out.println(maze.firstPlayer.getCoordX() / 50 + ", " + maze.firstPlayer.getCoordY() / 50); //new pos
        }

        if(e.getKeyCode() == KeyEvent.VK_UP)
        {
            System.out.println(maze.tileArray[maze.firstPlayer.getCoordX() / 50][maze.firstPlayer.getCoordY() / 50 - 1].getType());

            if(maze.tileArray[maze.firstPlayer.getCoordX() / 50][maze.firstPlayer.getCoordY() / 50 - 1].getPassable())// && maze.tileArray[maze.firstPlayer.getCoordX() / 50][maze.firstPlayer.getCoordY() / 50 - 2].getPassable() && maze.tileArray[maze.firstPlayer.getCoordX() / 50][maze.firstPlayer.getCoordY() / 50 + 1].getPassable() == false)
            {
                maze.tileArray[maze.firstPlayer.getCoordX() / 50][maze.firstPlayer.getCoordY() / 50 - 1].playerHere();//2].playerHere();
                maze.tileArray[maze.firstPlayer.getCoordX() / 50][maze.firstPlayer.getCoordY() / 50].playerOut();

                maze.firstPlayer.moveTo(maze.firstPlayer.getCoordX(), maze.firstPlayer.getCoordY() - 50);// * 2); //HERE
            }
            System.out.println(maze.firstPlayer.getCoordX() / 50 + ", " + maze.firstPlayer.getCoordY() / 50); //new pos
        }

        if(e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            System.out.println(maze.tileArray[maze.firstPlayer.getCoordX() / 50][maze.firstPlayer.getCoordY() / 50 + 1].getType());

            if(maze.tileArray[maze.firstPlayer.getCoordX() / 50][maze.firstPlayer.getCoordY() / 50 + 1].getPassable())
            {
                maze.tileArray[maze.firstPlayer.getCoordX() / 50][maze.firstPlayer.getCoordY() / 50 + 1].playerHere();
                maze.tileArray[maze.firstPlayer.getCoordX() / 50][maze.firstPlayer.getCoordY() / 50].playerOut();

                maze.firstPlayer.moveTo(maze.firstPlayer.getCoordX(), maze.firstPlayer.getCoordY() + 50);
            }
            System.out.println(maze.firstPlayer.getCoordX() / 50 + ", " + maze.firstPlayer.getCoordY() / 50); //new pos
        }

        if(e.getKeyCode() == KeyEvent.VK_SPACE)
        {
            System.out.println("space pressed");
        }
    }
}
