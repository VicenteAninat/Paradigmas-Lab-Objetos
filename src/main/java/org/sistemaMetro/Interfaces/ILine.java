package org.sistemaMetro.Interfaces;
import org.sistemaMetro.clases.Line;
import org.sistemaMetro.clases.Section;

public interface ILine {
    /*
    * Obtiene el largo de una línea
    *
    * @param linea a la que se le quiere obtener el largo
    * @return int del largo
     */
    int lineLength(Line line);

    /*
    * Obtiene el largo de una sección de una línea
    *
    * @param linea a la que se le quiere obtener el largo de la sección
    * @param nombre de la estación 1
    * @param nombre de la estación 2
    * @return int del largo de la sección
     */
    int lineSectionLength(Line line, String station1Name, String station2Name);

    /*
    * Obtiene el costo de una línea
    *
    * @param linea a la que se le quiere obtener el costo
    * @return int del costo
     */
    int lineCost(Line line);

    /*
    * Obtiene el costo de una sección de una línea
    *
    * @param linea a la que se le quiere obtener el costo de la sección
    * @param nombre de la estación 1
    * @param nombre de la estación 2
    * @return int del costo de la sección
     */
    int lineSectionCost(Line line, String station1Name, String station2Name);

    /*
    * Agrega una sección a una línea
    *
    * @param línea a la que se le quiere agregar una sección
    * @param sección que se quiere agregar
    * @return void
     */
    void lineAddSection(Line line, Section section);

    /*
    * Verifica si una linea es valida
    *
    * @param línea que se quiere verificar
    * @return boolean si es válida o no
     */
    boolean isLine(Line line);
}
