package org.sistemaMetro.clases;

import java.util.ArrayList;
import org.sistemaMetro.Interfaces.ITrain;
import org.sistemaMetro.clases.PassengerCar;

public class Train implements ITrain{
    private int id;
    private String trainMaker;
    private int speed;
    private ArrayList<PassengerCar> carList;

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
    @Override
    public int getId() {
        return id;
    }

    @Override
    public ArrayList<PassengerCar> getCarList() {
        return carList;
    }

    // Modificadores

    // Métodos
    @Override
    public void addCar(PassengerCar carro, int position) {
        carList.add(position, carro);
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
    public boolean comprobacionMismoModelo(Train train){
        for (int i = 0; i < train.carList.size(); i++) {
            for (int j = i + 1; j < train.carList.size(); j++) {
                if (!train.carList.get(i).getModel().equals(train.carList.get(j).getModel())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean comprobacionExtremosValidos(Train train){
        if (!((train.carList.get(0).getCarType().getCType().equals(train.carList.get(train.carList.size() - 1).getCarType().getCType()))
                &&  (train.carList.get(0).getCarType().getCType().equals("tr")))) {
            return false;
        }
        return true;
    }

    @Override
    public boolean comprobacionCentroValido(Train train){
        for (int i = 1; i < train.carList.size() - 2; i++) {
            if (train.carList.get(i).getCarType().getCType().equals("tr")) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean estructuraValida(Train train){
        if (!comprobacionExtremosValidos(train)) {
            return false;
        } else if (!comprobacionCentroValido(train)){
            return false;
        }
        return true;
    }

    @Override
    public boolean isTrain(Train train){
        try {
            if (train.speed <= 0) {
                throw new IllegalArgumentException
                        ("La velocidad del tren debe ser un número positivo");
            } else if (train.carList.size() == 0 || train.carList.size() == 1) {
                throw new IllegalArgumentException
                        ("Cantidad de carros invalida");
            } else if (!comprobacionIdUnico(train)) {
                throw new IllegalArgumentException
                        ("Los id de los carros no son únicos");
            } else if (!comprobacionMismoModelo(train)) {
                throw new IllegalArgumentException
                        ("Los modelos de los carros difieren");
            } else if (!estructuraValida(train)) {
                throw new IllegalArgumentException
                        ("La estructura del tren no es válida");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public int fetchCapacity(){
        int capacity = 0;
        for (PassengerCar car : carList) {
            capacity += car.getPassengerCapacity();
        }
        return capacity;
    }
}
