package tiles;

import java.awt.*;

public class player extends tile
{
    public player(int coordX, int coordY)
    {
        super(coordX, coordY, Color.RED, true, "CIRCLE", false);
        type = "PLAYER";
    }

    public void moveTo(int x, int y)
    {
        coordX = x;
        coordY = y;
    }
}
