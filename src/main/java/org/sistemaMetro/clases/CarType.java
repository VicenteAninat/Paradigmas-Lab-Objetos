package org.sistemaMetro.clases;

public class CarType {
    public String type;

    public CarType(String type){
        this.type = type;
    }

    public String getType(CarType carType){
        return carType.type;
    }

    public boolean validType (CarType carType){
        if (carType.getType(carType).equals("ct") ||
                carType.getType(carType).equals("tr")) {
            return true;
        } else {
            return false;
        }
    }
}
