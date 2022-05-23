package com.norsula.battleship;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;






public class BattleshipGame extends Application {
    //Scene choosePositionScene;

    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        FXMLLoader initialSceneFxmlLoader = new FXMLLoader(BattleshipGame.class.getResource("initialSceneForm.fxml"));
        Scene beginScene = new Scene(initialSceneFxmlLoader.load());
        FXMLLoader choosePositionFxmlLoader = new FXMLLoader(getClass().getResource("choosePositionForm.fxml"));
        Scene choosePositionScene = new Scene(choosePositionFxmlLoader.load());

        InitialSceneController initialSceneController=initialSceneFxmlLoader.getController();
        stage.setTitle("Make your choice");
        stage.setScene(beginScene);
        stage.setResizable(false);
        //Image img=new Image("file:blocks.png");
        //stage.getIcons().add(new Image("file:starticon.png"));
        stage.getIcons().add(new Image(getClass().getResource("starticon.png").toExternalForm()));
        stage.show();
        //String nameFirst=initialSceneController.nameFirst.getText();
        //System.out.println(nameFirst);
        //beginScene
    }

    public static void main(String[] args) {
        launch();
    }
}