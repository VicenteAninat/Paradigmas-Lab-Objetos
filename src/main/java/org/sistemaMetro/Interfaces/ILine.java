package org.sistemaMetro.Interfaces;
import org.sistemaMetro.clases.Line;
import org.sistemaMetro.clases.Section;

public interface ILine {
    int lineLength(Line line);
    int lineSectionLength(Line line, String station1Name, String station2Name);
    int lineCost(Line line);
    int lineSectionCost(Line line, String station1Name, String station2Name);
    void lineAddSection(Line line, Section section);
    boolean isLine(Line line);
}
