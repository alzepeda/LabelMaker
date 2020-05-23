package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Case;
import model.CaseList;

import java.io.IOException;
import java.util.Calendar;

public class SetupController{

    @FXML
    private RadioButton delSolButton;
    @FXML
    private RadioButton foundationButton;
    @FXML
    private RadioButton solarisButton;
    @FXML
    private RadioButton hermanButton;
    @FXML
    private RadioButton kimbleButton;

    @FXML
    private RadioButton surgicalButton;
    @FXML
    private RadioButton hematologyButton;
    @FXML
    private RadioButton cytologyButton;
    @FXML
    private RadioButton fineNeedleButton;
    @FXML
    private RadioButton boneMarrowButton;
    @FXML
    private RadioButton autopsyButton;

    @FXML
    private CheckBox customChecked;
    @FXML
    private TextField seriesAndYearTextField;
    @FXML
    private TextField initialCaseNumberTextField;

    @FXML
    private Button setupDoneButton;

    @FXML
    void initialize(){

    }

    public void setupDoneButtonPushed(ActionEvent event) throws IOException{
        String seriesAndYear = "";
        int initialCaseNumber;
        if(customChecked.isSelected()){
            seriesAndYear = seriesAndYearTextField.getText();
            try{
                initialCaseNumber = Integer.parseInt(initialCaseNumberTextField.getText());
                CaseList.seriesAndYear = seriesAndYear;
                CaseList.caseNumber = initialCaseNumber;
                System.out.println(CaseList.seriesAndYear + "-" + CaseList.caseNumber);
                startCases(event);
            }catch(NumberFormatException e){
                System.out.println("Error: "+ e.getMessage());
            }
        }else{
            if(hermanButton.isSelected()){
                seriesAndYear += "HP";
            }else{
                if(delSolButton.isSelected()){
                    seriesAndYear += "D";
                }else if(foundationButton.isSelected()) {
                    seriesAndYear += "F";
                }else if(solarisButton.isSelected()){
                    seriesAndYear += "S";
                }else if(kimbleButton.isSelected()){
                    seriesAndYear += "K";
                }
                if(surgicalButton.isSelected()){
                    seriesAndYear += "S";
                }else if(hematologyButton.isSelected()) {
                    seriesAndYear += "H";
                }else if(cytologyButton.isSelected()){
                    seriesAndYear += "C";
                }else if(fineNeedleButton.isSelected()){
                    seriesAndYear += "F";
                }else if(boneMarrowButton.isSelected()){
                    seriesAndYear += "B";
                }else if(autopsyButton.isSelected()){
                    seriesAndYear += "A";
                }
            }
            //sets the series and year to be used for the next few cases
            seriesAndYear += Calendar.getInstance().get(Calendar.YEAR)%100;
            CaseList.seriesAndYear = seriesAndYear;
            //uses the above series and year to determine the initial case number
            CaseList.caseNumber = CaseList.getInitialCaseNumber();
            startCases(event);
        }
    }

    void startCases(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("../view/Case.fxml"));
        AnchorPane root = loader.load();

        // Show the scene containing the root layout.
        Scene scene = new Scene(root);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}
