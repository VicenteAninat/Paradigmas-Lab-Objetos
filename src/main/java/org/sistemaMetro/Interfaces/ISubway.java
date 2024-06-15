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
     * @param subway    red de metro a la que se agregarán los trenes
     * @param trainList lista de trenes que se agregarán al metro
     */
    void subwayAddTrain (Subway subway, ArrayList<Train> trainList);

    /**
     * Agrega varias líneas a la red de metro
     *
     * @param subway    red de metro a la que se agregarán las líneas
     * @param lineList lista de líneas que se agregarán al metro
     */
    void subwayAddLine (Subway subway, ArrayList<Line> lineList);

    /**
     * Agrega varios conductores a la red de metro
     *
     * @param subway    red de metro a la que se agregarán los conductores
     * @param driverList lista de conductores que se agregarán al metro
     */
    void subwayAddDriver (Subway subway, ArrayList<Driver> driverList);
}
