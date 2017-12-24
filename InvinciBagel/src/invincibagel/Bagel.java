package invincibagel;

import static invincibagel.InvinciBagel.down;
import static invincibagel.InvinciBagel.left;
import static invincibagel.InvinciBagel.right;
import static invincibagel.InvinciBagel.up;
import javafx.scene.image.Image;


public class Bagel extends Hero{

    public Bagel(String SVGdata, double xLocation, double yLocation, Image... spriteCels){
        super(SVGdata,xLocation,yLocation,spriteCels);
    }
    public void update(){

        if(right) {iX += vX;}
        if(left) {iX -= vX;}
        if(down) {iY +=vY;}
        if(up) {iY -= vY;}
        spriteFrame.setTranslateX(iX);
        spriteFrame.setTranslateY(iY);

    }
    public boolean collide (Actor object){return false;}
}