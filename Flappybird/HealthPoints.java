import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthPoints here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthPoints extends Actor
{
    int id=0;
    public HealthPoints(int pId){
        id = pId;
    }
    public int getId(){
        return id;
    }
    public void setImg(){
        if(this.id==0){
            switch(getWorld().getObjects(flappybird.class).get(0).getHealth()){
                case 1:
                System.out.println("Test");
            }
        }
    }
    public void act(){
        
        //System.out.println("asd");
        //System.out.println(flappybird.health);

    }
}
