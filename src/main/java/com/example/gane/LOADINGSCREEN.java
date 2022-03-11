package com.example.gane;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;


public class LOADINGSCREEN extends Application {
    public ImageView placeholder;
    private AnchorPane scene;
    @FXML
    private AnchorPane rootPane;

    public void mouserelease() {
        FadeTransition ft = new FadeTransition(Duration.millis(1000),placeholder);
        ft.setFromValue(1.0);
        ft.setToValue(0.3);
        ft.setAutoReverse(true);
        ft.play();
        ft.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    switchscene();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    @FXML
    public void switchscene() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("GAME.fxml"));
        rootPane.getChildren().setAll(pane);
    }


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LOADING SCREEN.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) { launch();}

}
