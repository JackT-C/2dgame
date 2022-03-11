package com.example.gane;


import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class GAME extends Application {
    public AnchorPane scene;
    @FXML
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(LOADINGSCREEN.class.getResource("GAME.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 750, 420);
        stage.setTitle("GAME");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}
