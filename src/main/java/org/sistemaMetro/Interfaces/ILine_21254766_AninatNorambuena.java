package org.sistemaMetro.Interfaces;
import org.sistemaMetro.clases.Line_21254766_AninatNorambuena;
import org.sistemaMetro.clases.Section_21254766_AninatNorambuena;

import java.util.ArrayList;

public interface ILine_21254766_AninatNorambuena {
    /**
     * Obtiene el id de la línea
     *
     * @return (int)
     */
    int getId();

    /**
     * Obtiene el nombre de la línea
     *
     * @return (String)
     */
    String getName();

    /**
     * Obtiene el tipo de riel de la línea
     *
     * @return (String)
     */
    String getRailType();

    /**
     * Obtiene las secciones de una línea
     *
     * @return (list.Section_21254766_AninatNorambuena)
     */
    ArrayList<Section_21254766_AninatNorambuena> getSections();

    /**
    * Obtiene el largo de una línea
    *
    * @return (int)
     */
    int lineLength();

    /**
    * Obtiene el largo de una sección de una línea
    *
    * @param station1Name (String) nombre de la estación 1
    * @param station2Name (String) nombre de la estación 2
    * @return (int)
     */
    int lineSectionLength(String station1Name, String station2Name);

    /**
    * Obtiene el costo de una línea
    *
    * @return (int)
     */
    int lineCost();

    /**
    * Obtiene el costo de una sección de una línea
    *
    * @param station1Name (String) nombre de la estación 1
    * @param station2Name (String) nombre de la estación 2
    * @return (int)
     */
    int lineSectionCost(String station1Name, String station2Name);

    /**
    * Agrega una sección a una línea
    *
    * @param section (Section_21254766_AninatNorambuena) sección que se quiere agregar
     */
    void lineAddSection(Section_21254766_AninatNorambuena section);

    /**
     * Verifica si una línea es regular,
     * siendo regular que su primera y su ultima estación sean terminales,
     * combinacion, o una combinacion de ambas
     *
     * @param line (Line_21254766_AninatNorambuena) linea que se quiere verificar
     * @return (boolean)
     */
    boolean comprobarLineaRegular(Line_21254766_AninatNorambuena line);

    /**
     * Verifica si una línea es circular,
     * siendo circular que su primera y su ultima estación sean la misma
     *
     * @param line (Line_21254766_AninatNorambuena) linea que se quiere verificar
     * @return (boolean)
     */
    boolean comprobarLineaCircular(Line_21254766_AninatNorambuena line);

    /**
     * Verifica si de una estacion se puede llegar a todas las demas estaciones
     * en una linea regular
     *
     * @param line (Line_21254766_AninatNorambuena) linea que se quiere verificar
     * @return (boolean)
     */
    boolean verificarLlegadaRegular(Line_21254766_AninatNorambuena line);

    /**
     * Verifica si de una estacion se puede llegar a todas las demas estaciones
     * en una linea circular
     *
     * @param line (Line_21254766_AninatNorambuena) linea que se quiere verificar
     * @return (boolean)
     */
    boolean verificarLlegadaCircular(Line_21254766_AninatNorambuena line);

    /**
    * Verifica si una linea es valida
    *
    * @param line (Line_21254766_AninatNorambuena) linea que se quiere verificar
    * @return (boolean)
     */
    boolean isLine(Line_21254766_AninatNorambuena line);
}
