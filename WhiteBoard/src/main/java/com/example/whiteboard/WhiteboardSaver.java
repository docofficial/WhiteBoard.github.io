package com.example.whiteboard;

import javafx.scene.canvas.Canvas;
import javafx.scene.image.WritableImage;
import javafx.scene.image.PixelReader;
import javafx.stage.FileChooser;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WhiteboardSaver {

    public static void saveWhiteboardAsImage(Canvas canvas) {
        // Initialize FileChooser for saving the image
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("PNG Files", "*.png"));
        fileChooser.setTitle("Save Whiteboard");

        // Open the file chooser dialog and get the selected file
        File file = fileChooser.showSaveDialog(canvas.getScene().getWindow());

        if (file != null) {
            try {
                // Ensure file has .png extension
                if (!file.getName().endsWith(".png")) {
                    file = new File(file.getAbsolutePath() + ".png");
                }

                // Create a snapshot of the canvas
                WritableImage snapshot = new WritableImage((int) canvas.getWidth(), (int) canvas.getHeight());
                canvas.snapshot(null, snapshot);

                // Convert WritableImage to BufferedImage
                BufferedImage bufferedImage = convertToBufferedImage(snapshot);

                // Save the BufferedImage as a PNG file
                ImageIO.write(bufferedImage, "PNG", file);
                System.out.println("Whiteboard saved successfully: " + file.getAbsolutePath());
            } catch (IOException e) {
                System.err.println("Error saving whiteboard image: " + e.getMessage());
            }
        }
    }

    private static BufferedImage convertToBufferedImage(WritableImage writableImage) {
        PixelReader pixelReader = writableImage.getPixelReader();
        int width = (int) writableImage.getWidth();
        int height = (int) writableImage.getHeight();
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // Get the color at the current pixel
                javafx.scene.paint.Color color = pixelReader.getColor(x, y);

                // Convert the color components to the 0-255 range
                int red = (int) (color.getRed() * 255);
                int green = (int) (color.getGreen() * 255);
                int blue = (int) (color.getBlue() * 255);
                int alpha = (int) (color.getOpacity() * 255);

                // Combine the RGBA components into a single ARGB value
                int argb = (alpha << 24) | (red << 16) | (green << 8) | blue;

                // Set the RGB value in the BufferedImage
                bufferedImage.setRGB(x, y, argb);
            }
        }

        return bufferedImage;
    }
}
