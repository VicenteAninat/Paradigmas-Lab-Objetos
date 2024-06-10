package org.sistemaMetro.clases;

import java.util.ArrayList;

public class Train {
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
    public void addCar(Train train, PassengerCar carro, int position) {
        train.carList.add(position, carro);
    }

    public void removeCar(Train train, int position) {
        train.carList.remove(position);
    }

    public boolean isTrain(Train train){
        // some code
        return true; // Placeholder
    }

    public int fetchCapacity(Train train){
        int capacity = 0;
        for (PassengerCar car : train.carList) {
            capacity += car.passengerCapacity;
        }
        return capacity;
    }
}
