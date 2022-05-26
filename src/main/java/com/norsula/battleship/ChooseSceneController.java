package com.norsula.battleship;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

public class ChooseSceneController {
    public NewGameTransfer newGameTransfer;
    public Ship activeShip=null;

    public String hrju;
    @FXML
    private Button testbtn;

    @FXML
    private GridPane choiceGrid;

    @FXML
    void dragOver(MouseDragEvent event) {
        System.out.println("Drag over");

    }
    @FXML
    void mouseEntered(MouseEvent event) {
        System.out.println(Double.toString(event.getX()));


    }
    @FXML
    void mouseMoved(MouseEvent event) {


        clearGrid();
        int X=(int)event.getX()/20;
        if (X>newGameTransfer.y-1){X=newGameTransfer.y-1;}
        int Y=(int)event.getY()/20;
        if (Y>newGameTransfer.x-1){Y=newGameTransfer.x-1;}
        //System.out.println("X:"+Integer.toString(X)+",Y:"+Integer.toString(Y));
        Image img= new Image(getClass().getResource("block.png").toString());

        ImageView imageView = new ImageView();
        Ship ship=new Ship(3,0,0,0);
        System.out.println(imageView);
        imageView.setFitWidth(20);
        imageView.setFitHeight(20);
        imageView.setImage(img);
        choiceGrid.add(ship.picture,X, Y);







    }

    @FXML
    void hrju(ActionEvent event) {


        choiceGrid.getColumnConstraints().clear();
        choiceGrid.getRowConstraints().clear();
        for (int x=0;x<newGameTransfer.x;x++){

            choiceGrid.getRowConstraints(). add(new RowConstraints(20));
        }

        for (int y=0;y<newGameTransfer.y;y++){

            choiceGrid.getColumnConstraints(). add(new ColumnConstraints(20));
        }








    }
    public void initializeChoice() {
        Stage stage = (Stage) testbtn.getScene().getWindow();

        newGameTransfer=(NewGameTransfer)stage.getUserData();
        clearGrid();


    }
    public void clearGrid(){
        Node node =choiceGrid.getChildren().get(0);
        choiceGrid.getChildren().clear();
        choiceGrid.getChildren().add(0,node);
        choiceGrid.getColumnConstraints().clear();
        choiceGrid.getRowConstraints().clear();
        choiceGrid.setGridLinesVisible(true);
        for (int x=0;x<newGameTransfer.x;x++){

            choiceGrid.getRowConstraints(). add(new RowConstraints(20));
        }

        for (int y=0;y<newGameTransfer.y;y++){

            choiceGrid.getColumnConstraints(). add(new ColumnConstraints(20));
        }


    }

}
