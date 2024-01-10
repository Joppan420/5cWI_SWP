package at.Musicbox;

import java.util.Scanner;

public class MusicBox {
    private  Magazin magazin;
    private Scanner scanner;

    public MusicBox() {
        this.magazin = new Magazin();
        this.scanner = new Scanner(System.in);
        fillBox();
        run();
    }

    public void fillBox() {
        Record r1 = new Record("Utopia");
        r1.addTitle(new Title("FE!N", 300));
        r1.addTitle(new Title("My Eyes", 200));
        r1.addTitle(new Title("I Know?", 100));
        magazin.addRecord(r1);

        Record r2 = new Record("Astroworld");
        r2.addTitle(new Title("Butterfly Effect", 310));
        r2.addTitle(new Title("Sicko Mode", 210));
        r2.addTitle(new Title("5% TINT", 110));
        magazin.addRecord(r2);
    }

    public void run() {
        while (true) {
            System.out.println("1 Zeige alle Platten");
            System.out.println("2 Waehle Platten");
            System.out.println("3 Play");

            int selection = this.scanner.nextInt();
            switch (selection) {
                case 1:
                    for (Record record : magazin.getRecords()) {
                        System.out.println(record.getName());
                    }
                    break;
                case 2:
                    System.out.println("Enter number of record to load");
                    int numberOffRecord = this.scanner.nextInt();
                    magazin.loadRecord(magazin.getRecords().get(numberOffRecord));

                default:
                    break;
            }
        }
    }
}
