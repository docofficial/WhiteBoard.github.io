package com.example.whiteboard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/whiteboard/whiteboard.fxml"));
        VBox root = loader.load();

        // Internal CSS styling (background color and padding example)
        root.setStyle("-fx-background-color: #f4f4f4; -fx-padding: 20px;");

        Scene scene = new Scene(root, 800, 600);

        primaryStage.setTitle("Whiteboard");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
