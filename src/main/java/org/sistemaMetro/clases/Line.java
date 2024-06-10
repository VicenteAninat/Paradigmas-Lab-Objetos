package org.sistemaMetro.clases;

import java.util.ArrayList;
import java.util.List;
import org.sistemaMetro.Interfaces.ILine;

public class Line implements ILine{
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

    // Métodos
    @Override
    public int lineLength(Line line) {
        int length = 0;
        for (Section section : line.sections) {
            length += section.getDistance();
        }
        return length;
    }

    @Override
    public int lineSectionLength(Line line, String station1Name, String station2Name) {
        int length = 0;
        int index1 = 0;
        int index2 = 0;
        for (Section section : line.sections) {
            if (section.getPoint1().getName().equals(station1Name)) {
                index1 = line.sections.indexOf(section);
                break;
            }
        }
        for (Section section : line.sections) {
            if (section.getPoint2().getName().equals(station2Name)){
                index2 = line.sections.indexOf(section);
                break;
            }
        }
        List<Section> listaCortada = (this.sections.subList(index1, index2));
        for (Section section : listaCortada) {
            length += section.getDistance();
        }
        return length;
    }

    @Override
    public int lineCost(Line line) {
        int cost = 0;
        for (Section section : line.sections) {
            cost += section.getCost();
        }
        return cost;
    }

    @Override
    public int lineSectionCost(Line line, String station1Name, String station2Name) {
        int cost = 0;
        int index1 = 0;
        int index2 = 0;
        for (Section section : line.sections) {
            if (section.getPoint1().getName().equals(station1Name)) {
                index1 = line.sections.indexOf(section);
                break;
            }
        }
        for (Section section : line.sections) {
            if (section.getPoint2().getName().equals(station2Name)){
                index2 = line.sections.indexOf(section);
                break;
            }
        }
        List<Section> listaCortada = (this.sections.subList(index1, index2));
        for (Section section : listaCortada) {
            cost += section.getCost();
        }
        return cost;
    }

    @Override
    public void lineAddSection(Line line, Section section) {
        line.sections.add(section);
    }

    @Override
    public boolean isLine (Line line) {
        // some code
        return false; // Placeholder
    }
}
