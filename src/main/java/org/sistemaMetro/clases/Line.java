package org.sistemaMetro.clases;

import java.util.ArrayList;

public class Line {
    public int id;
    public String name;
    public String railType;
    public ArrayList<Section> sections;

    // Constructor
    public Line(int id, String name, String railType) {
        this.id = id;
        this.name = name;
        this.railType = railType;
        this.sections = new ArrayList<Section>();
    }

    public int lineLength(Line line) {
        int length = 0;
        for (Section section : line.sections) {
            length += section.getDistance();
        }
        return length;
    }


}
