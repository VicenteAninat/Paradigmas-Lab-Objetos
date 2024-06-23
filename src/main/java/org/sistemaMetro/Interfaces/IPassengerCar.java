package org.sistemaMetro.Interfaces;

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
     * Obtiene el fabricante del carro
     *
     * @return String del fabricante del carro
     */
    String getTrainMaker();

    /**
     * Obtiene el tipo de carro
     *
     * @return CarType del tipo de carro
     */
    String getCarType();

    /**
     * Valida el tipo de carro
     *
     * @param carType tipo de carro
     * @return true si el tipo de carro es válido, false en caso contrario
     */
    boolean validCType (String carType);
}
