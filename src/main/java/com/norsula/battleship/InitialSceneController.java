package com.norsula.battleship;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.stage.WindowEvent;

import java.io.IOException;

public class InitialSceneController {
    int boardSize;
    int shipsSize;
    public void updateBoard(){
        boardSize=Integer.parseInt(gridX.getSelectionModel().getSelectedItem())*Integer.parseInt(gridY.getSelectionModel().getSelectedItem());
        boardSizeLabel.setText("Size of board is: "+Integer.toString(boardSize));
        shipsSize=Integer.parseInt(carrierAmount.getSelectionModel().getSelectedItem())*5+Integer.parseInt(battleshipAmount.getSelectionModel().getSelectedItem())*4+Integer.parseInt(submarineAmount.getSelectionModel().getSelectedItem())*3+Integer.parseInt(cruiserAmount.getSelectionModel().getSelectedItem())*3+Integer.parseInt(destroyerAmount.getSelectionModel().getSelectedItem())*2;
        shipSizeLabel.setText("Size of ships on board is: "+Integer.toString(shipsSize));
        boolean disableStart =false;
        if (boardSize<shipsSize){
            disableStart =true;}
        if (nameFirst.getText()==""){
            disableStart =true;}
        if (nameSecond.getText()==""){
            disableStart =true;}


        beginBtn.setDisable(disableStart);
    }

    @FXML
    public TextField nameFirst;

    @FXML
    private TextField nameSecond;
    @FXML
    private Label boardSizeLabel;
    @FXML
    private Label shipSizeLabel;
    @FXML
    private ListView<String> gridX;

    @FXML
    private ListView<String> gridY;
    @FXML
    void gridClick(MouseEvent event) {
        updateBoard();
    }


    @FXML
    private ComboBox<String> carrierAmount;
    @FXML
    private ComboBox<String> battleshipAmount;
    @FXML
    private ComboBox<String> cruiserAmount;
    @FXML
    private ComboBox<String> submarineAmount;
    @FXML
    private ComboBox<String> destroyerAmount;

    @FXML
    private Button beginBtn;

    @FXML
    void startGame(ActionEvent event) {
        Stage stage = (Stage) beginBtn.getScene().getWindow();
        stage.close();
        FXMLLoader choosePositionFxmlLoader = new FXMLLoader(getClass().getResource("choosePositionForm.fxml"));
        //ChooseSceneController chooseSceneController=choosePositionFxmlLoader.getController();
        Parent root;
        try {

            Parent choosePositionScene = choosePositionFxmlLoader.load();
            stage = new Stage();
            NewGameTransfer newGameTransfer=new NewGameTransfer();
            newGameTransfer.nameFirst=nameFirst.getText();
            newGameTransfer.nameSecond=nameSecond.getText();
            newGameTransfer.x=Integer.parseInt(gridX.getSelectionModel().getSelectedItem());
            newGameTransfer.y=Integer.parseInt(gridY.getSelectionModel().getSelectedItem());
            stage.setUserData(newGameTransfer);
            stage.setTitle("TuneUs");
            stage.setScene(new Scene(choosePositionScene));
            ChooseSceneController chooseSceneController=choosePositionFxmlLoader.getController();

            chooseSceneController.initializeGame();
            stage.show();
        } catch (IOException e) {e.printStackTrace();}




    }
    public void initialize(){
        gridX.getItems().add("5");
        gridX.getItems().add("6");
        gridX.getItems().add("7");
        gridX.getItems().add("8");
        gridX.getItems().add("9");
        gridX.getItems().add("10");
        gridY.getItems().add("5");
        gridY.getItems().add("6");
        gridY.getItems().add("7");
        gridY.getItems().add("8");
        gridY.getItems().add("9");
        gridY.getItems().add("10");
        gridX.getSelectionModel().select(4);
        gridY.getSelectionModel().select(4);

        //updateBoard();
        //updateBoardSizeLabel();
        for (int i = 0; i < 10; i++) {
            //System.out.println(i);
            carrierAmount.getItems().add(Integer.toString(i));
            battleshipAmount.getItems().add(Integer.toString(i));
            cruiserAmount.getItems().add(Integer.toString(i));
            submarineAmount.getItems().add(Integer.toString(i));
            destroyerAmount.getItems().add(Integer.toString(i));
        }
        carrierAmount.getSelectionModel().select(1);
        battleshipAmount.getSelectionModel().select(2);
        cruiserAmount.getSelectionModel().select(3);
        submarineAmount.getSelectionModel().select(3);
        destroyerAmount.getSelectionModel().select(4);
        updateBoard();


    }

}


