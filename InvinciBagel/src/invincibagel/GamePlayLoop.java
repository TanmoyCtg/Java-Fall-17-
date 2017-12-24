package invincibagel;

import javafx.animation.AnimationTimer;
import javafx.geometry.Pos;

public class GamePlayLoop extends AnimationTimer {
    Pos location;
    public void handle(long now){
        location = InvinciBagel.buttonContainer.getAlignment();
        if(location == Pos.BOTTOM_LEFT){
            InvinciBagel.buttonContainer.setAlignment(Pos.BOTTOM_RIGHT);
        } else if (location == Pos.BOTTOM_RIGHT){
            InvinciBagel.buttonContainer.setAlignment(Pos.TOP_RIGHT);
        } else if (location == Pos.TOP_RIGHT){
            InvinciBagel.buttonContainer.setAlignment(Pos.TOP_LEFT);
        } else if(location == Pos.TOP_LEFT){
            InvinciBagel.buttonContainer.setAlignment(Pos.BOTTOM_LEFT);
        }
    }
    public void start(){
        super.start();
    }
    public void stop(){
        super.stop();
    }
}
