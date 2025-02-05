package com.example.teacherapp.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerApp_teacher {

    @FXML
    private Button Create_Button;

    @FXML
    private ListView<?> Lector_list;

    @FXML
    private TextArea Lector_text;

    @FXML
    private Button SingOut_Button;

    @FXML
    private Button lector_Button;

    @FXML
    private Button test_Button;

    @FXML
    void initialize() {
        Create_Button.setOnAction(event -> {
            OpenNewScene("/main/com.example.teacherapp/singUpApp.fxml");


        });
    }
    public void OpenNewScene(String window){
        Create_Button.getScene().getWindow().hide();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(window));

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }
}
