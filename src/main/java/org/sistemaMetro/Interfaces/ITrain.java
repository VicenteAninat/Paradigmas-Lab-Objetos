package org.sistemaMetro.Interfaces;

import org.sistemaMetro.clases.Train;
import org.sistemaMetro.clases.PassengerCar;

public interface ITrain {
    /**
     * Añade un carro a un tren en una posición específica
     *
     * @param train al que se le añadirá el carro
     * @param carro que se añadirá
     * @param position posición en la que se añadirá el carro
     */
    void addCar(Train train, PassengerCar carro, int position);

    /**
     * Remueve un carro de un tren en una posición específica
     *
     * @param train al que se le removerá el carro
     * @param position posición en la que se removerá el carro
     */
    void removeCar(Train train, int position);

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
     * @param train del que se quiere obtener la capacidad
     * @return int de la capacidad
     */
    int fetchCapacity(Train train);
}
