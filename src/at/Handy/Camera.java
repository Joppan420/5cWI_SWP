package at.Handy;

public class Camera {
    private int fileNumber = 0;

    public PhoneFile takePicture() {
        PhoneFile file = new PhoneFile("pic" + fileNumber, "jpg", 1000);
        fileNumber++;
        return file;
    }
}
