package at.jov;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {
    private CircleActor ca1, ca2;
    private RectActor ra1;


    private List<Actor> actors = new ArrayList<>();
    private List<MoveStrategy> moveStrategy = new ArrayList<>();

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        MoveStrategy mr1 = new MoveRight(0, 0, 0.3f);
        MoveStrategy mr2 = new MoveLeft(500, 100, 0.1f);
        MoveStrategy mr3 = new MoveLeft(540, 200, 0.2f);

        this.ca1 = new CircleActor(mr1);
        this.ca2 = new CircleActor(mr2);
        this.ra1 = new RectActor(mr3);


        this.actors.add(ca1);
        this.actors.add(ca2);
        this.actors.add(ra1);
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(gc, delta);
        }
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        // gezeichnet
        for (Actor actor : this.actors) {
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Winter game"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
