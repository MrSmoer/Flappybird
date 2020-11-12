import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthPoints here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthPoints extends Actor
{

    public void act(){
        getWorld().showText("ScoreHea: "+ getWorld().getObjects(flappybird.class).get(0).getHealth(), 200, 22);
        
        //System.out.println("asd");
        //System.out.println(flappybird.health);

    }
}
