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

import java.io.IOException;

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
        String seriesAndYear;
        int initialCaseNumber;
        if(customChecked.isSelected()){
            seriesAndYear = seriesAndYearTextField.getText();
            try{
                initialCaseNumber = Integer.parseInt(initialCaseNumberTextField.getText());
                Case.seriesAndYear = seriesAndYear;
                Case.caseNumber = initialCaseNumber;
                System.out.println(Case.seriesAndYear + "-" + Case.caseNumber);
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(Main.class.getResource("../view/Case.fxml"));
                AnchorPane root = loader.load();

                // Show the scene containing the root layout.
                Scene scene = new Scene(root);

                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.show();

            }catch(NumberFormatException e){
                System.out.println("Error: "+ e.getMessage());
            }
        }
    }
}
