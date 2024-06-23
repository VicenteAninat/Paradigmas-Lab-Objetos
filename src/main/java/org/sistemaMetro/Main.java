package org.sistemaMetro;

import org.sistemaMetro.clases.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Inicializacion
        Station E1 = new Station(1, "San Pablo", "c", 45);
        Station E2 = new Station(2, "Neptuno", "r", 50);
        Station E3 = new Station(3, "Pajaritos", "r", 40);
        Station E4 = new Station(4, "Las Rejas", "r", 45);
        Station E5 = new Station(5, "Ecuador", "r", 55);
        Station E6 = new Station(6, "San Alberto Hurtado", "r", 40);
        Station E7 = new Station(7, "Universidad de Santiago", "r", 50);
        Station E8 = new Station(8, "Estacion Central", "r", 45);
        Station E9 = new Station(9, "Unión Latinoamericana", "r", 40);
        Station E10 = new Station(10, "Republica", "r", 50);
        Station E11 = new Station(11, "Los Heroes", "c", 45);
        Station E12 = new Station(12, "La Moneda", "r", 40);
        Station E13 = new Station(13, "Universidad de Chile", "c", 50);
        Station E14 = new Station(14, "Santa Lucia", "r", 45);
        Station E15 = new Station(15, "Universidad Catolica", "r", 40);
        Station E16 = new Station(16, "Baquedano", "c", 50);
        Station E17 = new Station(17, "Salvador", "r", 45);
        Station E18 = new Station(18, "Manuel Montt", "r", 40);
        Station E19 = new Station(19, "Pedro de Valdivia", "r", 50);
        Station E20 = new Station(20, "Los Leones", "r", 45);
        Station E21 = new Station(21, "Tobalaba", "c", 40);
        Station E22 = new Station(22, "El Golf", "r", 50);
        Station E23 = new Station(23, "Alcantara", "r", 45);
        Station E24 = new Station(24, "Escuela Militar", "r", 40);
        Station E25 = new Station(25, "Manquehue", "r", 50);
        Station E26 = new Station(26, "Hernando de Magallanes", "r", 45);
        Station E27 = new Station(27, "Los Dominicos", "t", 40);

        Section S1 = new Section(E1, E2, 100, 200);
        Section S2 = new Section(E2, E3, 80, 250);
        Section S3 = new Section(E3, E4, 90, 300);
        Section S4 = new Section(E4, E5, 110, 250);
        Section S5 = new Section(E5, E6, 80, 200);
        Section S6 = new Section(E6, E7, 100, 250);
        Section S7 = new Section(E7, E8, 90, 300);
        Section S8 = new Section(E8, E9, 110, 250);
        Section S9 = new Section(E9, E10, 80, 200);
        Section S10 = new Section(E10, E11, 100, 250);
        Section S11 = new Section(E11, E12, 90, 350);
        Section S12 = new Section(E12, E13, 110, 250);
        Section S13 = new Section(E13, E14, 80, 200);
        Section S14 = new Section(E14, E15, 100, 250);
        Section S15 = new Section(E15, E16, 90, 300);
        Section S16 = new Section(E16, E17, 110, 250);
        Section S17 = new Section(E17, E18, 80, 200);
        Section S18 = new Section(E18, E19, 100, 250);
        Section S19 = new Section(E19, E20, 90, 300);
        Section S20 = new Section(E20, E21, 110, 250);
        Section S21 = new Section(E21, E22, 80, 200);
        Section S22 = new Section(E22, E23, 100, 250);
        Section S23 = new Section(E23, E24, 90, 300);
        Section S24 = new Section(E24, E25, 110, 250);
        Section S25 = new Section(E25, E26, 80, 200);
        Section S26 = new Section(E26, E27, 100, 250);

        List<Section> sections = Arrays.asList(S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, S13, S14, S15, S16, S17, S18, S19, S20, S21, S22, S23, S24, S25, S26);
        ArrayList<Section> sectionsList = new ArrayList<Section>();
        sectionsList.addAll(sections);

        Line L1 = new Line(1, "Linea 1", "Rail01", sectionsList);

        System.out.println("Linea");
        System.out.println(L1.lineLength());
        System.out.println(L1.lineSectionLength("San Pablo", "Universidad de Santiago"));
        System.out.println(L1.lineCost());
        System.out.println(L1.lineSectionCost("San Pablo", "Universidad de Santiago"));
        System.out.println(L1.isLine(L1));
        System.out.println("\n");

        PassengerCar C1 = new PassengerCar(1, 50, "Modelo01", "Maker01", "tr");
        PassengerCar C2 = new PassengerCar(2, 60, "Modelo01", "Maker01", "ct");
        PassengerCar C3 = new PassengerCar(3, 70, "Modelo01", "Maker01", "ct");
        PassengerCar C4 = new PassengerCar(4, 80, "Modelo01", "Maker01", "tr");
        PassengerCar C5 = new PassengerCar(5, 90, "Modelo01", "Maker01", "ct");

        List<PassengerCar> carros = Arrays.asList(C1, C2, C3, C4);
        ArrayList<PassengerCar> carrosList = new ArrayList<PassengerCar>();
        carrosList.addAll(carros);

        Train T1 = new Train(1, "Maker01", 100, carrosList);

        System.out.println("Tren");
        System.out.println(T1.fetchCapacity());
        System.out.println(T1.isTrain(T1));

        Driver D1 = new Driver(1, "Pedro", "TMCavalier");
        Driver D2 = new Driver(2, "Juan", "TMCavalier");
        Driver D3 = new Driver(3, "Diego", "TMCavalier");

        ArrayList<Line> lineas = new ArrayList<Line>();
        lineas.add(L1);
        ArrayList<Train> trenes = new ArrayList<Train>();
        trenes.add(T1);
        ArrayList<Driver> conductores = new ArrayList<Driver>();
        conductores.add(D1);
        conductores.add(D2);
        conductores.add(D3);

        Subway S = new Subway(1, "Metro de Santiago");
        S.subwayAddLine(lineas);
        S.subwayAddTrain(trenes);
        S.subwayAddDriver(conductores);

        Menu.run(S);

    }
}