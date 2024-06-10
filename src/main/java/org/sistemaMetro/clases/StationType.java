package org.sistemaMetro.clases;

public class StationType {
    public String type;

    public StationType(String type){
        this.type = type;
    }

    public String getType(StationType stationType){
        return stationType.type;
    }

    public boolean validType (StationType stationType){
        if (stationType.getType(stationType).equals("c") ||
                stationType.getType(stationType).equals("t") ||
                stationType.getType(stationType).equals("m") ||
                stationType.getType(stationType).equals("r")) {
            return true;
        } else {
            return false;
        }
    }
}
