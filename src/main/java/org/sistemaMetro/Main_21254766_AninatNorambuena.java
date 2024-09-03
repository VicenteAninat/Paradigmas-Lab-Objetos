package org.sistemaMetro;

import org.sistemaMetro.clases.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main_21254766_AninatNorambuena {
    /**
     * Método principal
     *
     * @param args (String[]) Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // Inicializacion
        Station_21254766_AninatNorambuena E1 = new Station_21254766_AninatNorambuena(1, "San Pablo", "c", 45);
        Station_21254766_AninatNorambuena E2 = new Station_21254766_AninatNorambuena(2, "Neptuno", "r", 50);
        Station_21254766_AninatNorambuena E3 = new Station_21254766_AninatNorambuena(3, "Pajaritos", "r", 40);
        Station_21254766_AninatNorambuena E4 = new Station_21254766_AninatNorambuena(4, "Las Rejas", "r", 45);
        Station_21254766_AninatNorambuena E5 = new Station_21254766_AninatNorambuena(5, "Ecuador", "r", 55);
        Station_21254766_AninatNorambuena E6 = new Station_21254766_AninatNorambuena(6, "San Alberto Hurtado", "r", 40);
        Station_21254766_AninatNorambuena E7 = new Station_21254766_AninatNorambuena(7, "Universidad de Santiago", "r", 50);
        Station_21254766_AninatNorambuena E8 = new Station_21254766_AninatNorambuena(8, "Estacion Central", "r", 45);
        Station_21254766_AninatNorambuena E9 = new Station_21254766_AninatNorambuena(9, "Unión Latinoamericana", "r", 40);
        Station_21254766_AninatNorambuena E10 = new Station_21254766_AninatNorambuena(10, "Republica", "r", 50);
        Station_21254766_AninatNorambuena E11 = new Station_21254766_AninatNorambuena(11, "Los Heroes", "c", 45);
        Station_21254766_AninatNorambuena E12 = new Station_21254766_AninatNorambuena(12, "La Moneda", "r", 40);
        Station_21254766_AninatNorambuena E13 = new Station_21254766_AninatNorambuena(13, "Universidad de Chile", "c", 50);
        Station_21254766_AninatNorambuena E14 = new Station_21254766_AninatNorambuena(14, "Santa Lucia", "r", 45);
        Station_21254766_AninatNorambuena E15 = new Station_21254766_AninatNorambuena(15, "Universidad Catolica", "r", 40);
        Station_21254766_AninatNorambuena E16 = new Station_21254766_AninatNorambuena(16, "Baquedano", "c", 50);
        Station_21254766_AninatNorambuena E17 = new Station_21254766_AninatNorambuena(17, "Salvador", "r", 45);
        Station_21254766_AninatNorambuena E18 = new Station_21254766_AninatNorambuena(18, "Manuel Montt", "r", 40);
        Station_21254766_AninatNorambuena E19 = new Station_21254766_AninatNorambuena(19, "Pedro de Valdivia", "r", 50);
        Station_21254766_AninatNorambuena E20 = new Station_21254766_AninatNorambuena(20, "Los Leones", "r", 45);
        Station_21254766_AninatNorambuena E21 = new Station_21254766_AninatNorambuena(21, "Tobalaba", "c", 40);
        Station_21254766_AninatNorambuena E22 = new Station_21254766_AninatNorambuena(22, "El Golf", "r", 50);
        Station_21254766_AninatNorambuena E23 = new Station_21254766_AninatNorambuena(23, "Alcantara", "r", 45);
        Station_21254766_AninatNorambuena E24 = new Station_21254766_AninatNorambuena(24, "Escuela Militar", "r", 40);
        Station_21254766_AninatNorambuena E25 = new Station_21254766_AninatNorambuena(25, "Manquehue", "r", 50);
        Station_21254766_AninatNorambuena E26 = new Station_21254766_AninatNorambuena(26, "Hernando de Magallanes", "r", 45);
        Station_21254766_AninatNorambuena E27 = new Station_21254766_AninatNorambuena(27, "Los Dominicos", "t", 40);

        Section_21254766_AninatNorambuena S1 = new Section_21254766_AninatNorambuena(E1, E2, 100, 200);
        Section_21254766_AninatNorambuena S2 = new Section_21254766_AninatNorambuena(E2, E3, 80, 250);
        Section_21254766_AninatNorambuena S3 = new Section_21254766_AninatNorambuena(E3, E4, 90, 300);
        Section_21254766_AninatNorambuena S4 = new Section_21254766_AninatNorambuena(E4, E5, 110, 250);
        Section_21254766_AninatNorambuena S5 = new Section_21254766_AninatNorambuena(E5, E6, 80, 200);
        Section_21254766_AninatNorambuena S6 = new Section_21254766_AninatNorambuena(E6, E7, 100, 250);
        Section_21254766_AninatNorambuena S7 = new Section_21254766_AninatNorambuena(E7, E8, 90, 300);
        Section_21254766_AninatNorambuena S8 = new Section_21254766_AninatNorambuena(E8, E9, 110, 250);
        Section_21254766_AninatNorambuena S9 = new Section_21254766_AninatNorambuena(E9, E10, 80, 200);
        Section_21254766_AninatNorambuena S10 = new Section_21254766_AninatNorambuena(E10, E11, 100, 250);
        Section_21254766_AninatNorambuena S11 = new Section_21254766_AninatNorambuena(E11, E12, 90, 350);
        Section_21254766_AninatNorambuena S12 = new Section_21254766_AninatNorambuena(E12, E13, 110, 250);
        Section_21254766_AninatNorambuena S13 = new Section_21254766_AninatNorambuena(E13, E14, 80, 200);
        Section_21254766_AninatNorambuena S14 = new Section_21254766_AninatNorambuena(E14, E15, 100, 250);
        Section_21254766_AninatNorambuena S15 = new Section_21254766_AninatNorambuena(E15, E16, 90, 300);
        Section_21254766_AninatNorambuena S16 = new Section_21254766_AninatNorambuena(E16, E17, 110, 250);
        Section_21254766_AninatNorambuena S17 = new Section_21254766_AninatNorambuena(E17, E18, 80, 200);
        Section_21254766_AninatNorambuena S18 = new Section_21254766_AninatNorambuena(E18, E19, 100, 250);
        Section_21254766_AninatNorambuena S19 = new Section_21254766_AninatNorambuena(E19, E20, 90, 300);
        Section_21254766_AninatNorambuena S20 = new Section_21254766_AninatNorambuena(E20, E21, 110, 250);
        Section_21254766_AninatNorambuena S21 = new Section_21254766_AninatNorambuena(E21, E22, 80, 200);
        Section_21254766_AninatNorambuena S22 = new Section_21254766_AninatNorambuena(E22, E23, 100, 250);
        Section_21254766_AninatNorambuena S23 = new Section_21254766_AninatNorambuena(E23, E24, 90, 300);
        Section_21254766_AninatNorambuena S24 = new Section_21254766_AninatNorambuena(E24, E25, 110, 250);
        Section_21254766_AninatNorambuena S25 = new Section_21254766_AninatNorambuena(E25, E26, 80, 200);
        Section_21254766_AninatNorambuena S26 = new Section_21254766_AninatNorambuena(E26, E27, 100, 250);

        List<Section_21254766_AninatNorambuena> sections = Arrays.asList(S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, S13, S14, S15, S16, S17, S18, S19, S20, S21, S22, S23, S24, S25, S26);
        ArrayList<Section_21254766_AninatNorambuena> sectionsList = new ArrayList<Section_21254766_AninatNorambuena>();
        sectionsList.addAll(sections);

        Line_21254766_AninatNorambuena L1 = new Line_21254766_AninatNorambuena(1, "Linea 1", "Rail01", sectionsList);

        /*
        System.out.println("Linea");
        System.out.println(L1.lineLength()); //Debe dar 2460
        System.out.println(L1.lineSectionLength("San Pablo", "Universidad de Santiago")); // Debe dar 460
        System.out.println(L1.lineCost()); // Debe dar 6500
        System.out.println(L1.lineSectionCost("San Pablo", "Universidad de Santiago")); // Debe dar 1200
        System.out.println(L1.isLine(L1)); // Debe dar true
        System.out.println("\n");
         */

        PassengerCar_21254766_AninatNorambuena C1 = new PassengerCar_21254766_AninatNorambuena(1, 50, "Modelo01", "Maker01", "tr");
        PassengerCar_21254766_AninatNorambuena C2 = new PassengerCar_21254766_AninatNorambuena(2, 60, "Modelo01", "Maker01", "ct");
        PassengerCar_21254766_AninatNorambuena C3 = new PassengerCar_21254766_AninatNorambuena(3, 70, "Modelo01", "Maker01", "ct");
        PassengerCar_21254766_AninatNorambuena C4 = new PassengerCar_21254766_AninatNorambuena(4, 80, "Modelo01", "Maker01", "tr");
        PassengerCar_21254766_AninatNorambuena C5 = new PassengerCar_21254766_AninatNorambuena(5, 90, "Modelo01", "Maker01", "ct");

        List<PassengerCar_21254766_AninatNorambuena> carros = Arrays.asList(C1, C2, C3, C4);
        ArrayList<PassengerCar_21254766_AninatNorambuena> carrosList = new ArrayList<PassengerCar_21254766_AninatNorambuena>();
        carrosList.addAll(carros);

        Train_21254766_AninatNorambuena T1 = new Train_21254766_AninatNorambuena(1, "Maker01", 100, 60, carrosList);

        /*
        System.out.println("Tren");
        System.out.println(T1.fetchCapacity()); // Debe dar 260
        System.out.println(T1.isTrain(T1)); // Debe dar true
         */

        Driver_21254766_AninatNorambuena D1 = new Driver_21254766_AninatNorambuena(1, "Pedro", "TMCavalier");
        Driver_21254766_AninatNorambuena D2 = new Driver_21254766_AninatNorambuena(2, "Juan", "TMCavalier");
        Driver_21254766_AninatNorambuena D3 = new Driver_21254766_AninatNorambuena(3, "Diego", "TMCavalier");

        ArrayList<Line_21254766_AninatNorambuena> lineas = new ArrayList<Line_21254766_AninatNorambuena>();
        lineas.add(L1);
        ArrayList<Train_21254766_AninatNorambuena> trenes = new ArrayList<Train_21254766_AninatNorambuena>();
        trenes.add(T1);
        ArrayList<Driver_21254766_AninatNorambuena> conductores = new ArrayList<Driver_21254766_AninatNorambuena>();
        conductores.add(D1);
        conductores.add(D2);
        conductores.add(D3);

        Subway_21254766_AninatNorambuena S = new Subway_21254766_AninatNorambuena(1, "Metro de Santiago");
        S.subwayAddLine(lineas);
        S.subwayAddTrain(trenes);
        S.subwayAddDriver(conductores);

        Menu_21254766_AninatNorambuena.run(S);
    }
}