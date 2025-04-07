package com.example.whiteboard;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.File;

public class WhiteboardController {
    @FXML private Canvas drawingCanvas;
    @FXML private Pane whiteboardPane;
    @FXML private ColorPicker colorPicker;

    private GraphicsContext gc;
    private Media multimediaManager;

    public void initialize() {
        gc = drawingCanvas.getGraphicsContext2D();
        multimediaManager = new Media(whiteboardPane);

        drawingCanvas.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            gc.setStroke(colorPicker.getValue());
            gc.beginPath();
            gc.moveTo(event.getX(), event.getY());
            gc.stroke();
        });

        drawingCanvas.addEventHandler(MouseEvent.MOUSE_DRAGGED, event -> {
            gc.lineTo(event.getX(), event.getY());
            gc.stroke();
        });
    }

    @FXML
    public void addImage() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Images", "*.png", "*.jpg", "*.jpeg"));
        File file = fileChooser.showOpenDialog(null);
        if (file != null) {
            multimediaManager.addImage(file);
        }
    }

    @FXML
    public void saveSession() {
        WhiteboardSaver.saveWhiteboardAsImage(drawingCanvas);
    }

    @FXML
    public void clearCanvas() {
        gc.clearRect(0, 0, drawingCanvas.getWidth(), drawingCanvas.getHeight());
        whiteboardPane.getChildren().clear(); // Remove multimedia
    }
}
