package at.jov;

import org.newdawn.slick.GameContainer;


public abstract class AbstractActor implements Actor {
    protected MoveStrategy moveStrategy;


    public AbstractActor(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        moveStrategy.update(gc, delta);
    }
}
