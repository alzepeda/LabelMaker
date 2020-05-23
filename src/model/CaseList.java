package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CaseList {
    public static String seriesAndYear;
    public static int caseNumber;

    public static ArrayList<Case> list = new ArrayList<>();

    static public int getInitialCaseNumber() throws IOException {
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
