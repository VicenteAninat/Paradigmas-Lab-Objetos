package org.sistemaMetro.clases;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Menu {

    public static void run(Subway subway){
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
                    menuMetodos(subway);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida... volviendo al menú principal \n");
                    break;
            }
        }
    }

    public static void menuMetodos(Subway subway) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Por favor ingrese el numero de una opción:\n\n" +
                "1.- lineLength: obtener el largo total de una línea.\n" +
                "2.- lineSectionLength: determinar el tracto entre una estación origen y final.\n" +
                "3.- lineCost: determinar el costo total de recorrer una línea.\n" +
                "4.- lineSectionCost: determinar el costo de un trayecto entre estación origen y final.\n" +
                "5.- isLine: verificar si una línea cumple con las restricciones especificadas.\n" +
                "6.- addCar: añade un carro de pasajeros a un tren en la posición establecida.\n" +
                "7.- removeCar: remueve un carro de pasajeros de un tren en la posición establecida.\n" +
                "8.- isTrain: verifica si un tren cumple con las especificaciones de los carros de pasajeros.\n" +
                "9.- fetchCapacity: entrega la capacidad máxima de pasajeros de un tren.\n" +
                "10.- whereIsTrain: determina la ubicación de un tren a partir de una hora indicada del día.\n" +
                "11.- trainPath: armar el recorrido del tren a partir de una hora especificada y que retorna la lista de estaciones futuras por recorrer.\n" +
                "12.- toString: permite visualizar la red de metro.\n" +
                "13.- Volver");

        int seleccion = entrada.nextInt();
        switch (seleccion) {
            case 1:
                System.out.println("Ingrese el id de la linea.");
                seleccion = entrada.nextInt();
                boolean exito = false;
                for (Line linea : subway.getLines()) {
                    if (linea.getId() == seleccion) {
                        System.out.println("El largo de la linea es: " + linea.lineLength() + "\n");
                        exito = true;
                        break;
                    }
                }
                if (!exito) {
                    System.out.println("Linea no encontrada... volviendo al menú anterior\n");
                }
                break;

            case 2:
                System.out.println("Ingrese el id de la linea.");
                seleccion = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Ingrese el nombre de la estacion de partida.");
                String estacion1 = entrada.nextLine();
                System.out.println("Ingrese el nombre de la estacion de llegada.");
                String estacion2 = entrada.nextLine();

                for (Line linea : subway.getLines()) {
                    if (linea.getId() == seleccion) {
                        System.out.println("El largo de la linea es: " + linea.lineSectionLength(estacion1, estacion2) + "\n");
                        break;
                    }
                }
                break;

            case 3:
                System.out.println("Ingrese el id de la linea.\n");
                seleccion = entrada.nextInt();
                boolean exito2 = false;
                for (Line linea : subway.getLines()) {
                    if (linea.getId() == seleccion) {
                        System.out.println("El costo de la linea es: " + linea.lineCost() + "\n");
                        exito2 = true;
                        break;
                    }
                }
                if (!exito2) {
                    System.out.println("Linea no encontrada... volviendo al menú anterior\n");
                }
                break;

            case 4:
                System.out.println("Ingrese el id de la linea.");
                seleccion = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Ingrese el nombre de la estacion de partida.");
                String estacionUno = entrada.nextLine();
                System.out.println("Ingrese el nombre de la estacion de llegada.");
                String estacionDos = entrada.nextLine();

                for (Line linea : subway.getLines()) {
                    if (linea.getId() == seleccion) {
                        System.out.println("El costo de la linea es: " + linea.lineSectionCost(estacionUno, estacionDos) + "\n");
                        break;
                    }
                }
                break;

            case 5:
                System.out.println("Ingrese el id de la linea.\n");
                seleccion = entrada.nextInt();
                boolean exito3 = false;
                for (Line linea : subway.getLines()) {
                    if (linea.getId() == seleccion) {
                        exito3 = true;
                        if (linea.isLine(linea)) {
                            System.out.println("¡La linea es valida!\n");
                        } else {
                            System.out.println("La linea es invalida...\n");
                        break;
                        }
                    }
                }
                if (!exito3) {
                    System.out.println("Linea no encontrada... volviendo al menú anterior\n");
                }
                break;

            case 6:
                System.out.println("Ingrese el id del tren.\n");
                seleccion = entrada.nextInt();
                System.out.println("Ingrese el id del carro.\n");
                int idCarro = entrada.nextInt();
                System.out.println("Ingrese la posicion en la que se añadirá el carro.\n");
                int posicion = entrada.nextInt();
                for (Train tren : subway.getTrains()) {
                    if (tren.getId() == seleccion) {
                        for (PassengerCar carro : tren.getCarList()) {
                            if (carro.getId() == idCarro) {
                                tren.addCar(carro, posicion);
                                System.out.println("¡Carro añadido exitosamente!\n");
                                break;
                            }
                        }
                    }
                }
                break;

            case 7:
                System.out.println("Ingrese el id del tren\n");
                seleccion = entrada.nextInt();
                System.out.println("Ingrese la posición del carro que desea remover.\n");
                int posicionCarro = entrada.nextInt();
                for (Train tren : subway.getTrains()) {
                    if (tren.getId() == seleccion) {
                        tren.removeCar(tren, posicionCarro);
                        System.out.println("¡Carro removido exitosamente!\n");
                        break;
                    }
                }
                break;

            case 8:
                System.out.println("Ingrese el id del tren.\n");
                seleccion = entrada.nextInt();
                for (Train tren : subway.getTrains()) {
                    if (tren.getId() == seleccion) {
                        if (tren.isTrain(tren)) {
                            System.out.println("¡El tren es valido!\n");
                        } else {
                            System.out.println("El tren es invalido...\n");
                        }
                        break;
                    }
                }
                break;
            case 9:
                System.out.println("Ingrese el id del tren.\n");
                seleccion = entrada.nextInt();
                for (Train tren : subway.getTrains()) {
                    if (tren.getId() == seleccion) {
                        System.out.println("La capacidad máxima de pasajeros del tren es: " + tren.fetchCapacity() + "\n");
                        break;
                    }
                }
                break;
            case 10:
                System.out.println("Método por implementar... volviendo al menú principal\n");
                break;
            case 11:
                System.out.println("Método por implementar... volviendo al menú principal\n");
                break;
            case 12:
                System.out.println(subway.toString());
                break;
            case 13:
                System.out.println("Volviendo...");
                break;
            default:
                System.out.println("Opción no válida... volviendo al menú principal \n\n");
                break;
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
                String direccion = entrada.next();
                ArrayList<Line> lineas = extraerLineas(direccion);
                subway.subwayAddLine(lineas);
                System.out.println("¡Lineas cargadas exitosamente!\n");
                break;
            case 2:
                System.out.println("Ingrese la dirección del archivo de trenes.");
                String direccion2 = entrada.next();
                ArrayList<Train> trenes = extraerTrenes(direccion2);
                subway.subwayAddTrain(trenes);
                System.out.println("¡Trenes cargados exitosamente!\n");
                break;
            case 3:
                System.out.println("Ingrese la dirección del archivo de conductores.");
                String direccion3 = entrada.next();
                ArrayList<Driver> conductores = extraerConductores(direccion3);
                subway.subwayAddDriver(conductores);
                System.out.println("¡Conductores cargados exitosamente!\n");
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
                System.out.println("id = " + driver.getId() + ", nombre = " + driver.getName() + ", fabricante = " + driver.getTrainMaker());
            }
            lector.close();
            return drivers;
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Line> extraerLineas(String direccion){
        try {
                File archivo = new File(direccion);
            Scanner lector = new Scanner(archivo);
            ArrayList<Station> estaciones = new ArrayList<>();
            ArrayList<Section> secciones = new ArrayList<>();
            ArrayList<Line> lineas = new ArrayList<>();

            String estado = "estaciones";

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();

                if (linea.equals("-")) {
                    if (estado.equals("estaciones")) {
                        estado = "secciones";
                        System.out.println("\n");
                    } else if (estado.equals("secciones")) {
                        estado = "lineas";
                        System.out.println("\n");
                    }
                } else {
                    String[] partes = linea.split(", ");

                    switch (estado) {
                        case "estaciones":
                            int idEstacion = Integer.parseInt(partes[0]);
                            String nombre = partes[1];
                            String tipo = partes[2];
                            int tiempoDetencion = Integer.parseInt(partes[3]);
                            Station estacion = new Station(idEstacion, nombre, tipo, tiempoDetencion);
                            estaciones.add(estacion);
                            System.out.println("id =" + estacion.getId() + ", nombre = " + estacion.getName() + ", tipo = " + estacion.getType() + ", tiempo de detencion = " + estacion.getStopTime());
                            break;
                        case "secciones":
                            Station estacion1 = estaciones.get(Integer.parseInt(partes[0]) - 1);
                            Station estacion2 = estaciones.get(Integer.parseInt(partes[1]) - 1);
                            int distancia = Integer.parseInt(partes[2]);
                            int coste = Integer.parseInt(partes[3]);
                            Section seccion = new Section(estacion1, estacion2, distancia, coste);
                            secciones.add(seccion);
                            System.out.println("Estacion 1 = " + seccion.getPoint1().getName() + ", Estacion 2 = " + seccion.getPoint2().getName() + ", distancia = " + seccion.getDistance() + ", coste = " + seccion.getCost());
                            break;
                        case "lineas":
                            int idLinea = Integer.parseInt(partes[0]);
                            String nombreLinea = partes[1];
                            String tipoRail = partes[2];
                            Line lineaMetro = new Line(idLinea, nombreLinea, tipoRail, secciones);
                            lineas.add(lineaMetro);
                            System.out.println("id = " + lineaMetro.getId() + ", nombre = " + lineaMetro.getName() + ", tipo = " + lineaMetro.getRailType() + ", secciones = " + lineaMetro.getSections().size());
                            break;
                    }
                }
            }

            lector.close();
            return lineas;
        } catch (FileNotFoundException e) {
        System.out.println("Archivo no encontrado.");
        e.printStackTrace();
        return null;
        }
    }

    public static ArrayList<Train> extraerTrenes(String direccion){
        try {
            File archivo = new File(direccion);
            Scanner lector = new Scanner(archivo);
            ArrayList<PassengerCar> carros = new ArrayList<>();
            ArrayList<Train> trenes = new ArrayList<>();
            String estado = "carros";
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                if (linea.equals("-")) {
                    if (estado.equals("carros")) {
                        estado = "trenes";
                        System.out.println("\n");
                    }
                } else {
                    String[] partes = linea.split(", ");

                    switch (estado) {
                        case "carros":
                            int idCarro = Integer.parseInt(partes[0]);
                            int capacidad = Integer.parseInt(partes[1]);
                            String modelo = partes[2];
                            String fabricante = partes[3];
                            String tipo = partes[4];
                            PassengerCar carro = new PassengerCar(idCarro, capacidad, modelo, fabricante, tipo);
                            System.out.println("id = " + carro.getId() + ", capacidad = " + carro.getPassengerCapacity() + ", modelo = " + carro.getModel() + ", fabricante = " + carro.getTrainMaker() + ", tipo = " + carro.getCarType());
                            carros.add(carro);
                            break;
                        case "trenes":
                            int idTren = Integer.parseInt(partes[0]);
                            String fabricante2 = partes[1];
                            int velocidad = Integer.parseInt(partes[2]);
                            String[] partesCarros = partes[3].split(";");
                            ArrayList<PassengerCar> listaCarros = new ArrayList<>();

                            for (int i = 0; i < partesCarros.length; i++) {
                                int id = Integer.parseInt(partesCarros[i]);
                                for (PassengerCar carroObj : carros) {
                                    if (carroObj.getId() == id) {
                                        listaCarros.add(carroObj);
                                    }
                                }
                            }
                            Train tren = new Train(idTren, fabricante2, velocidad, listaCarros);
                            trenes.add(tren);
                            System.out.println("id = " + tren.getId() + ", fabricante = " + tren.getTrainMaker() + ", velocidad = " + tren.getSpeed() + ", carros = " + tren.getCarList().size());
                            break;
                        }
                    }
                }
            lector.close();
            return trenes;
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            e.printStackTrace();
            return null;
        }
    }
}
