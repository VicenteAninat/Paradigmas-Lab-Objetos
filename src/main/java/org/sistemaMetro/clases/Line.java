package org.sistemaMetro.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.sistemaMetro.Interfaces.ILine;

public class Line implements ILine{
    private int id;
    private String name;
    private String railType;
    private ArrayList<Section> sections;

    // Constructor
    public Line(int id, String name, String railType, ArrayList<Section> sections) {
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
    public ArrayList<Section> getSections() {
        return sections;
    }

    // Métodos
    @Override
    public int lineLength() {
        int length = 0;
        for (Section section : sections) {
            length += section.getDistance();
        }
        return length;
    }

    @Override
    public int lineSectionLength(String station1Name, String station2Name) {
        int length = 0;
        int index1 = 0;
        int index2 = 0;
        for (Section section : sections) {
            if (section.getPoint1().getName().equals(station1Name)) {
                index1 = sections.indexOf(section);
                break;
            }
        }
        for (Section section : sections) {
            if (section.getPoint2().getName().equals(station2Name)){
                index2 = sections.indexOf(section);
                break;
            }
        }
        List<Section> listaCortada = sections.subList(index1, index2);
        for (Section section : listaCortada) {
            length += section.getDistance();
        }
        return length;
    }

    @Override
    public int lineCost() {
        int cost = 0;
        for (Section section : sections) {
            cost += section.getCost();
        }
        return cost;
    }

    @Override
    public int lineSectionCost(String station1Name, String station2Name) {
        int cost = 0;
        int index1 = 0;
        int index2 = 0;
        for (Section section : sections) {
            if (section.getPoint1().getName().equals(station1Name)) {
                index1 = sections.indexOf(section);
                break;
            }
        }
        for (Section section : sections) {
            if (section.getPoint2().getName().equals(station2Name)){
                index2 = sections.indexOf(section);
                break;
            }
        }
        List<Section> listaCortada = (this.sections.subList(index1, index2));
        for (Section section : listaCortada) {
            cost += section.getCost();
        }
        return cost;
    }

    @Override
    public void lineAddSection(Section section) {
        sections.add(section);
    }

    @Override
    public boolean comprobarLineaRegular(Line line){
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

    @Override
    public boolean comprobarLineaCircular(Line line){
        Station estacionInicial = line.sections.get(0).getPoint1();
        Station estacionFinal = line.sections.get(line.sections.size()-1).getPoint2();

        return estacionInicial.equals(estacionFinal);
    }

    @Override
    public boolean verificarLlegadaRegular(Line line){
        boolean comprobador = true;
        ArrayList<Station> estaciones = new ArrayList<Station>();
        estaciones.add(line.sections.get(0).getPoint1());
        estaciones.add(line.sections.get(0).getPoint2());
        for (Section section : line.sections) {
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

    @Override
    public boolean verificarLlegadaCircular(Line line){
        boolean comprobador = true;
        ArrayList<Station> estaciones = new ArrayList<Station>();
        estaciones.add(line.sections.get(0).getPoint1());
        estaciones.add(line.sections.get(0).getPoint2());
        for (Section section : line.sections) {
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

    @Override
    public boolean isLine (Line line) {
        if (comprobarLineaRegular(line)){
            return verificarLlegadaRegular(line);
        } else if (comprobarLineaCircular(line)){
            return verificarLlegadaCircular(line);
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        String sectionDetails = sections.stream().map(Section::toString).collect(Collectors.joining(", "));
        return "Datos de la línea\n" +
                "id = " + id + "\n" +
                "nombre = " + name + "\n" +
                "tipo de riel = " + railType + "\n" +
                "Secciones\n" +
                sectionDetails + "\n" +
                "Estaciones\n" +
                sections.stream().map(Section::getPoint1).map(Station::getName).collect(Collectors.joining("\n")) + "\n" +
                sections.get(sections.size()-1).getPoint2().getName() + "\n";
    }
}
