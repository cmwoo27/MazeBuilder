package tiles;

import java.awt.*;

public class tile
{
    int coordX; //x-coord, where x++ towards right
    int coordY; //y-coord, where y++ towards bottom
    Color color; //color of tile
    boolean passable; //whether or not you can pass through a tile
    String shape; //used for any irregular shapes
    boolean playerPos; //used for tiles you can walk on
    String type = "TILE";
    boolean interactable = false; //used for player interaction
    boolean gameRun = true;

    public tile(int coordX, int coordY, Color color, boolean passable, String shape, boolean playerPos) //constructor can maybe be used for a custom tiles.tile..? idk
    {
        this.coordX = coordX;
        this.coordY = coordY;
        this.color = color;
        this.passable = passable;
        this.shape = shape;
        this.playerPos = playerPos;
    }

    public int getCoordX()
    {
        return coordX;
    }

    public int getCoordY()
    {
        return coordY;
    }

    public Color getColor()
    {
        return color;
    }

    public boolean getPassable()
    {
        return passable;
    }

    public String getShape()
    {
        return shape;
    }

    public boolean isPlayer() { return playerPos; }

    public String getType()
    {
        return type;
    }

    public void playerHere()
    {
        playerPos = true;
    }

    public void playerOut()
    {
        playerPos = false;
    }

    public boolean isGameRun()
    {
        return gameRun;
    }
}
