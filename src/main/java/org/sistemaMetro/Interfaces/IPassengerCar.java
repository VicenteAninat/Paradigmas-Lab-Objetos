package org.sistemaMetro.Interfaces;

import org.sistemaMetro.clases.CarType;

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

    /**
     * Obtiene el modelo del carro
     *
     * @return String del modelo del carro
     */
    String getModel();

    /**
     * Obtiene el tipo de carro
     *
     * @return CarType del tipo de carro
     */
    CarType getCarType();
}
