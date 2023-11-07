package WinterGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectActor extends AbstractActor {
    private MoveStrategy moveStrategy;


    public RectActor(MoveStrategy mr) {
        super(mr);

    }

    @Override
    public void update(GameContainer gc, int delta) {
        moveStrategy.update(delta);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawRect(this.moveStrategy.getX(), this.moveStrategy.getY(), 20, 20);
    }
}
