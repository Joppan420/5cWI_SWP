package WinterGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor implements Actor{
    private double x, y;
    private double speed = 4;

    public CircleActor(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void update(GameContainer gc, int delta) {
        this.x = this.x + (delta/speed);
        if (this.x>800){
            this.x=0;
        }
    }

    public void render(Graphics graphics) {
        graphics.drawOval((float) this.x, (float) this.y, 20, 20);
    }
}
