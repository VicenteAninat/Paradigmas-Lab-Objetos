package org.sistemaMetro.clases;

import org.sistemaMetro.Interfaces.ISubway;

import java.util.ArrayList;

public class Subway implements ISubway{
    private int id;
    private String name;
    private ArrayList<Train> trains;
    private ArrayList<Line> lines;
    private ArrayList<Driver> drivers;

    public Subway(int id, String name){
        this.id = id;
        this.name = name;
        this.trains = new ArrayList<Train>();
        this.lines = new ArrayList<Line>();
        this.drivers = new ArrayList<Driver>();
    }

    public void subwayAddTrain (Subway subway, Train train){
        // some code
    }
}
