package org.sistemaMetro.Interfaces;
import org.sistemaMetro.clases.Line;
import org.sistemaMetro.clases.Section;

import java.util.ArrayList;

public interface ILine {
    /**
     * Obtiene las secciones de una línea
     *
     * @return Lista de secciones
     */
    ArrayList<Section> getSections();

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
    void lineAddSection(Section section);

    /**
     * Verifica si una línea es regular,
     * siendo regular que su primera y su ultima estación sean terminales,
     * combinacion, o una combinacion de ambas
     *
     * @param line linea que se quiere verificar
     * @return boolean si es regular o no
     */
    boolean comprobarLineaRegular(Line line);

    /**
     * Verifica si una línea es circular,
     * siendo circular que su primera y su ultima estación sean la misma
     *
     * @param line linea que se quiere verificar
     * @return boolean si es circular o no
     */
    boolean comprobarLineaCircular(Line line);

    /**
     * Verifica si de una estacion se puede llegar a todas las demas estaciones
     * en una linea regular
     *
     * @param line linea que se quiere verificar
     * @return boolean si se puede llegar a todas las estaciones o no
     */
    boolean verificarLlegadaRegular(Line line);

    /**
     * Verifica si de una estacion se puede llegar a todas las demas estaciones
     * en una linea circular
     *
     * @param line linea que se quiere verificar
     * @return boolean si se puede llegar a todas las estaciones o no
     */
    boolean verificarLlegadaCircular(Line line);

    /**
    * Verifica si una linea es valida
    *
    * @param line linea que se quiere verificar
    * @return boolean si es válida o no
     */
    boolean isLine(Line line);
}
