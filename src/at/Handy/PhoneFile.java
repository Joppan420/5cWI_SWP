package at.Handy;

public class PhoneFile {
    private String name;
    private String extension;
    private int size;

    public PhoneFile(String name, String extension, int size) {
        this.name = name;
        this.extension = extension;
        this.size = size;
    }


    public String getInfo(){
        return this.name + " : " + this.extension + " : " + this.size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
