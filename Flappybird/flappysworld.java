import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class flappysworld extends World
{
        HealthPoints hp0 = new HealthPoints(0);
        HealthPoints hp1 = new HealthPoints(1);
        HealthPoints hp2 = new HealthPoints(2);
    public void main(){

        //Gameover game = new Gameover(); 
        bckgrnd background = new bckgrnd();
        flappybird flap = new flappybird(); 
        /*HealthPoints hp0 = new HealthPoints(0);
        HealthPoints hp1 = new HealthPoints(1);
        HealthPoints hp2 = new HealthPoints(2);*/
        addObject(background, 300, 300);
        addObject(flap,100,400);
        addObject(hp2,510,50);
        addObject(hp1,520,50);
        addObject(hp0,530,50);
        //showText("ScorePts: "+ 3, 200, 22);

    }
    

    public flappysworld()
    {    
        super(600, 600, 1,false); 
       
        
        main();
        //showText("Score: "+ 3, 200, 22);

    }

    public void act(){
        showText("ScoreHea: "+ getObjects(flappybird.class).get(0).getHealth(), 200, 22);
        
        
        
        
    }
    public HealthPoints getHealthPoints(int id){
        HealthPoints myHp = null;
        switch(id){
            case 0:
            myHp = hp0;
            break;
                
            case 1:
            myHp = hp1;
            break;
                
            case 2:
            myHp = hp2;
            break;
                
        }
        return myHp;
    }
}

//
        
