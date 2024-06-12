package org.sistemaMetro.clases;

import java.util.ArrayList;
import org.sistemaMetro.Interfaces.IPassengerCar;

public class PassengerCar implements IPassengerCar{
    private int id;
    private int passengerCapacity;
    private String model;
    private String trainMaker;
    private CarType carType;

    // Constructor
    public PassengerCar(int id, int passengerCapacity, String model, String trainMaker, CarType carType) {
        if (passengerCapacity <= 0) {
            throw new IllegalArgumentException
                    ("La capacidad de pasajeros debe ser un número positivo");
        } else if (!carType.validCType(carType)) {
            throw new IllegalArgumentException
                    ("El tipo de carro no es válido");
        } else {
            this.id = id;
            this.passengerCapacity = passengerCapacity;
            this.model = model;
            this.trainMaker = trainMaker;
            this.carType = carType;
        }
    }

    // Selectores
    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    // Métodos
}
