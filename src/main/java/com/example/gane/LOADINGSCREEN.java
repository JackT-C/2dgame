package com.example.gane;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;


public class LOADINGSCREEN extends Application {
    public ImageView placeholder;

    public void mousepress() {

    }

    public void mouserelease() {
        FadeTransition ft = new FadeTransition(Duration.millis(1000),placeholder);
        ft.setFromValue(1.0);
        ft.setToValue(0.3);
        ft.setCycleCount(4);
        ft.setAutoReverse(true);
        ft.play();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(LOADINGSCREEN.class.getResource("LOADING SCREEN.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 750, 420);
        stage.setTitle("Loading Screen");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) { launch();}

}
