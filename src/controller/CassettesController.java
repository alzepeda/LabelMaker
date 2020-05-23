package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.GridPane;
import model.Case;
import model.CaseList;

public class CassettesController {
    Spinner container1Spinner, container2Spinner, container3Spinner, container4Spinner, container5Spinner,
            container6Spinner, container7Spinner, container8Spinner, container9Spinner, container10Spinner;

    @FXML
    private Label caseLabel;

    @FXML
    private GridPane cassettesPerContainerGrid;

    @FXML
    void initialize(){
        updateCaseLabel();

        //determines range of text inputs
        Case currentCase = CaseList.list.get(CaseList.list.size()-1);
        int containerAmount = currentCase.containerAmount;
        int i = 0;
        while(i < containerAmount && currentCase.containers[i] != null){
            i++;
        }
        createTextInputs(i, containerAmount);
    }

    private void updateCaseLabel(){
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

    private void createTextInputs(int startIndex, int goal){
        if(startIndex < 10) {
            switch (goal) {
                default: ;
                case 10: cassettesPerContainerGrid.add(new Label("How many cassettes for container J?"), 0, 9);
                case 9: cassettesPerContainerGrid.add(new Label("How many cassettes for container I?"), 0, 8);
                case 8: cassettesPerContainerGrid.add(new Label("How many cassettes for container H?"), 0, 7);
                case 7: cassettesPerContainerGrid.add(new Label("How many cassettes for container G?"), 0, 6);
                case 6: cassettesPerContainerGrid.add(new Label("How many cassettes for container F?"), 0, 5);
                case 5: cassettesPerContainerGrid.add(new Label("How many cassettes for container E?"), 0, 4);
                case 4: cassettesPerContainerGrid.add(new Label("How many cassettes for container D?"), 0, 3);
                case 3: cassettesPerContainerGrid.add(new Label("How many cassettes for container C?"), 0, 2);
                case 2: cassettesPerContainerGrid.add(new Label("How many cassettes for container B?"), 0, 1);
                case 1: cassettesPerContainerGrid.add(new Label("How many cassettes for container A?"), 0, 0);
            }
        }else if(startIndex < 20){
            switch (goal) {
                default: ;
                case 20: cassettesPerContainerGrid.add(new Label("How many cassettes for container T?"), 0, 9);
                case 19: cassettesPerContainerGrid.add(new Label("How many cassettes for container S?"), 0, 8);
                case 18: cassettesPerContainerGrid.add(new Label("How many cassettes for container R?"), 0, 7);
                case 17: cassettesPerContainerGrid.add(new Label("How many cassettes for container Q?"), 0, 6);
                case 16: cassettesPerContainerGrid.add(new Label("How many cassettes for container P?"), 0, 5);
                case 15: cassettesPerContainerGrid.add(new Label("How many cassettes for container O?"), 0, 4);
                case 14: cassettesPerContainerGrid.add(new Label("How many cassettes for container N?"), 0, 3);
                case 13: cassettesPerContainerGrid.add(new Label("How many cassettes for container M?"), 0, 2);
                case 12: cassettesPerContainerGrid.add(new Label("How many cassettes for container L?"), 0, 1);
                case 11: cassettesPerContainerGrid.add(new Label("How many cassettes for container K?"), 0, 0);
            }
        }else if(startIndex < 30){
            switch (goal) {
                default: ;
                case 30: cassettesPerContainerGrid.add(new Label("How many cassettes for container AD?"), 0, 9);
                case 29: cassettesPerContainerGrid.add(new Label("How many cassettes for container AC?"), 0, 8);
                case 28: cassettesPerContainerGrid.add(new Label("How many cassettes for container AB?"), 0, 7);
                case 27: cassettesPerContainerGrid.add(new Label("How many cassettes for container AA?"), 0, 6);
                case 26: cassettesPerContainerGrid.add(new Label("How many cassettes for container Z?"), 0, 5);
                case 25: cassettesPerContainerGrid.add(new Label("How many cassettes for container Y?"), 0, 4);
                case 24: cassettesPerContainerGrid.add(new Label("How many cassettes for container X?"), 0, 3);
                case 23: cassettesPerContainerGrid.add(new Label("How many cassettes for container W?"), 0, 2);
                case 22: cassettesPerContainerGrid.add(new Label("How many cassettes for container V?"), 0, 1);
                case 21: cassettesPerContainerGrid.add(new Label("How many cassettes for container U?"), 0, 0);
            }
        }
        if(goal-startIndex <10){
            switch(goal % 10){
                case 9: container9Spinner = new Spinner();
                    container9Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
                    cassettesPerContainerGrid.add(container9Spinner, 1, 8);
                case 8: container8Spinner = new Spinner();
                    container8Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
                    cassettesPerContainerGrid.add(container8Spinner, 1, 7);
                case 7: container7Spinner = new Spinner();
                    container7Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
                    cassettesPerContainerGrid.add(container7Spinner, 1, 6);
                case 6: container6Spinner = new Spinner();
                    container6Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
                    cassettesPerContainerGrid.add(container6Spinner, 1, 5);
                case 5: container5Spinner = new Spinner();
                    container5Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
                    cassettesPerContainerGrid.add(container5Spinner, 1, 4);
                case 4: container4Spinner = new Spinner();
                    container4Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
                    cassettesPerContainerGrid.add(container4Spinner, 1, 3);;
                case 3: container3Spinner = new Spinner();
                    container3Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
                    cassettesPerContainerGrid.add(container3Spinner, 1, 2);
                case 2: container2Spinner = new Spinner();
                    container2Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
                    cassettesPerContainerGrid.add(container2Spinner, 1, 1);
                case 1: container1Spinner = new Spinner();
                    container1Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
                    cassettesPerContainerGrid.add(container1Spinner, 1, 0);
            }
        }else{
            container10Spinner = new Spinner();
            container10Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
            cassettesPerContainerGrid.add(container10Spinner, 1, 9);
            container9Spinner = new Spinner();
            container9Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
            cassettesPerContainerGrid.add(container9Spinner, 1, 8);
            container8Spinner = new Spinner();
            container8Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
            cassettesPerContainerGrid.add(container8Spinner, 1, 7);
            container7Spinner = new Spinner();
            container7Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
            cassettesPerContainerGrid.add(container7Spinner, 1, 6);
            container6Spinner = new Spinner();
            container6Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
            cassettesPerContainerGrid.add(container6Spinner, 1, 5);
            container5Spinner = new Spinner();
            container5Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
            cassettesPerContainerGrid.add(container5Spinner, 1, 4);
            container4Spinner = new Spinner();
            container4Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
            cassettesPerContainerGrid.add(container4Spinner, 1, 3);;
            container3Spinner = new Spinner();
            container3Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
            cassettesPerContainerGrid.add(container3Spinner, 1, 2);
            container2Spinner = new Spinner();
            container2Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
            cassettesPerContainerGrid.add(container2Spinner, 1, 1);
            container1Spinner = new Spinner();
            container1Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
            cassettesPerContainerGrid.add(container1Spinner, 1, 0);
        }

    }
}