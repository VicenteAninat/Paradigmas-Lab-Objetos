package org.sistemaMetro.Interfaces;

import org.sistemaMetro.clases.Train_21254766_AninatNorambuena;
import org.sistemaMetro.clases.PassengerCar_21254766_AninatNorambuena;

import java.util.ArrayList;

public interface ITrain_21254766_AninatNorambuena {
    /**
     * Obtiene el id del tren
     *
     * @return (int)
     */
    int getId();

    /**
     * Obtiene el fabricante del tren
     *
     * @return (String)
     */
    String getTrainMaker();

    /**
     * Obtiene la velocidad del tren
     *
     * @return (int)
     */
    int getSpeed();

    /**
     * Obtiene el tiempo de estancia en la estación del tren
     *
     * @return (int)
     */
    int getStationStaytime();

    /**
     * Obtiene la lista de carros de un tren
     *
     * @return (list.PassengerCar_21254766_AninatNorambuena)
     */
    ArrayList<PassengerCar_21254766_AninatNorambuena> getCarList();

    /**
     * Añade un carro a un tren en una posición específica
     *
     * @param carro (PassengerCar_21254766_AninatNorambuena) carro que se añadirá
     * @param position (int) posición en la que se añadirá el carro
     */
    void addCar(PassengerCar_21254766_AninatNorambuena carro, int position);

    /**
     * Remueve un carro de un tren en una posición específica
     *
     * @param train (Train_21254766_AninatNorambuena) tren al que se le removerá el carro
     * @param position (int) posición en la que se removerá el carro
     */
    void removeCar(Train_21254766_AninatNorambuena train, int position);

    /**
     * Comprueba si el id de los carros de un tren son únicos
     *
     * @param train (Train_21254766_AninatNorambuena) tren que se quiere verificar
     * @return (boolean)
     */
    boolean comprobacionIdUnico(Train_21254766_AninatNorambuena train);

    /**
     * Comprueba si los modelos de los carros de un tren son iguales
     *
     * @param train (Train_21254766_AninatNorambuena) tren que se quiere verificar
     * @return (boolean)
     */
    boolean comprobacionMismoModelo(Train_21254766_AninatNorambuena train);

    /**
     * Comprueba si los fabricantes de los carros de un tren son iguales
     *
     * @param train (Train_21254766_AninatNorambuena) tren que se quiere verificar
     * @return (boolean)
     */
    boolean comprobacionMismoFabricante(Train_21254766_AninatNorambuena train);

    /**
     * Comprueba si los extremos de un tren son terminales
     *
     * @param train (Train_21254766_AninatNorambuena) tren que se quiere verificar
     * @return (boolean)
     */
    boolean comprobacionExtremosValidos(Train_21254766_AninatNorambuena train);

    /**
     * Comprueba si los carros centrales de un tren son tipo centrales
     *
     * @param train (Train_21254766_AninatNorambuena) tren que se quiere verificar
     * @return (boolean)
     */
    boolean comprobacionCentroValido(Train_21254766_AninatNorambuena train);

    /**
     * Comprueba si la estructura de un tren es válida
     *
     * @param train (Train_21254766_AninatNorambuena) tren que se quiere verificar
     * @return (boolean)
     */
    boolean estructuraValida(Train_21254766_AninatNorambuena train);

    /**
     * Verifica si un tren es válido
     *
     * @param train (Train_21254766_AninatNorambuena) tren que se quiere verificar
     * @return (boolean)
     */
    boolean isTrain(Train_21254766_AninatNorambuena train);

    /**
     * Obtiene la capacidad de pasajeros de un tren
     *
     * @return (int)
     */
    int fetchCapacity();
}
