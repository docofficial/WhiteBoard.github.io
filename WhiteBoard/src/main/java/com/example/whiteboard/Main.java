package com.example.whiteboard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;  // Change to VBox
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Load FXML file using getResource to point to resources folder
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/whiteboard/whiteboard.fxml"));

        // Ensure the FXML file is loaded correctly and use VBox as the root
        VBox root = loader.load();  // Use VBox instead of AnchorPane

        // Set the scene with the loaded FXML content
        Scene scene = new Scene(root, 800, 600);

        // Set the title of the application window
        primaryStage.setTitle("Whiteboard");
        primaryStage.setScene(scene);

        // Show the primary stage (window)
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
