package tiles;

import java.awt.*;

public class gameEnd extends tile
{
    boolean gameRun = false;

    public gameEnd(int coordX, int coordY)
    {
        super(coordX, coordY, Color.CYAN, true, "SQUARE", false);
        type = "GAME";
    }
}
