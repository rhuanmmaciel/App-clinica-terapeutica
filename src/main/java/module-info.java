module com.example.sitioLuzDoSol {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens application to javafx.fxml;
    exports application;
    exports scenes;
    opens scenes to javafx.fxml;
}