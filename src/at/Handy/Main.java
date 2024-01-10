package at.Handy;

public class Main {
    public static void main(String[] args) {
        Camera c = new Camera();
        Sim sim = new Sim(123,"0650");
        SDCard card = new SDCard(14000);

        Phone phone = new Phone(card, sim, c);
        phone.doCall("1231231");

        phone.takePicture();
        phone.takePicture();

        phone.printAllFiles();

        System.out.println(phone.getFreeSpace());
        phone.takePicture();
        System.out.println(phone.getFreeSpace());

    }
}
