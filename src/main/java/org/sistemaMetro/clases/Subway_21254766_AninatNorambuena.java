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
    /**
     * Constructor
     *
     * @param id (int) id de la red de metro.
     * @param name (String) Nombre de la red de metro.
     */
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

    // Métodos
    /**
     * subwayAddTrain agrega un tren a la red de metro.
     *
     * @param trainList (list.Train_21254766_AninatNorambuena) trenes a agregar.
     */
    @Override
    public void subwayAddTrain (ArrayList<Train_21254766_AninatNorambuena> trainList){
        trains.addAll(trainList);
    }

    /**
     * subwayAddLine agrega una linea a la red de metro.
     *
     * @param lineList (list.Line_21254766_AninatNorambuena) linea o lineas a agregar.
     */
    @Override
    public void subwayAddLine (ArrayList<Line_21254766_AninatNorambuena> lineList){
        lines.addAll(lineList);
    }

    /**
     * subwayAddDriver agrega un conductor a la red de metro.
     *
     * @param driverList (list.Driver_21254766_AninatNorambuena) conductores a agregar.
     */
    @Override
    public void subwayAddDriver (ArrayList<Driver_21254766_AninatNorambuena> driverList){
        drivers.addAll(driverList);
    }

    /**
     * Describe la red de metro en formato texto
     *
     * @return String con la descripción de la red de metro
     */
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
