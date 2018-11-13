import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * Have the fly count how many Food object it eats (2 marks)
 * Every time the fly eats all 10 Food objects, add 10 more Food
 * objects to the world and continue playing. (3 marks)
 * 
 */
public class Fly extends Creature
{
    private int facing;
    /**
     *  Fly tells the fly sprite to face a random direction
     *  @param there are no parameters
     *  @return there are no returns
     */
    
    public Fly()
    {
        /*
         * modify this code to make the turtle face any random 
         * initial direction
         */
        facing = Greenfoot.getRandomNumber(360);
        setRotation( facing );
    }
    
    public void act() 
    {
        // make the fly move 4 steps in the direction it is facing
        checkKeys();
        /*
         * Make the fly turn left or right 5 degrees when
         * the left or right arrow key is pressed. 
         */
        
        
        /*
         * If the fly touches a Food object, remove the Food object
         * from the world. 
         */
        eatFruit();
        
    }   
    /**
     * checkKeys checks to see if a key is pressed either w,a,or s, and turn/moves
     * the fly in the desired direction
     * I didn't use "else if" because that only registers one key press where as
     * multiple if statements can run simultaniously making the movement smoother
     * @param none there are no parameters
     * @return the method returns inputs to the fly
     */
    /**
     *  checkKeys tell the program to move the fly when w, a, or s are pressed
     *  and moves the fly in the respective direction
     *  @param there are no parameters
     *  @return there are no returns
     */
    private void checkKeys()
    {
        if(Greenfoot.isKeyDown("w"))
        {
            move(5);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            turn(-5);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            turn(5);
        }
    }
    /**
     * eatFruit checks to see ifthe fly is touching a piece of fruit it removes it
     * @param there are no parameters
     * @return There are no returns
     */
    /**
     *  eatFruit tells the program to remove a piece of fruit when the fly is
     *  touching it
     *  @param there are no parameters
     *  @return there are no returns
     */
    private void eatFruit()
    {
        if(isTouching(Food.class) == true)
        {
            removeTouching(Food.class);
            ( (Beach)getWorld()).update();
        }
    }
}
