import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Mansoob-e-Zahra CIS 23-27
 */
public class FreezePeashooter extends Plant {

    private Timer shootTimer;


    public FreezePeashooter(GamePanel parent, int x, int y) {
        super(parent, x, y);
        shootTimer = new Timer(2000, (ActionEvent e) -> {
            //System.out.println("SHOOT");
            if (getGp().getLaneZombies().get(y).size() > 0) {
                getGp().getLanePeas().get(y).add(new FreezePea(getGp(), y, 103 + this.getX() * 100));
            }
        });
        shootTimer.start();
    }

    @Override
    public void stop() {
        shootTimer.stop();
    }

}