package controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.Case;

public class CaseController{

    @FXML
    private Spinner containerSpinner;
    @FXML
    private Spinner paperSpinner;
    @FXML
    private Spinner slidesPerCassetteSpinner;
    @FXML
    private TextField patientsInitialsTextField;

    @FXML
    private Button nextCaseButton;
    @FXML
    private Button finishedButton;

    @FXML
    private Label caseLabel;

    @FXML
    void initialize(){
        updateCaseLabel();
        initializeSpinners();
    }

    void updateCaseLabel(){
        if(Case.caseNumber < 10) {
            caseLabel.setText(Case.seriesAndYear + "-000" +Case.caseNumber);
        }else if(Case.caseNumber < 100) {
            caseLabel.setText(Case.seriesAndYear + "-00" +Case.caseNumber);
        }else if(Case.caseNumber < 1000) {
            caseLabel.setText(Case.seriesAndYear + "-0" +Case.caseNumber);
        }else{
            caseLabel.setText(Case.seriesAndYear + "-" +Case.caseNumber);
        }
    }

    void initializeSpinners(){
        SpinnerValueFactory<Integer> cassettesValueFactory = new SpinnerValueFactory<Integer>() {
            @Override
            public void decrement(int steps) {

            }

            @Override
            public void increment(int steps) {

            }
        };
    }
}

