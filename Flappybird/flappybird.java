import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class flappybird extends Actor
{
    double a=1.3;
    int takt=0;
    int tFallStart=0;
    int tFall=0;
    int sFall=0;
    int sStart = 0;
    int v0 = -12;
    int spwnbckgrnd=0;
    int health = 8;
    int invincibleCount = 0;
    boolean fallend=false;
    boolean fallendStart=true;
    boolean keyHeld=false;
    boolean invincible=false;
    int spawnAbstand=50;
    int spawncount=0;
    public static int score=0;
    public flappybird(){//Konstruktor, beim erzeugen ausgeführt
        
    }
    public void act() 
    {
        jump();
        background();
        count();
        spawnTubes();
        score();
        checkHealth();
        //testtetsd
    } 
    public void count(){
        takt++;
        System.out.println(takt);
    }
    public int getHealth(){
        return health;
    }
    public void checkHealth(){
        //RöhrenBerührung
        
        if(isTouching(HindernisUnten.class)||isTouching(HindernisOben.class)||(getY()>600||getY()<0)){//Gameover Abfrage
            //System.out.println("Game over");
            //getWorld().stop();
            //HealthPoints.setImg();
            //System.out.println(health+"asd");
            if(invincible){
                invincibleCount++;
                if(invincibleCount>=20){
                    invincible=false;
                    invincibleCount=0;
                }
            }else {
                health--;
                invincible = true;
            }
            

        } 
        if(health<=0){
           Greenfoot.setWorld(new flappysworld());
           score=0;
        }
        
    }
    //Zeigt Score an
    public void score(){
        getWorld().showText("Score:asdf "+score, 60, 22);
    }
    //Spawnt Röhren
    public void spawnTubes(){
        //System.out.println(spawncount);
        spawncount++;
        if(spawncount==spawnAbstand){
            int hoehe=0;
            hoehe=Greenfoot.getRandomNumber(300)-100;
            getWorld().addObject(new HindernisOben(),800, hoehe);
            getWorld().addObject(new HindernisUnten(),800, hoehe+600);
            spawncount=0;
        }
    }
    //Bewegt Hintergrund
    public void background(){
        spwnbckgrnd++;
        if(spwnbckgrnd>500){
            spwnbckgrnd=0;
            getWorld().addObject(new bckgrnd(), 600,300);
            getWorld().setPaintOrder(HealthPoints.class,HindernisOben.class,HindernisUnten.class,flappybird.class,bckgrnd.class);
        }

    }

    public void jump(){

        if(sStart==0){//wird am Anfang einmal ausgeführt kalibrierung Fall engine
            sStart=getY();
        }

        if (Greenfoot.isKeyDown​("up")||Greenfoot.mouseClicked(null)) {//Ausführung beim Sprung
            if(keyHeld==false){//keyHeld sorgt dafür, dass die taste nicht gedrückt gehalten werden kann, sondern nur getriggert
                tFallStart=takt;
                sStart=getY();
                keyHeld=true;
            }
        }else{//nachdem die Taste losgelassen wurde darf sie wieder gedrückt werden
            keyHeld=false;
        }
        tFall=takt-tFallStart;//Formel für Berechnung der bereits gefallenen Zeit 
        sFall=(int)(a/2*(tFall*tFall)+v0*tFall);//Formel für Berechnung der Gefallenen Strecke
        setLocation(getX(),sFall+sStart);
    }
}
