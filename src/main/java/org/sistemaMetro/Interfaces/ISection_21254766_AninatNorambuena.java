package org.sistemaMetro.Interfaces;
import org.sistemaMetro.clases.Station_21254766_AninatNorambuena;

public interface ISection_21254766_AninatNorambuena {
    /**
     * Obtiene la primera estación de la sección
     *
     * @return (Station_21254766_AninatNorambuena)
     */
    Station_21254766_AninatNorambuena getPoint1();

    /**
     * Obtiene la segunda estación de la sección
     *
     * @return (Station_21254766_AninatNorambuena)
     */
    Station_21254766_AninatNorambuena getPoint2();

    /**
     * Obtiene la distancia entre las dos estaciones
     *
     * @return (int)
     */
    int getDistance();

    /**
     * Obtiene el costo de la sección
     *
     * @return (int)
     */
    int getCost();
}
