package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.io.*;

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

    static public int getCaseNumber(String seriesAndYear) throws IOException {
        int value = 0;
        String currentCase;
        BufferedReader bufferedReader = new BufferedReader(new FileReader("currentCaseNumbers.txt"));
        while ((currentCase = bufferedReader.readLine())!=null) {
            if(currentCase.startsWith(seriesAndYear)){
                bufferedReader.close();
                return Integer.parseInt(currentCase.substring(5,currentCase.length()));
            }
        }
        bufferedReader.close();
        return value;
    }
}
