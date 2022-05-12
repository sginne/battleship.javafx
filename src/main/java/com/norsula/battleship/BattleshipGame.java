package com.norsula.battleship;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BattleshipGame extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(BattleshipGame.class.getResource("initialSceneForm.fxml"));
        Scene beginScene = new Scene(fxmlLoader.load());
        stage.setTitle("Make your choice");
        stage.setScene(beginScene);
        stage.setResizable(false);
        stage.show();
        //beginScene
    }

    public static void main(String[] args) {
        launch();
    }
}