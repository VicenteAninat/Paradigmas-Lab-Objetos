package org.sistemaMetro.Interfaces;

import org.sistemaMetro.clases.StationType;

public interface IStation {
    /**
     * Obtiene el nombre de la estación
     *
     * @return nombre de la estación
     */
    String getName();

    /**
     * Obtiene el tipo de la estación
     *
     * @return tipo de la estación
     */
    StationType getType();
}
