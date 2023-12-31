package at.jov;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor implements Actor{
    private MoveStrategy moveStrategy;

    public CircleActor(MoveStrategy mr) {
        this.moveStrategy = mr;
    }

    public void update(GameContainer gc, int delta) {
        moveStrategy.update(gc,delta);
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.moveStrategy.getX(), this.moveStrategy.getY(), 20, 20);
    }
}
