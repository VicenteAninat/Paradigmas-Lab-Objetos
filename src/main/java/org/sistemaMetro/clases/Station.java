package org.sistemaMetro.clases;

public class Station {
    public int id;
    public String name;
    public StationType type;
    public int stopTime;

    // Constructor
    public Station(int id, String name, StationType type, int stopTime) {
        if (stopTime < 0) {
            throw new IllegalArgumentException
                    ("El tiempo de detención debe ser un número positivo");
        } else if (!type.validType(type)) {
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


    // Modificadores
}
