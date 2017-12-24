package invincibagel;

import javafx.animation.AnimationTimer;
import static invincibagel.InvinciBagel.iBagel;

public class GamePlayLoop extends AnimationTimer {

    public void handle(long now){
        iBagel.update();

    }
    public void start(){
        super.start();
    }
    public void stop(){
        super.stop();
    }
}
