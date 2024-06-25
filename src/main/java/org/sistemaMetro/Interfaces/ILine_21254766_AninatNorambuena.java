package org.sistemaMetro.Interfaces;
import org.sistemaMetro.clases.Line_21254766_AninatNorambuena;
import org.sistemaMetro.clases.Section_21254766_AninatNorambuena;

import java.util.ArrayList;

public interface ILine_21254766_AninatNorambuena {
    /**
     * Obtiene el id de la línea
     *
     * @return int del id de la línea
     */
    int getId();

    /**
     * Obtiene el nombre de la línea
     *
     * @return String del nombre de la línea
     */
    String getName();

    /**
     * Obtiene el tipo de riel de la línea
     *
     * @return String del tipo de riel de la línea
     */
    String getRailType();

    /**
     * Obtiene las secciones de una línea
     *
     * @return Lista de secciones
     */
    ArrayList<Section_21254766_AninatNorambuena> getSections();

    /**
    * Obtiene el largo de una línea
    *
    * @return int del largo
     */
    int lineLength();

    /**
    * Obtiene el largo de una sección de una línea
    *
    * @param station1Name nombre de la estación 1
    * @param station2Name nombre de la estación 2
    * @return int del largo de la sección
     */
    int lineSectionLength(String station1Name, String station2Name);

    /**
    * Obtiene el costo de una línea
    *
    * @return int del costo
     */
    int lineCost();

    /**
    * Obtiene el costo de una sección de una línea
    *
    * @param station1Name nombre de la estación 1
    * @param station2Name nombre de la estación 2
    * @return int del costo de la sección
     */
    int lineSectionCost(String station1Name, String station2Name);

    /**
    * Agrega una sección a una línea
    *
    * @param section seccion que se quiere agregar
     */
    void lineAddSection(Section_21254766_AninatNorambuena section);

    /**
     * Verifica si una línea es regular,
     * siendo regular que su primera y su ultima estación sean terminales,
     * combinacion, o una combinacion de ambas
     *
     * @param line linea que se quiere verificar
     * @return boolean si es regular o no
     */
    boolean comprobarLineaRegular(Line_21254766_AninatNorambuena line);

    /**
     * Verifica si una línea es circular,
     * siendo circular que su primera y su ultima estación sean la misma
     *
     * @param line linea que se quiere verificar
     * @return boolean si es circular o no
     */
    boolean comprobarLineaCircular(Line_21254766_AninatNorambuena line);

    /**
     * Verifica si de una estacion se puede llegar a todas las demas estaciones
     * en una linea regular
     *
     * @param line linea que se quiere verificar
     * @return boolean si se puede llegar a todas las estaciones o no
     */
    boolean verificarLlegadaRegular(Line_21254766_AninatNorambuena line);

    /**
     * Verifica si de una estacion se puede llegar a todas las demas estaciones
     * en una linea circular
     *
     * @param line linea que se quiere verificar
     * @return boolean si se puede llegar a todas las estaciones o no
     */
    boolean verificarLlegadaCircular(Line_21254766_AninatNorambuena line);

    /**
    * Verifica si una linea es valida
    *
    * @param line linea que se quiere verificar
    * @return boolean si es válida o no
     */
    boolean isLine(Line_21254766_AninatNorambuena line);
}
