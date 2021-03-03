package tiles;

import tiles.tile;

import java.awt.*;

public class wall extends tile
{

    public wall(int coordX, int coordY)
    {
        super(coordX, coordY, Color.BLACK, false, "SQUARE", false);
        type = "WALL";
    }
}
