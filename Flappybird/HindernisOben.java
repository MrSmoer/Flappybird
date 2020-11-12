import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HindernisOben here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HindernisOben extends flappybird
{
    public void act() 
    {
        setLocation(getX()-10,getY());
        if(getX()==10){
            score++;
        }
        //dwad
    }    
}
