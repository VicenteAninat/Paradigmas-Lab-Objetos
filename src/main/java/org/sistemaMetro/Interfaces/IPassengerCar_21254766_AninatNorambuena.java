package org.sistemaMetro.Interfaces;

public interface IPassengerCar_21254766_AninatNorambuena {
    /**
     * Obtiene el id del carro
     *
     * @return (int)
     */
    int getId();

    /**
     * Obtiene la capacidad de pasajeros del carro
     *
     * @return (int)
     */
    int getPassengerCapacity();

    /**
     * Obtiene el modelo del carro
     *
     * @return (String)
     */
    String getModel();

    /**
     * Obtiene el fabricante del carro
     *
     * @return (String)
     */
    String getTrainMaker();

    /**
     * Obtiene el tipo de carro
     *
     * @return (String)
     */
    String getCarType();

    /**
     * Valida el tipo de carro
     *
     * @param carType (String) tipo de carro
     * @return (boolean)
     */
    boolean validCType (String carType);
}
