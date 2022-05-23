package com.norsula.battleship;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

public class ChooseSceneController {
    public NewGameTransfer newGameTransfer;

    public String hrju;
    @FXML
    private Button testbtn;

    @FXML
    private GridPane choiceGrid;
    @FXML
    private TableView<?> choiceGrid2;


    @FXML
    void hrju(ActionEvent event) {

        Pane header = (Pane) choiceGrid2.lookup("TableHeaderRow");
        //header.setVisible(false);
        choiceGrid2.getColumns().clear();


        for (int y=0;y<newGameTransfer.y;y++){
            TableColumn column =  new TableColumn("c"+Integer.toString(y+1));
            column.setCellValueFactory(new PropertyValueFactory<Cell,String>("status"));
            choiceGrid2.getColumns().add(column);
        }
        Cell test=new Cell();
        choiceGrid2.getItems().add(test);




    }
    public void initializeGame() {
        Stage stage = (Stage) testbtn.getScene().getWindow();
        //NewGameTransfer newGameTransfer=new NewGameTransfer();
        newGameTransfer=(NewGameTransfer)stage.getUserData();
        System.out.println(newGameTransfer.nameFirst);


    }

}
