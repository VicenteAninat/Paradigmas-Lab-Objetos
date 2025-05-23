package org.sistemaMetro.clases;

import java.util.ArrayList;
import org.sistemaMetro.Interfaces.ITrain_21254766_AninatNorambuena;

import java.util.stream.Collectors;

public class Train_21254766_AninatNorambuena implements ITrain_21254766_AninatNorambuena {
    private final int id;
    private final String trainMaker;
    private final int speed;
    private final int stationStaytime;
    private ArrayList<PassengerCar_21254766_AninatNorambuena> carList;

    // Constructor
    /**
     * Constructor
     *
     * @param id (int) id del tren.
     * @param trainMaker (String) Fabricante del tren.
     * @param speed (int) Velocidad del tren.
     * @param stationStaytime (int) Tiempo de detención en estación.
     * @param carList (list.PassengerCar_21254766_AninatNorambuena) Lista de carros del tren.
     */
    public Train_21254766_AninatNorambuena(int id, String trainMaker, int speed, int stationStaytime, ArrayList<PassengerCar_21254766_AninatNorambuena> carList) {
        if (speed <= 0) {
            throw new IllegalArgumentException
                    ("La velocidad del tren debe ser un número positivo");
        } else if (stationStaytime <= 0){
            throw new IllegalArgumentException
                    ("El tiempo de detencion debe ser un número positivo");
        } else {
            this.id = id;
            this.trainMaker = trainMaker;
            this.speed = speed;
            this.stationStaytime = stationStaytime;
            this.carList = carList;
        }
    }

    // Selectores
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getTrainMaker() {
        return trainMaker;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getStationStaytime() {
        return stationStaytime;
    }

    @Override
    public ArrayList<PassengerCar_21254766_AninatNorambuena> getCarList() {
        return carList;
    }

    // Métodos
    /**
     * Agrega un carro al tren
     *
     * @param carro (PassengerCar_21254766_AninatNorambuena) Carro a agregar.
     * @param position (int) Posición en la que se agregará el carro.
     */
    @Override
    public void addCar(PassengerCar_21254766_AninatNorambuena carro, int position) {
        carList.add(position, carro);
    }

    /**
     * Remueve un carro del tren
     *
     * @param train (Train_21254766_AninatNorambuena) Tren del que se removerá el carro.
     * @param position (int) Posición del carro a remover.
     */
    @Override
    public void removeCar(Train_21254766_AninatNorambuena train, int position) {
        train.carList.remove(position);
    }

    /**
     * Comprueba que todos los carros en el tren tengan un id unico
     *
     * @param train (Train_21254766_AninatNorambuena) Tren a comprobar.
     * @return (boolean
     */
    @Override
    public boolean comprobacionIdUnico(Train_21254766_AninatNorambuena train){
        for (int i = 0; i < train.carList.size(); i++) {
            for (int j = i + 1; j < train.carList.size(); j++) {
                if (train.carList.get(i).getId() == train.carList.get(j).getId()) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Comprueba que todos los carros en el tren tengan el mismo modelo
     *
     * @param train (Train_21254766_AninatNorambuena) Tren a comprobar.
     * @return (boolean)
     */
    @Override
    public boolean comprobacionMismoModelo(Train_21254766_AninatNorambuena train){
        for (int i = 0; i < train.carList.size(); i++) {
            for (int j = i + 1; j < train.carList.size(); j++) {
                if (!train.carList.get(i).getModel().equals(train.carList.get(j).getModel())) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Comprueba que todos los carros en el tren tengan el mismo fabricante
     *
     * @param train (Train_21254766_AninatNorambuena) Tren a comprobar.
     * @return (boolean)
     */
    @Override
    public boolean comprobacionMismoFabricante(Train_21254766_AninatNorambuena train){
        String fabricante = train.getTrainMaker();
        for (int i = 0; i < train.carList.size(); i++) {
            if (!train.carList.get(i).getTrainMaker().equals(fabricante)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Comprueba que los extremos del tren sean terminales
     *
     * @param train (Train_21254766_AninatNorambuena) Tren a comprobar.
     * @return (boolean)
     */
    @Override
    public boolean comprobacionExtremosValidos(Train_21254766_AninatNorambuena train){
        if (!((train.carList.get(0).getCarType().equals(train.carList.get(train.carList.size() - 1).getCarType()))
                &&  (train.carList.get(0).getCarType().equals("tr")))) {
            return false;
        }
        return true;
    }

    /**
     * Comprueba que el centro del tren no tenga terminales
     *
     * @param train (Train_21254766_AninatNorambuena) Tren a comprobar.
     * @return (boolean)
     */
    @Override
    public boolean comprobacionCentroValido(Train_21254766_AninatNorambuena train){
        for (int i = 1; i < train.carList.size() - 2; i++) {
            if (train.carList.get(i).getCarType().equals("tr")) {
                return false;
            }
        }
        return true;
    }

    /**
     * Comprueba que la estructura del tren sea válida
     *
     * @param train (Train_21254766_AninatNorambuena) Tren a comprobar.
     * @return (boolean)
     */
    @Override
    public boolean estructuraValida(Train_21254766_AninatNorambuena train){
        if (!comprobacionExtremosValidos(train)) {
            return false;
        } else if (!comprobacionCentroValido(train)){
            return false;
        }
        return true;
    }

    /**
     * Comprueba si un tren en toda su estructura es válido
     *
     * @param train (Train_21254766_AninatNorambuena) Tren a comprobar.
     * @return (boolean)
     */
    @Override
    public boolean isTrain(Train_21254766_AninatNorambuena train){
        try {
            if (train.speed <= 0) {
                throw new IllegalArgumentException
                        ("La velocidad del tren debe ser un número positivo");
            } if(train.stationStaytime <= 0) {
                throw new IllegalArgumentException
                        ("El tiempo de detencion debe ser un número positivo");
            } else if (train.carList.size() == 0 || train.carList.size() == 1) {
                throw new IllegalArgumentException
                        ("Cantidad de carros invalida");
            } else if (!comprobacionIdUnico(train)) {
                throw new IllegalArgumentException
                        ("Los id de los carros no son únicos");
            } else if (!comprobacionMismoModelo(train)) {
                throw new IllegalArgumentException
                        ("Los modelos de los carros difieren");
            } else if (!comprobacionMismoFabricante(train)){
                throw new IllegalArgumentException
                        ("Los fabricantes de los carros difieren");
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

    /**
     * Obtiene la capacidad total de pasajeros del tren
     *
     * @return (int)
     */
    @Override
    public int fetchCapacity(){
        int capacity = 0;
        for (PassengerCar_21254766_AninatNorambuena car : carList) {
            capacity += car.getPassengerCapacity();
        }
        return capacity;
    }

    /**
     * Describe el tren en formato texto
     *
     * @return (String)
     */
    @Override
    public String toString(){
        String carDetails = carList.stream().map(PassengerCar_21254766_AninatNorambuena::toString).collect(Collectors.joining(", "));
        return "Datos del tren\n" +
                "id = " + id + "\n" +
                "fabricante = " + trainMaker + "\n" +
                "velocidad = " + speed + "\n" +
                "tiempo de detencion = " + stationStaytime + "\n" +
                "carros del tren\n" + carDetails + "\n\n";
    }
}
