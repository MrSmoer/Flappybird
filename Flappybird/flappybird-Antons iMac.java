import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flappybird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flappybird extends Actor
{
    double dy = -10;
    double a=2;
    int takt=0;
    int tFallStart=0;
    int tFall=0;
    int sFall=0;
    int sStart = 0;
    int v0 = -20;
    boolean fallend=false;
    boolean fallendStart=true;
    boolean keyHeld=false;

    /**
     * Act - do whatever the flappybird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        takt++;
        /*//dy=-10;

        if(fallendStart==true){
        sStart = getY();
        System.out.println("Fallstart");
        System.out.println(sStart);
        int tFallStart = takt;
        fallend=true;
        fallendStart=false;

        }
        if(fallend==true){
        tFall=takt-tFallStart;
        sFall=(int)a/2*(tFall*tFall);
        setLocation(getX(),sFall+sStart);
        System.out.println("fallend");
        }
        if (Greenfoot.isKeyDown​("up")) {
        setLocation( getX(),(int)(getY()-50));
        }   
        //setLocation(getX(),(int)(getY()+10));
         */
        if(sStart==0){//wird am Anfang einmal ausgeführt kalibrierung Fall engine
            sStart=getY();
        }
        if(isAtEdge()){//Gameover Abfrage
            getWorld().addObject(new Gameover(),300,200);
        } 

        
        if (Greenfoot.isKeyDown​("up")) {//Ausführung beim Sprung
            if(keyHeld==false){//keyHeld sorgt dafür, dass die taste nicht gedrückt gehalten werden kann, sondern nur getriggert
                tFallStart=takt;
                sStart=getY();
                keyHeld=true;
            }
        }else{//nachdem die Taste losgelassen wurde darf sie wieder gedrückt werden
            keyHeld=false;
        }
        tFall=takt-tFallStart;//Formel für Berechnung der bereits gefallenen Zeit 
        sFall=(int)a/2*(tFall*tFall)+v0*tFall;//Formel für Berechnung der Gefallenen Strecke
        setLocation(getX(),sFall+sStart);

    }   
}
