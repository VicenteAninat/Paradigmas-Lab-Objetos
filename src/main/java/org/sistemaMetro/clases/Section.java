package org.sistemaMetro.clases;
import org.sistemaMetro.Interfaces.ISection;

public class Section implements ISection{
    public Station point1;
    public Station point2;
    public int distance;
    public int cost;

    // Constructor
    public Section(Station point1, Station point2, int distance, int cost) {
        this.point1 = point1;
        this.point2 = point2;
        this.distance = distance;
        this.cost = cost;
    }

    // Selectores
    @Override
    public Station getPoint1() {
        return point1;
    }

    @Override
    public Station getPoint2() {
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
}
