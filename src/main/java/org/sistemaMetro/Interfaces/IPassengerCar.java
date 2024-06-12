package org.sistemaMetro.Interfaces;

import java.util.ArrayList;
import org.sistemaMetro.clases.PassengerCar;

public interface IPassengerCar {
    /**
     * Obtiene el id del carro
     *
     * @return int del id del carro
     */
    int getId();

    /**
     * Obtiene la capacidad de pasajeros del carro
     *
     * @return int de la capacidad de pasajeros del carro
     */
    int getPassengerCapacity();
}
