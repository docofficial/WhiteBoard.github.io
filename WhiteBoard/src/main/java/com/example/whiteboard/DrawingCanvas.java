package com.example.whiteboard;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class DrawingCanvas extends Canvas {
    private GraphicsContext gc;

    public DrawingCanvas(double width, double height) {
        super(width, height);
        gc = this.getGraphicsContext2D();
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
    }

    public GraphicsContext getGc() {
        return gc;
    }

    public void clear() {
        gc.clearRect(0, 0, getWidth(), getHeight());
    }
}
