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
    int importantValue = 0;
    boolean active = false;
    public HealthPoints(int pId){
        id = pId;

    }
    public int getId(){
        return id;
    }

    public void setImg(int health){
        //System.out.println("Meine id: " + id);
        importantValue=health-(2*id);
        //System.out.println("Important value "+importantValue);
        //System.out.println("my ID: "+importantValue+" healt: "+ health);
        switch(health){
            case 1:
            case 2:
            if(id==0){
                active=true;
            }else active=false;
            break;

            case 3:
            case 4:
            if(id==1){
                active=true;
            }else active=false;
            break;

            case 5:
            case 6:
            if(id==2){
                active=true;
            }else active=false;
            break;

        }
        if(active){
            System.out.println(" ");
            if(importantValue==1){
                System.out.println(id+" Ich zeige: 1");
            }
            if(importantValue==2){
                System.out.println(id+" Ich zeige: 2");
            }
            if(importantValue==3){
                System.out.println(id+" Ich zeige: 3");
            }
            System.out.println(" ");
        }else ;//System.out.println(id+"zeigt"+importantValue);

    }

    public void act(){
        //System.out.println("asd");
        //System.out.println(flappybird.health);

    }
}
