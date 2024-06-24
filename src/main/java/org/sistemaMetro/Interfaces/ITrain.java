package org.sistemaMetro.Interfaces;

import org.sistemaMetro.clases.Train;
import org.sistemaMetro.clases.PassengerCar;

import java.util.ArrayList;

public interface ITrain {
    /**
     * Obtiene el id del tren
     *
     * @return int del id del tren
     */
    int getId();

    /**
     * Obtiene el fabricante del tren
     *
     * @return String del fabricante del tren
     */
    String getTrainMaker();

    /**
     * Obtiene la velocidad del tren
     *
     * @return int de la velocidad del tren
     */
    int getSpeed();

    /**
     * Obtiene el tiempo de estancia en la estación del tren
     *
     * @return int del tiempo de estancia en la estación del tren
     */
    int getStationStaytime();

    /**
     * Obtiene la lista de carros de un tren
     *
     * @return Lista de carros
     */
    ArrayList<PassengerCar> getCarList();

    /**
     * Añade un carro a un tren en una posición específica
     *
     * @param carro que se añadirá
     * @param position posición en la que se añadirá el carro
     */
    void addCar(PassengerCar carro, int position);

    /**
     * Remueve un carro de un tren en una posición específica
     *
     * @param train al que se le removerá el carro
     * @param position posición en la que se removerá el carro
     */
    void removeCar(Train train, int position);


    /**
     * Comprueba si el id de los carros de un tren son únicos
     *
     * @param train tren que se quiere verificar
     * @return boolean si el id es único
     */
    boolean comprobacionIdUnico(Train train);

    /**
     * Comprueba si los modelos de los carros de un tren son iguales
     *
     * @param train tren que se quiere verificar
     * @return boolean si los modelos son únicos
     */
    boolean comprobacionMismoModelo(Train train);

    /**
     * Comprueba si los fabricantes de los carros de un tren son iguales
     *
     * @param train tren que se quiere verificar
     * @return boolean si los fabricantes son iguales
     */
    boolean comprobacionMismoFabricante(Train train);

    /**
     * Comprueba si los extremos de un tren son terminales
     *
     * @param train tren que se quiere verificar
     * @return boolean si los extremos son válidos
     */
    boolean comprobacionExtremosValidos(Train train);

    /**
     * Comprueba si los carros centrales de un tren son tipo centrales
     *
     * @param train tren que se quiere verificar
     * @return boolean si el centro es válido
     */
    boolean comprobacionCentroValido(Train train);

    /**
     * Comprueba si la estructura de un tren es válida
     *
     * @param train tren que se quiere verificar
     * @return boolean si la estructura es válida
     */
    boolean estructuraValida(Train train);

    /**
     * Verifica si un tren es válido
     *
     * @param train tren que se quiere verificar
     * @return boolean si es válido o no
     */
    boolean isTrain(Train train);

    /**
     * Obtiene la capacidad de pasajeros de un tren
     *
     * @return int de la capacidad
     */
    int fetchCapacity();
}
