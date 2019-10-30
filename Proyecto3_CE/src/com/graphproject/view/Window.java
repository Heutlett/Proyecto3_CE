package com.graphproject.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Window extends Application {

    /**
     * Main del programa
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        stage.setResizable(false);
        stage.setTitle("Graph Visualizer");

        //Se crea el panel y se agrega al stage
        Pane panel = new Pane();
        stage.setScene(new Scene(panel, 1350, 750));

        stage.show();

    }
}
