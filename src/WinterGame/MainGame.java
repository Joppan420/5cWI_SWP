package WinterGame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class MainGame extends BasicGame {
    private CircleActor ca1, ca2;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        // 1 mal aufgerufen
        this.ca1 = new CircleActor(100, 100);
        this.ca2 = new CircleActor(100,200);
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {
        // delta = zeit seit dem letzten aufruf
        this.ca1.update(gc,i);
        this.ca2.update(gc,i);
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        // gezeichnet
        this.ca1.render(graphics);
        this.ca2.render(graphics);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Wintergame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
