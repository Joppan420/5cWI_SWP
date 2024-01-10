package at.Musicbox;

import java.util.ArrayList;
import java.util.List;

public class Record {
    private List<Title> titles;
    private String name;

    public Record(String name) {
        this.titles = new ArrayList<>();
        this.name = name;
    }

    public void addTitle(Title title) {
        this.titles.add(title);
    }

    public List<Title> getTitles() {
        return titles;
    }

    public String getName() {
        return name;
    }
}
