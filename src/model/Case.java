package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.io.*;

public class Case {
    public Container[] containers;
    public int caseNumber, papers, containerAmount, slidesPerCassette;
    public String patient, seriesAndYear;

    public Case(int caseNumber, int papers, int containerAmount, int slidesPerCassette, String patient, String seriesAndYear){
        this.caseNumber = caseNumber;
        this.papers= papers;
        this.containerAmount = containerAmount;
        this.slidesPerCassette = slidesPerCassette;
        this.patient = patient;
        this.seriesAndYear = seriesAndYear;

        //will contain container objects each of which have an array of casette objects each of which have an array of slide objects
        containers = new Container[containerAmount];
    }

    public String toString(){
        return seriesAndYear + " " + caseNumber + " " + papers + " " + containerAmount + " " + slidesPerCassette + " " + patient;
    }
}
