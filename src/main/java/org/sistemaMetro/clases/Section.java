package org.sistemaMetro.clases;

public class Section {
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
    public int getDistance() {
        return distance;
    }
}
