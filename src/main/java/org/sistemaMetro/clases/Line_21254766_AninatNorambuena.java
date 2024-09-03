package org.sistemaMetro.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.sistemaMetro.Interfaces.ILine_21254766_AninatNorambuena;

public class Line_21254766_AninatNorambuena implements ILine_21254766_AninatNorambuena {
    private final int id;
    private final String name;
    private final String railType;
    private ArrayList<Section_21254766_AninatNorambuena> sections;

    // Constructor
    /**
     * Constructor
     *
     * @param id (int) id de la línea.
     * @param name (String) Nombre de la línea.
     * @param railType (String) Tipo de riel de la línea.
     * @param sections (list.Section_21254766_AninatNorambuena) Secciones de la línea.
     */
    public Line_21254766_AninatNorambuena(int id, String name, String railType, ArrayList<Section_21254766_AninatNorambuena> sections) {
        this.id = id;
        this.name = name;
        this.railType = railType;
        this.sections = sections;
    }

    // Selectores
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRailType() {
        return railType;
    }

    @Override
    public ArrayList<Section_21254766_AninatNorambuena> getSections() {
        return sections;
    }

    // Métodos
    /**
     * Calcula la longitud de la línea
     *
     * @return (int)
     */
    @Override
    public int lineLength() {
        int length = 0;
        for (Section_21254766_AninatNorambuena section : sections) {
            length += section.getDistance();
        }
        return length;
    }

    /**
     * Calcula la longitud de una sección de la línea
     *
     * @param station1Name (String) Nombre de la estación 1.
     * @param station2Name (String) Nombre de la estación 2.
     * @return (int)
     */
    @Override
    public int lineSectionLength(String station1Name, String station2Name) {
        int length = 0;
        int index1 = 0;
        int index2 = 0;
        for (Section_21254766_AninatNorambuena section : sections) {
            if (section.getPoint1().getName().equals(station1Name)) {
                index1 = sections.indexOf(section);
                break;
            }
        }
        for (Section_21254766_AninatNorambuena section : sections) {
            if (section.getPoint2().getName().equals(station2Name)){
                index2 = sections.indexOf(section);
                break;
            }
        }
        List<Section_21254766_AninatNorambuena> listaCortada = sections.subList(index1, index2);
        for (Section_21254766_AninatNorambuena section : listaCortada) {
            length += section.getDistance();
        }
        return length;
    }

    /**
     * Calcula el costo de la línea
     *
     * @return (int)
     */
    @Override
    public int lineCost() {
        int cost = 0;
        for (Section_21254766_AninatNorambuena section : sections) {
            cost += section.getCost();
        }
        return cost;
    }

    /**
     * Calcula el costo de una sección de la línea
     *
     * @param station1Name (String) Nombre de la estación 1.
     * @param station2Name (String) Nombre de la estación 2.
     * @return (int)
     */
    @Override
    public int lineSectionCost(String station1Name, String station2Name) {
        int cost = 0;
        int index1 = 0;
        int index2 = 0;
        for (Section_21254766_AninatNorambuena section : sections) {
            if (section.getPoint1().getName().equals(station1Name)) {
                index1 = sections.indexOf(section);
                break;
            }
        }
        for (Section_21254766_AninatNorambuena section : sections) {
            if (section.getPoint2().getName().equals(station2Name)){
                index2 = sections.indexOf(section);
                break;
            }
        }
        List<Section_21254766_AninatNorambuena> listaCortada = (this.sections.subList(index1, index2));
        for (Section_21254766_AninatNorambuena section : listaCortada) {
            cost += section.getCost();
        }
        return cost;
    }

    /**
     * Agrega una sección a la línea
     *
     * @param section (Section_21254766_AninatNorambuena) Sección a agregar.
     */
    @Override
    public void lineAddSection(Section_21254766_AninatNorambuena section) {
        sections.add(section);
    }

    /**
     * Comprueba si la línea es valida
     *
     * @param line (Line_21254766_AninatNorambuena) Línea a comprobar.
     * @return (boolean)
     */
    @Override
    public boolean comprobarLineaRegular(Line_21254766_AninatNorambuena line){
        String typeInicial = line.sections.get(0).getPoint1().getType();
        String typeFinal =
                line.sections.get(line.sections.size()-1).getPoint2().getType();
        return  // Caso 1: Inicial y final son terminales
                (typeInicial.equals(typeFinal) &&
                typeInicial.equals("t")) ||
                // Caso 2: Inicial es combinacion y final es terminal
                (typeInicial.equals("c") &&
                        (typeFinal).equals("t")) ||
                // Caso 3: Inicial es terminal y final es combinacion
                (typeInicial.equals("t") &&
                        (typeFinal).equals("c")) ||
                // Caso 4: Inicial y final son combinacion
                (typeInicial.equals(typeFinal) &&
                        typeInicial.equals("c"));
    }

    /**
     * Comprueba si la línea es circular
     *
     * @param line (Line_21254766_AninatNorambuena) Línea a comprobar.
     * @return (boolean)
     */
    @Override
    public boolean comprobarLineaCircular(Line_21254766_AninatNorambuena line){
        Station_21254766_AninatNorambuena estacionInicial = line.sections.get(0).getPoint1();
        Station_21254766_AninatNorambuena estacionFinal = line.sections.get(line.sections.size()-1).getPoint2();

        return estacionInicial.equals(estacionFinal);
    }

    /**
     * Verifica si la llegada de la línea es regular
     *
     * @param line (Line_21254766_AninatNorambuena) Línea a verificar.
     * @return (boolean)
     */
    @Override
    public boolean verificarLlegadaRegular(Line_21254766_AninatNorambuena line){
        boolean comprobador = true;
        ArrayList<Station_21254766_AninatNorambuena> estaciones = new ArrayList<Station_21254766_AninatNorambuena>();
        estaciones.add(line.sections.get(0).getPoint1());
        estaciones.add(line.sections.get(0).getPoint2());
        for (Section_21254766_AninatNorambuena section : line.sections) {
            if (section.getPoint1().equals(estaciones.get(estaciones.size()-1))) {
                estaciones.add(section.getPoint2());
            } else if (estaciones.contains(section.getPoint1())){
                estaciones.add(section.getPoint2());
            } else {
                comprobador = false;
                break;
            }
        }
        return comprobador;
    }

    /**
     * Verifica si la llegada de la línea es circular
     *
     * @param line (Line_21254766_AninatNorambuena) Línea a verificar.
     * @return (boolean)
     */
    @Override
    public boolean verificarLlegadaCircular(Line_21254766_AninatNorambuena line){
        boolean comprobador = true;
        ArrayList<Station_21254766_AninatNorambuena> estaciones = new ArrayList<Station_21254766_AninatNorambuena>();
        estaciones.add(line.sections.get(0).getPoint1());
        estaciones.add(line.sections.get(0).getPoint2());
        for (Section_21254766_AninatNorambuena section : line.sections) {
            if (section.getPoint1().equals(estaciones.get(estaciones.size()-1))) {
                estaciones.add(section.getPoint2());
            } else if (estaciones.get(estaciones.size()-1).getType().equals("m")){
                estaciones.add(section.getPoint2());
            } else {
                comprobador = false;
                break;
            }
        }
        return comprobador;
    }

    /**
     * Verifica si una línea es válida
     *
     * @param line (Line_21254766_AninatNorambuena) Línea a verificar.
     * @return (boolean)
     */
    @Override
    public boolean isLine (Line_21254766_AninatNorambuena line) {
        if (comprobarLineaRegular(line)){
            return verificarLlegadaRegular(line);
        } else if (comprobarLineaCircular(line)){
            return verificarLlegadaCircular(line);
        } else {
            return false;
        }
    }

    /**
     * Describe la línea en formato texto
     *
     * @return (String)
     */
    @Override
    public String toString(){
        String sectionDetails = sections.stream().map(Section_21254766_AninatNorambuena::toString).collect(Collectors.joining(", "));
        return "Datos de la línea\n" +
                "id = " + id + "\n" +
                "nombre = " + name + "\n" +
                "tipo de riel = " + railType + "\n" +
                "Secciones\n" +
                sectionDetails + "\n" +
                "Estaciones\n" +
                sections.stream().map(Section_21254766_AninatNorambuena::getPoint1).map(Station_21254766_AninatNorambuena::getName).collect(Collectors.joining("\n")) + "\n" +
                sections.get(sections.size()-1).getPoint2().getName() + "\n";
    }
}
