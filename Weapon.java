import java.util.List;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.awt.Graphics;

public  class Weapon implements Drawable{

    protected double damage;
    protected double rate;
    protected BufferedImage image;
    protected Pair position;
    protected Pair collider; 
    protected boolean picked;
    protected int index = 0;
    protected MainCharacter hero;
    private int ammo = 30;
    private Bullet[] bullets = new Bullet[ammo];

    public Weapon(Pair position, double damage, double rate, BufferedImage image, MainCharacter hero){
        this.damage = damage;
        this.hero = hero;
        this.rate = rate;
        this.image = image;
        this.position = position;
        this.bullets = new Bullet[ammo];
        this.initAmmo();
        this.collider = new Pair(image.getWidth(), image.getHeight());
    }
    public double getDamage(){
        return damage;
    }
    public void draw(Graphics g){
        g.drawImage(image, (int)position.getX(), (int)position.getY(),(int)collider.getX(),(int)collider.getY(), null);
    }
    public void shoot(double x, double y){
        if (bullets.length != 0 && bullets[index] != null){
            // 8 segments
            this.bullets[index].setAllowedDraw(true);
            //double scaleX = (double) hero.getPosition().getX() / Main.WORLD_WIDTH  ;
            //double scaleY = (double)  hero.getPosition().getY() / Main.WORLD_HEIGHT;
            //double X = (Main.SCREEN_WIDTH* scaleX);
            //double Y = (Main.SCREEN_HEIGHT* scaleY);
            // double posX = hero.getPosition().getX();
            // double posY = hero.getPosition().getY();
            // double dx = posX - x; // screen x 
            // double dy = posY - y;
             
            // double angle = Math.atan(dy/dx);

            // double sendY =  Math.sin(angle)*200;//somefactor
            // double sendX =  Math.cos(angle)*200;//same somefactor
            /* 
            double posX = hero.getPosition().getX();
            double posY = hero.getPosition().getY();
            double dx = posX - x; // screen x 
            double dy = posY - y;

// Calculate the angle from the horizontal axis to the point (x, y)
                double angle = Math.atan2(dy, dx);
            

            // Calculate the vector components with a magnitude of 200
            double sendY = Math.sin(angle) * 1000;
            double sendX = Math.cos(angle) * 1000;
//System.out.println("x:"+sendX +" y:"+sendY);

            double degrees = Math.toDegrees(angle);
            //double xbound = 50;
            //double ybound = 50;
            bullets[index].position = new Pair(posX,posY);
            */
            double posX = hero.getPosition().getX();
            double posY = hero.getPosition().getY();
            bullets[index].position = new Pair(posX,posY);
            //relative positions on screen
            double fishX=1000;
            double fishY=600;
            //these are at angles

            

            if (x<fishX&&y<fishY-50){
                bullets[index].setVelocity(new Pair(-1000,-1000));
                bullets[index].setImage(Figures.smallBulletImageUpLeft);
                System.out.println("x: " +x+"\ny: "+y);
            }
            else if (x>fishX&&y<fishY-50){
                bullets[index].setVelocity(new Pair(1000,-1000));
                //bullets[index].setImage(Figures.smallBulletImageUpRight);
                bullets[index].setImage(Figures.smallBulletImageUpLeft);
                System.out.println("UPright");
                System.out.println("x: " +x+"\ny: "+y);
            }
            else if (x<fishX-50&&y>fishY+50){
                bullets[index].setVelocity(new Pair(-1000,1000));
                bullets[index].setImage(Figures.smallBulletImageDownLeft);
                System.out.println("x " +x);
            }
            else if (x>fishX&&y>fishY+50){
                bullets[index].setVelocity(new Pair(1000,1000));
                bullets[index].setImage(Figures.smallBulletImageDownLeft);
                //bullets[index].setImage(Figures.smallBulletImageDownRight);
                System.out.println("Down RIGHT"+"\nx: " +x+"\ny: "+y);
            }
            else if ((y>fishY-50)&&y<fishY+50 &&x>fishX){
                bullets[index].setVelocity(new Pair(-1000,01));
                bullets[index].setImage(Figures.smallBulletImageLeft);

            }

            //these are for the right angles
            
            else if (x==fishX && y<fishY){
                bullets[index].setVelocity(new Pair(0,-1000));
                bullets[index].setImage(Figures.smallBulletImageUp);
            }
            else if (x==fishX && y>fishY){
                bullets[index].setVelocity(new Pair(0,1000));
                bullets[index].setImage(Figures.smallBulletImageDown);

            }
            else if (y==fishY && x<fishX){
                bullets[index].setVelocity(new Pair(-1000,0));
                bullets[index].setImage(Figures.smallBulletImageRight);
                System.out.println("right");

            }
            else if (y==fishY &&x>fishX){
                bullets[index].setVelocity(new Pair(1000,0));
                bullets[index].setImage(Figures.smallBulletImageLeft);

            }
            
            //bullets[index].setVelocity(new Pair(200 * Math.sin(angle), 200* Math.cos(angle) ));
            index++;
            if (index == 30) {
                for (Bullet bullet : bullets) {
                    bullet.setAllowedDraw(false);
                }
                index = 0; 
            }
                
        }
    }
    public void initAmmo(){
        for (int i = 0; i < bullets.length; i++) {
            bullets[i] = new Bullet(10,Figures.smallBulletImageLeft, this.hero);
        }
    }
    public List<Bullet> getBullets(){
        return Arrays.asList(bullets);
    }
    public void pickedUp(){
        // collision with player
        if (!picked){
            if (this.position.getX() < hero.position.getX() + hero.collider.getX() &&
            this.position.getX() + this.collider.getX() > hero.position.getX() &&
            this.position.getY() < hero.position.getY() + hero.collider.getY() &&
            this.position.getY() + this.collider.getY() > hero.position.getY()) {
                image = null;
                hero.setImage(Figures.handgunwfishImage);
                hero.setWeapon(this);
                this.position = new Pair(hero.getPosition().getX(), hero.getPosition().getY());
                if (hero.velocity.getX() >= 0) hero.setRight(false);
                else if (hero.velocity.getX() < 0) hero.setRight(true);
                picked = true;

            }
        }
    }    public static void main(String[] args) {
    }
}