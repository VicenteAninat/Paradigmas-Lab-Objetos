package org.sistemaMetro.Interfaces;
import org.sistemaMetro.clases.Station;

public interface ISection {
    Station getPoint1();
    Station getPoint2();
    int getDistance();
    int getCost();
}
