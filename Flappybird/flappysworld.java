import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class flappysworld extends World
{
    
    public void main(){

        //Gameover game = new Gameover(); 
        bckgrnd background = new bckgrnd();
        flappybird flap = new flappybird(); 
        HealthPoints hp = new HealthPoints();
        addObject(background, 300, 300);
        addObject(flap,100,400);
        addObject(hp,500,50);
        //showText("ScorePts: "+ 3, 200, 22);

    }
    

    public flappysworld()
    {    
        super(600, 600, 1,false); 
       
        
        main();
        //showText("Score: "+ 3, 200, 22);

    }

    public void act(){
        
        
        
    }
}

//
        
