package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import model.CaseList;

public class CassettesController {
    @FXML
    private Label caseLabel;

    @FXML
    void initialize(){
        updateCaseLabel();
    }

    void updateCaseLabel(){
        if(CaseList.caseNumber < 10) {
            caseLabel.setText(CaseList.seriesAndYear + "-000" +CaseList.caseNumber);
        }else if(CaseList.caseNumber < 100) {
            caseLabel.setText(CaseList.seriesAndYear + "-00" +CaseList.caseNumber);
        }else if(CaseList.caseNumber < 1000) {
            caseLabel.setText(CaseList.seriesAndYear + "-0" +CaseList.caseNumber);
        }else{
            caseLabel.setText(CaseList.seriesAndYear + "-" +CaseList.caseNumber);
        }
    }
}