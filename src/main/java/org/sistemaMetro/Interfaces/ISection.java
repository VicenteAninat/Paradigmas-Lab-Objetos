package org.sistemaMetro.Interfaces;
import org.sistemaMetro.clases.Station;

public interface ISection {
    /**
     * Obtiene la primera estación de la sección
     *
     * @return Station de la primera estación
     */
    Station getPoint1();

    /**
     * Obtiene la segunda estación de la sección
     *
     * @return Station de la segunda estación
     */
    Station getPoint2();

    /**
     * Obtiene la distancia entre las dos estaciones
     *
     * @return int de la distancia
     */
    int getDistance();

    /**
     * Obtiene el costo de la sección
     *
     * @return int del costo
     */
    int getCost();
}
