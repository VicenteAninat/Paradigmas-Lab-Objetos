package org.sistemaMetro.clases;
import org.sistemaMetro.Interfaces.IStation_21254766_AninatNorambuena;

public class Station_21254766_AninatNorambuena implements IStation_21254766_AninatNorambuena {
    private final int id;
    private final String name;
    private final String type;
    private final int stopTime;

    // Constructor
    /**
     * Constructor
     *
     * @param id (int) id unico de la estación.
     * @param name (String) Nombre de la estación.
     * @param type (String) Tipo de la estación.
     * @param stopTime (int) Tiempo de detención en la estación.
     */
    public Station_21254766_AninatNorambuena(int id, String name, String type, int stopTime) {
        if (stopTime <= 0) {
            throw new IllegalArgumentException
                    ("El tiempo de detención debe ser un número positivo");
        } else if (!validSType(type)) {
            throw new IllegalArgumentException
                    ("El tipo de estación no es válido");
        } else {
            this.id = id;
            this.name = name;
            this.type = type;
            this.stopTime = stopTime;
        }
    }

    // Selectores
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getStopTime() {
        return stopTime;
    }

    // Modificadores (ninguno)

    // Métodos
    /**
     * Determina si el tipo de estación es válido
     *
     * @param stationType (String) tipo de estación
     * @return (boolean)
     */
    @Override
    public boolean validSType(String stationType){
        return stationType.equals("c") ||
                stationType.equals("t") ||
                stationType.equals("m") ||
                stationType.equals("r");
    }
}
