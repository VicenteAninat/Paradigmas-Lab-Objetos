package org.sistemaMetro.clases;

import org.sistemaMetro.Interfaces.ISubway_21254766_AninatNorambuena;

import java.util.ArrayList;
import java.util.stream.Collectors;


public class Subway_21254766_AninatNorambuena implements ISubway_21254766_AninatNorambuena {
    private int id;
    private String name;
    private ArrayList<Train_21254766_AninatNorambuena> trains;
    private ArrayList<Line_21254766_AninatNorambuena> lines;
    private ArrayList<Driver_21254766_AninatNorambuena> drivers;

    // Constructor
    public Subway_21254766_AninatNorambuena(int id, String name){
        this.id = id;
        this.name = name;
        this.trains = new ArrayList<Train_21254766_AninatNorambuena>();
        this.lines = new ArrayList<Line_21254766_AninatNorambuena>();
        this.drivers = new ArrayList<Driver_21254766_AninatNorambuena>();
    }

    // Selectores
    public ArrayList<Train_21254766_AninatNorambuena> getTrains() {
        return trains;
    }

    public ArrayList<Line_21254766_AninatNorambuena> getLines() {
        return lines;
    }

    public ArrayList<Driver_21254766_AninatNorambuena> getDrivers() {
        return drivers;
    }

    @Override
    public void subwayAddTrain (ArrayList<Train_21254766_AninatNorambuena> trainList){
        trains.addAll(trainList);
    }

    @Override
    public void subwayAddLine (ArrayList<Line_21254766_AninatNorambuena> lineList){
        lines.addAll(lineList);
    }

    @Override
    public void subwayAddDriver (ArrayList<Driver_21254766_AninatNorambuena> driverList){
        drivers.addAll(driverList);
    }

    @Override
    public String toString(){
        String trainDetails = trains.stream().map(Train_21254766_AninatNorambuena::toString).collect(Collectors.joining(", "));
        String lineDetails = lines.stream().map(Line_21254766_AninatNorambuena::toString).collect(Collectors.joining(", "));
        String driverDetails = drivers.stream().map(Driver_21254766_AninatNorambuena::toString).collect(Collectors.joining(", "));

        return "Datos de la red de metro\n" +
                "id = " + id + "\n" +
                "nombre = " + name + "\n" +
                "Trenes\n" +
                trainDetails + "\n" +
                "lineas\n" +
                lineDetails + "\n" +
                "conductores\n" +
                driverDetails + "\n";
    }
}
