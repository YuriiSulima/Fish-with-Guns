import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Graphics2D;

public class Figures{

    public static BufferedImage heroImage;  
    public static BufferedImage mapImage1;
    public static BufferedImage mapImage2;
    public static BufferedImage rock1Image;  
    public static BufferedImage rock2Image;  
    public static BufferedImage rock3Image;  
    public static BufferedImage rock4Image;
    public static BufferedImage caveEntranceImage;    
    public static BufferedImage stalactite1Image;  
    public static BufferedImage stalactite2Image;  
    public static BufferedImage stalactite3Image;  
    public static BufferedImage stalactite4Image;  
    public static BufferedImage stalagmiteImage;  
    public static BufferedImage babyShrimpImage;  
    public static BufferedImage bigShrimpImage;  
    public static BufferedImage crabImage;  
    public static BufferedImage salmonImage;  
    public static BufferedImage schoolImage;  
    public static BufferedImage puffedImage;  
    public static BufferedImage unpuffedImage;  
    public static BufferedImage akImage;  
    public static BufferedImage bazookaImage;  
    public static BufferedImage doublehandgunImage;  
    public static BufferedImage handgunImage;  
    public static BufferedImage akwfishImage;  
    public static BufferedImage bazookawfishImage;  
    public static BufferedImage handgunwfishImage;  
    public static BufferedImage doublehandgunwImage;  
    public static BufferedImage smallBulletImageLeft; 
    public static BufferedImage smallBulletImageRight;  
    public static BufferedImage smallBulletImageUp;  
    public static BufferedImage smallBulletImageDown;  
    public static BufferedImage smallBulletImageUpLeft;  
    public static BufferedImage smallBulletImageUpRight;  
    public static BufferedImage smallBulletImageDownLeft;  
    public static BufferedImage smallBulletImageDownRight;  
    public static BufferedImage healthpowerup;  



    public static BufferedImage bigBulletImage;  
    
    public Figures(){
        try{
            heroImage = ImageIO.read(Figures.class.getResource("/hero.png"));
            mapImage1 = ImageIO.read(Figures.class.getResource("/water_draft_2.png"));
            mapImage2 = ImageIO.read(Figures.class.getResource("/water_draft_2_2.png"));
            rock1Image = ImageIO.read(Figures.class.getResource("/rock1.png"));
            rock2Image = ImageIO.read(Figures.class.getResource("/rock2.png"));
            rock3Image = ImageIO.read(Figures.class.getResource("/rock3.png"));
            rock4Image = ImageIO.read(Figures.class.getResource("/rock4.png"));
            stalactite1Image = ImageIO.read(Figures.class.getResource("/stalactite1.png"));
            stalactite2Image = ImageIO.read(Figures.class.getResource("/stalactite2.png"));
            stalactite3Image = ImageIO.read(Figures.class.getResource("/stalactite3.png"));
            stalactite4Image = ImageIO.read(Figures.class.getResource("/stalactite4.png"));
            stalagmiteImage = ImageIO.read(Figures.class.getResource("/stalagmite.png"));
            babyShrimpImage = ImageIO.read(Figures.class.getResource("/babyshrimp.png"));
            bigShrimpImage = ImageIO.read(Figures.class.getResource("/bigshrimp.png"));
            crabImage = ImageIO.read(Figures.class.getResource("/crab.png"));
            salmonImage = ImageIO.read(Figures.class.getResource("/salmon.png"));
            schoolImage = ImageIO.read(Figures.class.getResource("/school.png"));
            puffedImage = ImageIO.read(Figures.class.getResource("/puffered.png"));
            unpuffedImage = ImageIO.read(Figures.class.getResource("/unpuffed.png"));
            akImage = ImageIO.read(Figures.class.getResource("/ak.png"));
            bazookaImage = ImageIO.read(Figures.class.getResource("/bazooka.png"));
            doublehandgunImage = ImageIO.read(Figures.class.getResource("/doublehandgun.png"));
            handgunImage = ImageIO.read(Figures.class.getResource("/handgun.png"));
            akwfishImage = ImageIO.read(Figures.class.getResource("/akwfish.png"));
            bazookawfishImage = ImageIO.read(Figures.class.getResource("/bazookawfish.png"));
            doublehandgunwImage = ImageIO.read(Figures.class.getResource("/doublehandgunwfish.png"));
            handgunwfishImage = ImageIO.read(Figures.class.getResource("/handgunwfish.png"));
            caveEntranceImage = ImageIO.read(Figures.class.getResource("/caveentrance.png"));
            smallBulletImageLeft = ImageIO.read(Figures.class.getResource("/smallBulletLeft.png"));
            smallBulletImageRight = ImageIO.read(Figures.class.getResource("/smallBulletRight.png"));
            smallBulletImageDown = ImageIO.read(Figures.class.getResource("/smallBulletDown.png"));
            smallBulletImageUp = ImageIO.read(Figures.class.getResource("/smallBulletUp.png"));
            smallBulletImageUpLeft = ImageIO.read(Figures.class.getResource("/smallBulletUpLeft.png"));
            smallBulletImageDownLeft = ImageIO.read(Figures.class.getResource("/smallBulletDownLeft.png"));
            smallBulletImageUpRight = ImageIO.read(Figures.class.getResource("/smallBulletUpRight.png"));
            smallBulletImageDownRight = ImageIO.read(Figures.class.getResource("/smallBulletDownRight.png"));
            healthpowerup = ImageIO.read(Figures.class.getResource("/healthpowerup.png"));
        }
        catch (IOException e){
            e.getStackTrace();
        }
    }
    public static void main(String[] args) {
        Figures fig = new Figures();
    }
}