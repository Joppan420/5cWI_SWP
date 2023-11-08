package at.jov;

import org.newdawn.slick.GameContainer;

public class MoveLeft implements MoveStrategy {
    private float x, y, speed;

    public MoveLeft(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        this.x -= delta * speed;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
        return y;
    }
}
