import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 10 marks
 */
public class Frog extends Creature
{
    // The Frog's speed ...
    private int speed;
    
    public Frog()
    {        
        // set the Frog's speed to a random number between 4 and 8
        speed = Greenfoot.getRandomNumber(4) + 4; 
    }
    
    public void act() 
    {
        // make the Frog move at its speed, in the direction it is facing
        frogWalk();
        /*
         * Make the frog turn off course 35% of the time.
         * It will turn left or right 15 degrees equally as often. 
         */ wobble();
        
        /*
         * If the frog is near an edge of the world, make it turn
         * 7 degrees to the right. 
         * 
         * Hint: use the atEdgeOfWorld method in the Creature class.
         */wall();
        
        
        /*
         * If the frog encounters the fly, the game ends, so
         * stop the scenario 
         */ 
        consume();
        
    }
    /**
     * frogWalk makes the frog walk(big suprise) at the pace set
     * by speed which is chosen randomly between 4 and 8
     * @There are no parameters
     * @return there is no return
     */
    private void frogWalk()
    {
        move(speed);

    }
    /**
     * wobble makes the frog wobble when it walks
     * it does so by choosing a random number between 0 and 100
     * and if it is less then 35 then 50% of the time it is less 35
     * it will turn either 15 degrees or -15 degrees
     * @param there are no parameters
     * @there is no return
     */
    private void wobble()
    {
        if(Greenfoot.getRandomNumber(100) < 35)
        {
            if(Greenfoot.getRandomNumber(2) < 1)
            {
                turn(-15);  
            }
            else
            {
                turn(15);
            }
        }
    }
    
    private void wall()
    {
        if(isAtEdge())
        {
            turn(7);
        }
    }
    
    private void consume()
    {
        if(isTouching(Fly.class) == true)
        {
            removeTouching(Fly.class);
            Greenfoot.stop();
        }
    }
}




