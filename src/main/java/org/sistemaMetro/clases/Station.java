package org.sistemaMetro.clases;
import org.sistemaMetro.Interfaces.IStation;

public class Station implements IStation{
    private int id;
    private String name;
    private StationType type;
    private int stopTime;

    // Constructor
    public Station(int id, String name, StationType type, int stopTime) {
        if (stopTime <= 0) {
            throw new IllegalArgumentException
                    ("El tiempo de detención debe ser un número positivo");
        } else if (!type.validSType(type)) {
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
    public String getName() {
        return name;
    }

    @Override
    public StationType getType() {
        return type;
    }

    // Modificadores
}
