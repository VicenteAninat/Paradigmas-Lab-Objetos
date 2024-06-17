package org.sistemaMetro.clases;

import org.sistemaMetro.Interfaces.ISubway;

import java.util.ArrayList;

public class Subway implements ISubway{
    private int id;
    private String name;
    private ArrayList<Train> trains;
    private ArrayList<Line> lines;
    private ArrayList<Driver> drivers;

    // Constructor
    public Subway(int id, String name){
        this.id = id;
        this.name = name;
        this.trains = new ArrayList<Train>();
        this.lines = new ArrayList<Line>();
        this.drivers = new ArrayList<Driver>();
    }

    // Selectores
    public ArrayList<Train> getTrains() {
        return trains;
    }

    public ArrayList<Line> getLines() {
        return lines;
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    @Override
    public void subwayAddTrain (ArrayList<Train> trainList){
        trains.addAll(trainList);
    }

    @Override
    public void subwayAddLine (ArrayList<Line> lineList){
        lines.addAll(lineList);
    }

    @Override
    public void subwayAddDriver (ArrayList<Driver> driverList){
        drivers.addAll(driverList);
    }

    public String toString(Subway subway){
        return "Subway{" +
                "id=" + subway.id +
                ", name='" + subway.name + '\'' +
                ", trains=" + subway.trains +
                ", lines=" + subway.lines +
                ", drivers=" + subway.drivers +
                '}';
    }
}
