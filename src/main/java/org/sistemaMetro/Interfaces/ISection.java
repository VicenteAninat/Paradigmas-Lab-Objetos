package org.sistemaMetro.Interfaces;
import org.sistemaMetro.clases.Station;

public interface ISection {
    /**
     * Obtiene la primera estación de la sección
     *
     * @return point1
     */
    Station getPoint1();

    /**
     * Obtiene la segunda estación de la sección
     *
     * @return point2
     */
    Station getPoint2();

    /**
     * Obtiene la distancia entre las dos estaciones
     *
     * @return distance
     */
    int getDistance();

    /**
     * Obtiene el costo de la sección
     *
     * @return cost
     */
    int getCost();
}
