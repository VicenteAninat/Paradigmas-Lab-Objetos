package org.sistemaMetro.Interfaces;

import org.sistemaMetro.clases.Subway;
import org.sistemaMetro.clases.Train;
import org.sistemaMetro.clases.Line;
import org.sistemaMetro.clases.Driver;

import java.util.ArrayList;

public interface ISubway {
    /**
     * Agrega varios trenes a la red de metro
     *
     * @param trainList lista de trenes que se agregarán al metro
     */
    void subwayAddTrain (ArrayList<Train> trainList);

    /**
     * Agrega varias líneas a la red de metro
     *
     * @param lineList lista de líneas que se agregarán al metro
     */
    void subwayAddLine (ArrayList<Line> lineList);

    /**
     * Agrega varios conductores a la red de metro
     *
     * @param driverList lista de conductores que se agregarán al metro
     */
    void subwayAddDriver (ArrayList<Driver> driverList);

    /**
     * Convierte a String una red de metro
     *
     * @return String con la información de la red de metro
     */
    String toString();
}
