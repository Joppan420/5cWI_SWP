package at.Handy;

import java.util.List;

public class Phone {
    private SDCard card;
    private Sim sim;
    private Camera camera;

    public Phone(SDCard card, Sim sim, Camera camera) {
        this.card = card;
        this.sim = sim;
        this.camera = camera;
    }

    public void takePicture(){
        PhoneFile file = this.camera.takePicture();
        this.card.saveFile(file);
    }

    public void doCall(String number) {
        this.sim.doCall(number);
    }

    public int getFreeSpace(){
        return this.card.getFreeSpace();
    }

    public void printAllFiles(){
        List<PhoneFile> files = this.card.getFiles();
        for (PhoneFile file : files){
            System.out.println(file.getInfo());
        }
    }

}
