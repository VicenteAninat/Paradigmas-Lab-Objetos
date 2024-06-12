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
}
