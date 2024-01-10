package at.Handy;

public class Sim {
    private int id;
    private String number;

    public Sim(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public void doCall(String number){
        System.out.println("Rufe Nummer " + number + " an");
    }

    public String getNumber(){
        return number;
    }
}
