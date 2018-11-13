import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scoreboard extends Actor
{
    private int points;
    private Font myFont = new Font("Comic Sans MS", true,false,24);
    
    /**
     *  scoreboard sets up stuff for scoreboardy things
     *  @param there are no parameters
     *  @return there are no returns
     */
    /**
     * scroreboard somehow through some wizard magic half sets up the scoreboard
     * @param there are no parameters
     */
    public scoreboard()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setFont( myFont );
        img.drawString("Score: " + points,5,25);
        setImage(img);
    }
    /**
     * adds stuff to the set up scoreboard
     * @param there are no parameters
     * @return returns points to the points int
     */
    /**
     * addToScore tells the program to update the scoreboard
     * @param there are no parameters
     * @return there are no returns
     */
    public void addToScore()
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
        img.drawString("Score: " + points, 5,25);
    }
    
}
