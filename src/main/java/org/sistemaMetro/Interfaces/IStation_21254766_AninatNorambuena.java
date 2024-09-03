package org.sistemaMetro.Interfaces;

public interface IStation_21254766_AninatNorambuena {
    /**
     * Obtiene el id de la estación
     *
     * @return (int)
     */
    int getId();

    /**
     * Obtiene el nombre de la estación
     *
     * @return (string)
     */
    String getName();

    /**
     * Obtiene el tipo de la estación
     *
     * @return (string)
     */
    String getType();

    /**
     * Obtiene el tiempo de detención de la estación
     *
     * @return (int)
     */
    int getStopTime();

    /**
     * Determina si el tipo de estación es valido
     *
     * @param stationType (String) tipo de estación
     * @return (boolean)
     */
    boolean validSType(String stationType);
}
