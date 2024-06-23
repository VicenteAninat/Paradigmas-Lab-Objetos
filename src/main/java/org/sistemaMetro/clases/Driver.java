package org.sistemaMetro.clases;

import org.sistemaMetro.Interfaces.IDriver;

public class Driver implements IDriver{
    private int id;
    private String name;
    private String trainMaker;

    // Constructor
    public Driver(int id, String name, String trainMaker){
        this.id = id;
        this.name = name;
        this.trainMaker = trainMaker;
    }

    // Selectores
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTrainMaker() {
        return trainMaker;
    }

    // Métodos
    @Override
    public String toString(){
        return "id:" + id + "\n" +
                "Conductor: " + name + "\n" +
                "Train Maker: " + trainMaker + "\n";
    }
}
