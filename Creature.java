import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Creature extends Actor
{
    /**
     *  atEdgeOfWorld checks to see if the creatures are touching the edge of
     *  the world
     *  @param there is a boolean for true or false
     *  @return there are no returns
     */
    public boolean atEdgeOfWorld()
    {
        return getX()<5 || getY()<5 || getX()>getWorld().getWidth()-5 || getY()>getWorld().getHeight()-5;
    }   
}
