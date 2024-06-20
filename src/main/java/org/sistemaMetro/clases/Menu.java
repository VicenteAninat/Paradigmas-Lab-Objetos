package org.sistemaMetro.clases;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Menu {

    public static void run(){
        Subway subway = new Subway(1, "Red de metro");
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        while(continuar) {
            System.out.println("¡Bienvenido!\n");
            System.out.println("Por favor ingrese el numero de una opción:\n\n" +
                    "1.- Cargar datos\n2.- Operar sobre la red\n3.- Salir");

            int seleccion = entrada.nextInt();
            switch (seleccion) {
                case 1:
                    menuDatos(subway);
                    break;
                case 2:
                    System.out.println("Place holder... volviendo al menú principal\n\n");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida... volviendo al menú principal \n\n");
                    break;
            }
        }
    }

    public static void menuDatos(Subway subway) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Por favor ingrese el numero de una opción:\n\n" +
                "1.- Cargar lineas\n2.- Cargar Trenes\n3.- Cargar Conductores\n4.- Volver");

        int seleccion = entrada.nextInt();
        switch (seleccion) {
            case 1:
                System.out.println("Ingrese la dirección del archivo de lineas.");
                break;
            case 2:
                System.out.println("Place holder... volviendo al menú principal\n\n");
                break;
            case 3:
                System.out.println("Ingrese la dirección del archivo de conductores.");
                String direccion = entrada.next();
                ArrayList<Driver> conductores = extraerConductores(direccion);
                subway.subwayAddDriver(conductores);
                System.out.println("¡Conductores cargados exitosamente!\n\n");
                break;
            case 4:
                System.out.println("Saliendo...");
                continuar = false;
                break;
            default:
                System.out.println("Opción no válida... volviendo al menú principal \n\n");
                break;
        }
    }

    public static ArrayList<Driver> extraerConductores(String direccion){
        try {
            File archivo = new File(direccion);
            Scanner lector = new Scanner(archivo);
            ArrayList<Driver> drivers = new ArrayList<>();
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                String[] partes = linea.split(", ");
                int id = Integer.parseInt(partes[0]);
                String nombre = partes[1];
                String fabricante = partes[2];
                Driver driver = new Driver(id, nombre, fabricante);
                drivers.add(driver);
            }
            lector.close();
            return drivers;
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            e.printStackTrace();
            return null;
        }
    }
}
