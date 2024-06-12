package org.sistemaMetro.clases;

public class StationType {
    private String type;

    public StationType(String type){
        this.type = type;
    }

    public String getSType(){
        return type;
    }

    public boolean validSType(StationType stationType){
        return stationType.getSType().equals("c") ||
                stationType.getSType().equals("t") ||
                stationType.getSType().equals("m") ||
                stationType.getSType().equals("r");
    }
}
