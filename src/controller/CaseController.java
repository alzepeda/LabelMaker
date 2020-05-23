package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Case;
import model.CaseList;

import java.io.IOException;

public class CaseController{

    @FXML
    private Spinner containerSpinner;
    @FXML
    private Spinner paperSpinner;
    @FXML
    private ChoiceBox slidesPerCassetteChoiceBox;
    @FXML
    private TextField patientsInitialsTextField;

    @FXML
    private Button nextButton;

    @FXML
    private Label caseLabel;

    @FXML
    void initialize(){
        updateCaseLabel();
        initializeSpinners();
        initializeChoiceBox();
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

    void initializeSpinners(){
        SpinnerValueFactory<Integer> containerValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,30,1);
        this.containerSpinner.setValueFactory(containerValueFactory);
        SpinnerValueFactory<Integer> paperValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,30,1);
        this.paperSpinner.setValueFactory(paperValueFactory);
    }

    void initializeChoiceBox(){
        slidesPerCassetteChoiceBox.getItems().addAll("1","2","3","6");
        slidesPerCassetteChoiceBox.setValue("1");
    }

    public void nextButtonPushed(ActionEvent event) throws IOException {
        //case created and added to the list
        Case currentCase = new Case(CaseList.caseNumber, (int)this.paperSpinner.getValue(), (int)this.containerSpinner.getValue(),
                Integer.parseInt((String)this.slidesPerCassetteChoiceBox.getValue()), this.patientsInitialsTextField.getText(), CaseList.seriesAndYear);
        CaseList.list.add(currentCase);

        int i = 0;
        while(i < CaseList.list.size()){
            System.out.println(CaseList.list.get(i));
            i++;
        }

        //next view loaded and shown
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("../view/Cassettes.fxml"));
        AnchorPane root = loader.load();

        // Show the scene containing the root layout.
        Scene scene = new Scene(root);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}

