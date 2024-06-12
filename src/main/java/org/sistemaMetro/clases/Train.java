package org.sistemaMetro.clases;

import java.util.ArrayList;
import org.sistemaMetro.Interfaces.ITrain;
import org.sistemaMetro.clases.PassengerCar;

public class Train implements ITrain{
    public int id;
    public String trainMaker;
    public int speed;
    public ArrayList<PassengerCar> carList;

    // Constructor
    public Train(int id, String trainMaker, int speed, ArrayList<PassengerCar> carList) {
        if (speed <= 0) {
            throw new IllegalArgumentException
                    ("La velocidad del tren debe ser un número positivo");
        } else {
            this.id = id;
            this.trainMaker = trainMaker;
            this.speed = speed;
            this.carList = carList;
        }
    }

    // Selectores

    // Modificadores

    // Métodos
    @Override
    public void addCar(Train train, PassengerCar carro, int position) {
        train.carList.add(position, carro);
    }

    @Override
    public void removeCar(Train train, int position) {
        train.carList.remove(position);
    }

    @Override
    public boolean comprobacionIdUnico(Train train){
        for (int i = 0; i < train.carList.size(); i++) {
            for (int j = i + 1; j < train.carList.size(); j++) {
                if (train.carList.get(i).getId() == train.carList.get(j).getId()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isTrain(Train train){

        return true; // Placeholder
    }

    @Override
    public int fetchCapacity(Train train){
        int capacity = 0;
        for (PassengerCar car : train.carList) {
            capacity += car.passengerCapacity;
        }
        return capacity;
    }
}
