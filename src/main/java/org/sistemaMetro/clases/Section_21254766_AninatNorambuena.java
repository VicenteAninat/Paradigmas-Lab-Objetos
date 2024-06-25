package org.sistemaMetro.clases;
import org.sistemaMetro.Interfaces.ISection_21254766_AninatNorambuena;

public class Section_21254766_AninatNorambuena implements ISection_21254766_AninatNorambuena {
    private final Station_21254766_AninatNorambuena point1;
    private final Station_21254766_AninatNorambuena point2;
    private final int distance;
    private final int cost;

    // Constructor
    public Section_21254766_AninatNorambuena(Station_21254766_AninatNorambuena point1, Station_21254766_AninatNorambuena point2, int distance, int cost) {
        this.point1 = point1;
        this.point2 = point2;
        this.distance = distance;
        this.cost = cost;
    }

    // Selectores
    @Override
    public Station_21254766_AninatNorambuena getPoint1() {
        return point1;
    }

    @Override
    public Station_21254766_AninatNorambuena getPoint2() {
        return point2;
    }

    @Override
    public int getDistance() {
        return distance;
    }

    @Override
    public int getCost() {
        return cost;
    }

    // Métodos
    @Override
    public String toString(){
        return "Estacion 1: " + point1.getName() + "\n" +
                "Estacion 2: " + point2.getName() + "\n" +
                "Distancia: " + distance + "\n" +
                "Costo: " + cost + "\n";
    }
}
