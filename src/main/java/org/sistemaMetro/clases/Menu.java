package org.sistemaMetro.clases;

import java.util.Scanner;

public class Menu {

    public static void run(){
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        while(continuar){
            System.out.println("¡Bienvenido!\n");
            System.out.println("Por favor ingrese el numero de una opción:\n\n" +
                    "1.- Cargar lineas\n2.- Cargar Trenes\n3.- Cargar Conductores\n4.- Salir");

            int seleccion = entrada.nextInt();
            switch (seleccion){
                case 1:
                    System.out.println("Place holder... volviendo al menú principal\n\n");
                    break;
                case 2:
                    System.out.println("Place holder... volviendo al menú principal\n\n");
                    break;
                case 3:
                    System.out.println("Place holder... volviendo al menú principal\n\n");
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
    }
}
