package org.sistemaMetro.Interfaces;

import org.sistemaMetro.clases.Train_21254766_AninatNorambuena;
import org.sistemaMetro.clases.Line_21254766_AninatNorambuena;
import org.sistemaMetro.clases.Driver_21254766_AninatNorambuena;

import java.util.ArrayList;

public interface ISubway_21254766_AninatNorambuena {
    /**
     * Agrega varios trenes a la red de metro
     *
     * @param trainList lista de trenes que se agregarán al metro
     */
    void subwayAddTrain (ArrayList<Train_21254766_AninatNorambuena> trainList);

    /**
     * Agrega varias líneas a la red de metro
     *
     * @param lineList lista de líneas que se agregarán al metro
     */
    void subwayAddLine (ArrayList<Line_21254766_AninatNorambuena> lineList);

    /**
     * Agrega varios conductores a la red de metro
     *
     * @param driverList lista de conductores que se agregarán al metro
     */
    void subwayAddDriver (ArrayList<Driver_21254766_AninatNorambuena> driverList);

    /**
     * Convierte a String una red de metro
     *
     * @return String con la información de la red de metro
     */
    String toString();
}
