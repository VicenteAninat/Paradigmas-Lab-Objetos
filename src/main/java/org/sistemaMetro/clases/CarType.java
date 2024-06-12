package org.sistemaMetro.clases;

public class CarType {
    public String type;

    public CarType(String type){
        this.type = type;
    }

    public String getCType(){
        return type;
    }

    public boolean validCType (CarType carType){
        return carType.getCType().equals("ct") ||
                carType.getCType().equals("tr");
    }
}
