package WinterGame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {
    private CircleActor ca1, ca2;
    private RectActor ra1;


    private List<Actor> actors = new ArrayList<>();

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        // 1 mal aufgerufen
        this.ca1 = new CircleActor(100, 100);
        this.ca2 = new CircleActor(100,200);
        this.ra1 = new RectActor(60,500);


        this.actors.add(ca1);
        this.actors.add(ca2);
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        // delta = zeit seit dem letzten aufruf
        this.ra1.update(gc, delta);
        for (Actor actor : this.actors) {
            actor.update(gc, delta);
        }
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        // gezeichnet
        this.ra1.render(graphics);
        for (Actor actor : this.actors) {
            actor.render(graphics);
        }
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
