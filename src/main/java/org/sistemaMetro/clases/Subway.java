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

    @Override
    public String toString(){
        return "Datos de la red de metro\n" +
                "id = " + id + "\n" +
                "nombre = " + name + "\n" +
                "trenes = " + trains + "\n" +
                "lineas = " + lines + "\n" +
                "conductores = " + drivers + "\n";
    }
}
