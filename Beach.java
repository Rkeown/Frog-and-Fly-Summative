import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 5 marks
 */
public class Beach extends World
{
    private scoreboard score;
    public Beach()
    {    
       super(800, 600, 1); 

       addFood(10);

       // add a Fly object at a random position somewhere in the world
       addObject(new Fly(), Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(600));
       // add a Frog object at the center of the world 
       addObject(new Frog(), getWidth()/2, getHeight()/2);
       
       score = new scoreboard();
       addObject( score, 75, 25);
       

    }
    public void act()
    {
       if(getObjects(Food.class).size()==0)
       {
           addFood(10);
       }  
    }
    
    
    /**
     * Adds n Food objects to the world
     */
    public void addFood(int n)
    {
        for(int f=0; f<n; f++) {
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            addObject(new Food(),x,y);
        }
    }
    public void update()
    {
        score.addToScore();
    }
}
