package org.sistemaMetro.clases;

import org.sistemaMetro.Interfaces.IDriver_21254766_AninatNorambuena;

public class Driver_21254766_AninatNorambuena implements IDriver_21254766_AninatNorambuena {
    private final int id;
    private final String name;
    private final String trainMaker;

    /**
     * Constructor
     *
     * @param id (int) id unico del conductor.
     * @param name (String) Nombre del conductor.
     * @param trainMaker (String) Tipo de trenes que puede conducir el conductor.
     */
    public Driver_21254766_AninatNorambuena(int id, String name, String trainMaker){
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
    /**
     * Describe al conductor en formato texto
     *
     * @return String con la descripción del conductor
     */
    @Override
    public String toString(){
        return "id:" + id + "\n" +
                "Conductor: " + name + "\n" +
                "Train Maker: " + trainMaker + "\n";
    }
}
