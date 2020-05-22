package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Case {
    public static String seriesAndYear;
    public static int caseNumber;
    Container[] containers;
    IntegerProperty papers, containerAmount;

    public Case(int papers, int containerAmount){
        this.papers= new SimpleIntegerProperty(papers);
        this.containerAmount = new SimpleIntegerProperty(containerAmount);
        containers = new Container[containerAmount];
    }
}
