package at.jov;

import org.newdawn.slick.GameContainer;

public class MoveRight implements MoveStrategy {
    private float x, y, speed;

    public MoveRight(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void update(GameContainer gc, int delta) {
        this.x += delta * speed;
    }

    public float getSpeed() {
        return this.speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
