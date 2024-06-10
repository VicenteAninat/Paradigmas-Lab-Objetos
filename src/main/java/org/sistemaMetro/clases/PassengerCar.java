package org.sistemaMetro.clases;

public class PassengerCar {
    public int id;
    public int passengerCapacity;
    public String model;
    public String trainMaker;
    public CarType carType;

    // Constructor
    public PassengerCar(int id, int passengerCapacity, String model, String trainMaker, CarType carType) {
        if (passengerCapacity <= 0) {
            throw new IllegalArgumentException
                    ("La capacidad de pasajeros debe ser un número positivo");
        } else if (!carType.validType(carType)) {
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
}
