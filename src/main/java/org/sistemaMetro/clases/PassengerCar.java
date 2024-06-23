package org.sistemaMetro.clases;

import java.util.ArrayList;
import org.sistemaMetro.Interfaces.IPassengerCar;

public class PassengerCar implements IPassengerCar{
    private int id;
    private int passengerCapacity;
    private String model;
    private String trainMaker;
    private String carType;

    // Constructor
    public PassengerCar(int id, int passengerCapacity, String model, String trainMaker, String carType) {
        if (passengerCapacity <= 0) {
            throw new IllegalArgumentException
                    ("La capacidad de pasajeros debe ser un número positivo");
        } else if (!validCType(carType)) {
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

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getTrainMaker() {
        return trainMaker;
    }

    @Override
    public String getCarType() {
        return carType;
    }

    // Métodos
    @Override
    public boolean validCType (String carType){
        return carType.equals("ct") ||
                carType.equals("tr");
    }

    @Override
    public String toString(){
        return "\n" +
                "id = " + id + "\n" +
                "capacidad de pasajeros = " + passengerCapacity + "\n" +
                "modelo = " + model + "\n" +
                "fabricante = " + trainMaker + "\n" +
                "tipo de carro = " + carType + "\n";
    }
}
