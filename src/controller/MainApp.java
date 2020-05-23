package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException{
        AnchorPane root;

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("../view/Setup.fxml"));
        root = loader.load();

        // Show the scene containing the root layout.
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
