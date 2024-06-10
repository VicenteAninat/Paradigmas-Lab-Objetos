package org.sistemaMetro.Interfaces;

import org.sistemaMetro.clases.Train;
import org.sistemaMetro.clases.PassengerCar;

public interface ITrain {
    void addCar(Train train, PassengerCar carro, int position);
    void removeCar(Train train, int position);
    boolean isTrain(Train train);
    int fetchCapacity(Train train);
}
