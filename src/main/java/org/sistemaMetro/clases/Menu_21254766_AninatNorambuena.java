package org.sistemaMetro.clases;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Menu_21254766_AninatNorambuena {

    /**
     * Menu principal
     *
     * @param subway (Subway_21254766_AninatNorambuena) red de metro.
     */
    public static void run(Subway_21254766_AninatNorambuena subway){
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        while(continuar) {
            System.out.println("Bienvenido!");
            System.out.println("Por favor ingrese el numero de una opcion:\n\n" +
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
                    System.out.println("Opcion no válida... volviendo al menu principal \n");
                    break;
            }
        }
    }

    /**
     * Menu de metodos operables sobre la red de metro
     * @param subway (Subway_21254766_AninatNorambuena) red de metro.
     */
    public static void menuMetodos(Subway_21254766_AninatNorambuena subway) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Por favor ingrese el numero de una opcion:\n\n" +
                "1.- lineLength: obtener el largo total de una linea.\n" +
                "2.- lineSectionLength: determinar el tracto entre una estacion origen y final.\n" +
                "3.- lineCost: determinar el costo total de recorrer una linea.\n" +
                "4.- lineSectionCost: determinar el costo de un trayecto entre estacion origen y final.\n" +
                "5.- isLine: verificar si una linea cumple con las restricciones especificadas.\n" +
                "6.- addCar: añade un carro de pasajeros a un tren en la posicion establecida.\n" +
                "7.- removeCar: remueve un carro de pasajeros de un tren en la posicion establecida.\n" +
                "8.- isTrain: verifica si un tren cumple con las especificaciones de los carros de pasajeros.\n" +
                "9.- fetchCapacity: entrega la capacidad maxima de pasajeros de un tren.\n" +
                "10.- whereIsTrain: determina la ubicacion de un tren a partir de una hora indicada del dia.\n" +
                "11.- trainPath: armar el recorrido del tren a partir de una hora especificada y que retorna la lista de estaciones futuras por recorrer.\n" +
                "12.- toString: permite visualizar la red de metro.\n" +
                "13.- Volver");

        int seleccion = entrada.nextInt();
        switch (seleccion) {
            case 1:
                System.out.println("Ingrese el id de la linea.");
                seleccion = entrada.nextInt();
                boolean exito = false;
                for (Line_21254766_AninatNorambuena linea : subway.getLines()) {
                    if (linea.getId() == seleccion) {
                        System.out.println("El largo de la linea es: " + linea.lineLength() + "\n");
                        exito = true;
                        break;
                    }
                }
                if (!exito) {
                    System.out.println("Linea no encontrada... volviendo al menu anterior\n");
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

                for (Line_21254766_AninatNorambuena linea : subway.getLines()) {
                    if (linea.getId() == seleccion) {
                        System.out.println("El largo de la linea es: " + linea.lineSectionLength(estacion1, estacion2) + "\n");
                        break;
                    }
                }
                break;

            case 3:
                System.out.println("Ingrese el id de la linea.");
                seleccion = entrada.nextInt();
                boolean exito2 = false;
                for (Line_21254766_AninatNorambuena linea : subway.getLines()) {
                    if (linea.getId() == seleccion) {
                        System.out.println("El costo de la linea es: " + linea.lineCost() + "\n");
                        exito2 = true;
                        break;
                    }
                }
                if (!exito2) {
                    System.out.println("Linea no encontrada... volviendo al menu anterior\n");
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

                for (Line_21254766_AninatNorambuena linea : subway.getLines()) {
                    if (linea.getId() == seleccion) {
                        System.out.println("El costo de la linea es: " + linea.lineSectionCost(estacionUno, estacionDos) + "\n");
                        break;
                    }
                }
                break;

            case 5:
                System.out.println("Ingrese el id de la linea.");
                seleccion = entrada.nextInt();
                boolean exito3 = false;
                for (Line_21254766_AninatNorambuena linea : subway.getLines()) {
                    if (linea.getId() == seleccion) {
                        exito3 = true;
                        if (linea.isLine(linea)) {
                            System.out.println("La linea es valida!\n");
                        } else {
                            System.out.println("La linea es invalida...\n");
                        break;
                        }
                    }
                }
                if (!exito3) {
                    System.out.println("Linea no encontrada... volviendo al menu anterior\n");
                }
                break;

            case 6:
                System.out.println("Ingrese el id del tren.");
                seleccion = entrada.nextInt();
                System.out.println("Ingrese el id del carro.");
                int idCarro = entrada.nextInt();
                System.out.println("Ingrese la capacidad de pasajeros del carro.");
                int capacidad = entrada.nextInt();
                System.out.println("Ingrese el modelo del carro.");
                String modelo = entrada.next();
                System.out.println("Ingrese el fabricante del carro.");
                String fabricante = entrada.next();
                System.out.println("Ingrese el tipo de carro.");
                String tipo = entrada.next();

                PassengerCar_21254766_AninatNorambuena carro = new PassengerCar_21254766_AninatNorambuena(idCarro, capacidad, modelo, fabricante, tipo);

                System.out.println("Ingrese la posicion en la que se añadira el carro.");
                int posicion = entrada.nextInt();

                for (Train_21254766_AninatNorambuena tren : subway.getTrains()) {
                    if (tren.getId() == seleccion) {
                        tren.addCar(carro, posicion);
                        System.out.println("Carro añadido exitosamente!\n");
                        break;
                    }
                }
                break;

            case 7:
                System.out.println("Ingrese el id del tren");
                seleccion = entrada.nextInt();
                System.out.println("Ingrese la posicion del carro que desea remover.\n");
                int posicionCarro = entrada.nextInt();
                for (Train_21254766_AninatNorambuena tren : subway.getTrains()) {
                    if (tren.getId() == seleccion) {
                        tren.removeCar(tren, posicionCarro);
                        System.out.println("Carro removido exitosamente!\n");
                        break;
                    }
                }
                break;

            case 8:
                System.out.println("Ingrese el id del tren.");
                seleccion = entrada.nextInt();
                for (Train_21254766_AninatNorambuena tren : subway.getTrains()) {
                    if (tren.getId() == seleccion) {
                        if (tren.isTrain(tren)) {
                            System.out.println("El tren es valido!\n");
                        } else {
                            System.out.println("El tren es invalido...\n");
                        }
                        break;
                    }
                }
                break;
            case 9:
                System.out.println("Ingrese el id del tren.");
                seleccion = entrada.nextInt();
                for (Train_21254766_AninatNorambuena tren : subway.getTrains()) {
                    if (tren.getId() == seleccion) {
                        System.out.println("La capacidad maxima de pasajeros del tren es: " + tren.fetchCapacity() + "\n");
                        break;
                    }
                }
                break;
            case 10:
                System.out.println("Metodo por implementar... volviendo al menu principal\n");
                break;
            case 11:
                System.out.println("Metodo por implementar... volviendo al menu principal\n");
                break;
            case 12:
                System.out.println(subway.toString());
                break;
            case 13:
                System.out.println("Volviendo...");
                break;
            default:
                System.out.println("Opcion no válida... volviendo al menu principal \n\n");
                break;
        }
    }

    /**
     * Submenu de carga de datos
     * @param subway (Subway_21254766_AninatNorambuena) red de metro.
     */
    public static void menuDatos(Subway_21254766_AninatNorambuena subway) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Por favor ingrese el numero de una opcion:\n\n" +
                "1.- Cargar lineas\n2.- Cargar Trenes\n3.- Cargar Conductores\n4.- Volver");

        int seleccion = entrada.nextInt();
        switch (seleccion) {
            case 1:
                System.out.println("Ingrese la direccion del archivo de lineas.");
                String direccion = entrada.next();
                ArrayList<Line_21254766_AninatNorambuena> lineas = extraerLineas(direccion);
                subway.subwayAddLine(lineas);
                System.out.println("Lineas cargadas exitosamente!\n");
                break;
            case 2:
                System.out.println("Ingrese la direccion del archivo de trenes.");
                String direccion2 = entrada.next();
                ArrayList<Train_21254766_AninatNorambuena> trenes = extraerTrenes(direccion2);
                subway.subwayAddTrain(trenes);
                System.out.println("Trenes cargados exitosamente!\n");
                break;
            case 3:
                System.out.println("Ingrese la direccion del archivo de conductores.");
                String direccion3 = entrada.next();
                ArrayList<Driver_21254766_AninatNorambuena> conductores = extraerConductores(direccion3);
                subway.subwayAddDriver(conductores);
                System.out.println("Conductores cargados exitosamente!\n");
                break;
            case 4:
                System.out.println("Saliendo...");
                continuar = false;
                break;
            default:
                System.out.println("Opcion no válida... volviendo al menu principal \n\n");
                break;
        }
    }

    /**
     * Extrae los conductores desde un archivo
     *
     * @param direccion (String) direccion del archivo.
     * @return (list.Driver_21254766_AninatNorambuena) lista de conductores.
     */
    public static ArrayList<Driver_21254766_AninatNorambuena> extraerConductores(String direccion){
        try {
            File archivo = new File(direccion);
            Scanner lector = new Scanner(archivo);
            ArrayList<Driver_21254766_AninatNorambuena> drivers = new ArrayList<>();
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                String[] partes = linea.split(", ");
                int id = Integer.parseInt(partes[0]);
                String nombre = partes[1];
                String fabricante = partes[2];
                Driver_21254766_AninatNorambuena driver = new Driver_21254766_AninatNorambuena(id, nombre, fabricante);
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

    /**
     * Extrae las lineas desde un archivo
     *
     * @param direccion (String) direccion del archivo.
     * @return (list.Line_21254766_AninatNorambuena) lista de lineas.
     */
    public static ArrayList<Line_21254766_AninatNorambuena> extraerLineas(String direccion){
        try {
                File archivo = new File(direccion);
            Scanner lector = new Scanner(archivo);
            ArrayList<Station_21254766_AninatNorambuena> estaciones = new ArrayList<>();
            ArrayList<Section_21254766_AninatNorambuena> secciones = new ArrayList<>();
            ArrayList<Line_21254766_AninatNorambuena> lineas = new ArrayList<>();

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
                            Station_21254766_AninatNorambuena estacion = new Station_21254766_AninatNorambuena(idEstacion, nombre, tipo, tiempoDetencion);
                            estaciones.add(estacion);
                            System.out.println("id =" + estacion.getId() + ", nombre = " + estacion.getName() + ", tipo = " + estacion.getType() + ", tiempo de detencion = " + estacion.getStopTime());
                            break;
                        case "secciones":
                            Station_21254766_AninatNorambuena estacion1 = estaciones.get(Integer.parseInt(partes[0]) - 1);
                            Station_21254766_AninatNorambuena estacion2 = estaciones.get(Integer.parseInt(partes[1]) - 1);
                            int distancia = Integer.parseInt(partes[2]);
                            int coste = Integer.parseInt(partes[3]);
                            Section_21254766_AninatNorambuena seccion = new Section_21254766_AninatNorambuena(estacion1, estacion2, distancia, coste);
                            secciones.add(seccion);
                            System.out.println("Estacion 1 = " + seccion.getPoint1().getName() + ", Estacion 2 = " + seccion.getPoint2().getName() + ", distancia = " + seccion.getDistance() + ", coste = " + seccion.getCost());
                            break;
                        case "lineas":
                            int idLinea = Integer.parseInt(partes[0]);
                            String nombreLinea = partes[1];
                            String tipoRail = partes[2];
                            Line_21254766_AninatNorambuena lineaMetro = new Line_21254766_AninatNorambuena(idLinea, nombreLinea, tipoRail, secciones);
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

    /**
     * Extrae los trenes desde un archivo
     *
     * @param direccion (String) direccion del archivo.
     * @return (list.Train_21254766_AninatNorambuena) lista de trenes.
     */
    public static ArrayList<Train_21254766_AninatNorambuena> extraerTrenes(String direccion){
        try {
            File archivo = new File(direccion);
            Scanner lector = new Scanner(archivo);
            ArrayList<PassengerCar_21254766_AninatNorambuena> carros = new ArrayList<>();
            ArrayList<Train_21254766_AninatNorambuena> trenes = new ArrayList<>();
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
                            PassengerCar_21254766_AninatNorambuena carro = new PassengerCar_21254766_AninatNorambuena(idCarro, capacidad, modelo, fabricante, tipo);
                            System.out.println("id = " + carro.getId() + ", capacidad = " + carro.getPassengerCapacity() + ", modelo = " + carro.getModel() + ", fabricante = " + carro.getTrainMaker() + ", tipo = " + carro.getCarType());
                            carros.add(carro);
                            break;
                        case "trenes":
                            int idTren = Integer.parseInt(partes[0]);
                            String fabricante2 = partes[1];
                            int velocidad = Integer.parseInt(partes[2]);
                            int tiempoEstancia = Integer.parseInt(partes[3]);

                            Train_21254766_AninatNorambuena tren = new Train_21254766_AninatNorambuena(idTren, fabricante2, velocidad, tiempoEstancia, carros);
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
