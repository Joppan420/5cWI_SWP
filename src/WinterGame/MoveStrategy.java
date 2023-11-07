package WinterGame;

public interface MoveStrategy {
    public float getX();
    public float getY();
    public void update(int delta);
}
