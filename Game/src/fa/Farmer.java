package fa;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class Farmer extends Crosser implements ICrosser {
     WritableImage imagee1,imagee2;
     String information;
     String img0;
     String img1;
     public Farmer (String image0,String image1)
    {
        img0=image0;
        img1=image1;
        setPositionX(0);
        setPositionY(0);
    }

    @Override
    public boolean canSail() {
        return true;
    }

    @Override
    public double getWight() {
        return getWeight1();
    }

    @Override
    public int getEatingrank() {
        return -1;
    }

    @Override
    public BufferedImage[] getImages() {
        BufferedImage[] b1 =new BufferedImage[2] ;
        try {
            b1[0]= ImageIO.read(new File(img0));
            b1[1]= ImageIO.read(new File(img1));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  b1;
    }

    @Override
    public ICrosser makeCopy() {
        return null;
    }

    @Override
    public void setLabelToBeShown​(String label) {
        information =label;
    }

    @Override
    public String getLabelToBeShown​() {
        return information;
    }
}
