package org.sistemaMetro.Interfaces;

public interface IStation {
    /**
     * Obtiene el id de la estación
     *
     * @return id de la estación
     */
    int getId();

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
    String getType();

    /**
     * Obtiene el tiempo de detención de la estación
     *
     * @return tiempo de detención de la estación
     */
    int getStopTime();

    /**
     * Valida el tipo de estación
     *
     * @param stationType tipo de estación
     * @return true si el tipo de estación es válido, false en caso contrario
     */
    boolean validSType(String stationType);
}
