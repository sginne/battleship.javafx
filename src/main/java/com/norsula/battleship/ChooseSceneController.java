package com.norsula.battleship;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ChooseSceneController {
    public String hrju;
    @FXML
    private Button testbtn;

    @FXML
    void hrju(ActionEvent event) {
        NewGameTransfer newGameTransfer=new NewGameTransfer();
        Stage stage = (Stage) testbtn.getScene().getWindow();
        newGameTransfer=(NewGameTransfer)stage.getUserData();


    }
    public void initialize(URL location, ResourceBundle resources) {
        Stage stage = (Stage) testbtn.getScene().getWindow();
        NewGameTransfer newGameTransfer=new NewGameTransfer();
        newGameTransfer=(NewGameTransfer)stage.getUserData();
        System.out.println(newGameTransfer.nameFirst);


    }

}
