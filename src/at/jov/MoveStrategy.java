package at.jov;

import org.newdawn.slick.GameContainer;

public interface MoveStrategy {
    public float getX();
    public float getY();
    public void update(GameContainer gc, int delta);
}
