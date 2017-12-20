import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SpriteSheetLoader {
    BufferedImage spriteSheet = ImageIO.read(new File("src/res/mario.png"));
    int width,height,rows,columns;
    BufferedImage[] sprites ;

    public SpriteSheetLoader(int width,int height,int rows,int columns)throws Exception{
        this.width = width;
        this.height = height;
        this.rows = rows;
        this.columns = columns;
        sprites = new BufferedImage[rows * columns];
        for(int i=0; i<rows;i++){
            for (int j=0;j<columns;j++){
                sprites[(i*columns)+j] = spriteSheet.getSubimage(i*width,j*height,width,height);
            }
        }

    }
    public void Paint(Graphics g){

    }

    public static void main(String[] args) throws Exception {
        SpriteSheetLoader sh = new SpriteSheetLoader(55,50,10,10);
    }

}
