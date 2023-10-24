package WinterGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectActor implements Actor {
    private double x, y;
    private double speed = 5;

    public RectActor(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        this.x = this.x + (delta/speed);
        if (this.x>800){
            this.x=0;
        }
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawRect((float) this.x, (float) this.y, 50,50);
    }
}
