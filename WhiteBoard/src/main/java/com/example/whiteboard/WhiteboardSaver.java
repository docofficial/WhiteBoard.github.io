<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.canvas.Canvas?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.ColorPicker?>
<?import javafx.scene.layout.HBox?>
<?import javafx.scene.layout.Pane?>
<?import javafx.scene.layout.VBox?>

<VBox spacing="20" alignment="CENTER" xmlns="http://javafx.com/javafx"
      xmlns:fx="http://javafx.com/fxml/1"
      fx:controller="com.example.whiteboard.WhiteboardController"
      style="-fx-background-color: #f4f4f4; -fx-padding: 20;">

    <!-- Whiteboard drawing area -->
    <Pane fx:id="whiteboardPane" prefWidth="800" prefHeight="500"
          style="-fx-border-color: #ccc; -fx-border-width: 2; -fx-background-color: white;">
        <Canvas fx:id="drawingCanvas" width="800" height="500"/>
    </Pane>
<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.canvas.Canvas?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.ColorPicker?>
<?import javafx.scene.layout.HBox?>
<?import javafx.scene.layout.Pane?>
<?import javafx.scene.layout.VBox?>

<VBox spacing="20" alignment="CENTER" xmlns="http://javafx.com/javafx"
      xmlns:fx="http://javafx.com/fxml/1"
      fx:controller="com.example.whiteboard.WhiteboardController"
      style="-fx-background-color: #f4f4f4; -fx-padding: 20;">

    <!-- Whiteboard drawing area -->
    <Pane fx:id="whiteboardPane" prefWidth="800" prefHeight="500"
          style="-fx-border-color: #ccc; -fx-border-width: 2; -fx-background-color: white;">
        <Canvas fx:id="drawingCanvas" width="800" height="500"/>
    </Pane>

    <!-- Horizontal control panel using HBox -->
    <HBox spacing="10" alignment="CENTER"
          style="-fx-padding: 10; -fx-background-color: #e0e0e0; -fx-border-radius: 5; -fx-background-radius: 5;">

        <ColorPicker fx:id="colorPicker" />

        <Button text="🧽 Eraser" onAction="#useEraser"
                style="-fx-background-color: #6c757d; -fx-text-fill: white; -fx-background-radius: 5;" />
        <Button text="🔊 Sound"
                style="-fx-background-color: #17a2b8; -fx-text-fill: white; -fx-background-radius: 5;" />

        <Button text="Add Image" onAction="#addImage"
                style="-fx-background-color: #0078d7; -fx-text-fill: white; -fx-background-radius: 5;"/>
        <Button text="Save" onAction="#saveSession"
                style="-fx-background-color: #28a745; -fx-text-fill: white; -fx-background-radius: 5;"/>
        <Button text="Clear" onAction="#clearCanvas"
                style="-fx-background-color: #dc3545; -fx-text-fill: white; -fx-background-radius: 5;"/>
    </HBox>
</VBox>

    <!-- Horizontal control panel using HBox -->
    <HBox spacing="10" alignment="CENTER"
          style="-fx-padding: 10; -fx-background-color: #e0e0e0; -fx-border-radius: 5; -fx-background-radius: 5;">

        <ColorPicker fx:id="colorPicker" />

        <Button text="🧽 Eraser" onAction="#useEraser"
                style="-fx-background-color: #6c757d; -fx-text-fill: white; -fx-background-radius: 5;" />
        <Button text="🔊 Sound"
                style="-fx-background-color: #17a2b8; -fx-text-fill: white; -fx-background-radius: 5;" />

        <Button text="Add Image" onAction="#addImage"
                style="-fx-background-color: #0078d7; -fx-text-fill: white; -fx-background-radius: 5;"/>
        <Button text="Save" onAction="#saveSession"
                style="-fx-background-color: #28a745; -fx-text-fill: white; -fx-background-radius: 5;"/>
        <Button text="Clear" onAction="#clearCanvas"
                style="-fx-background-color: #dc3545; -fx-text-fill: white; -fx-background-radius: 5;"/>
    </HBox>
</VBox>
