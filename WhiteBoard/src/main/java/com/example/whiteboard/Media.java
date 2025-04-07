package com.example.whiteboard;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.File;

public class Media {
    private Pane whiteboardPane;

    public Media(Pane whiteboardPane) {
        this.whiteboardPane = whiteboardPane;
    }

    public void addImage(File file) {
        Image image = new Image(file.toURI().toString());
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(150);
        imageView.setPreserveRatio(true);
        whiteboardPane.getChildren().add(imageView);
    }
}
