import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class Line here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Line extends Actor
{
    
    public Line()
    {
        GreenfootImage img = new GreenfootImage(15,80);
        img.setColor(Color.WHITE);
        img.fill();
        setImage(img);
    }
    
    /**
     * Act - do whatever the Line wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
