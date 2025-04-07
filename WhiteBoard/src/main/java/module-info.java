module com.example.whiteboard {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.whiteboard to javafx.fxml;
    exports com.example.whiteboard;
}