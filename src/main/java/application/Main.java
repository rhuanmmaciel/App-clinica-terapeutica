package application;

import javafx.application.Application;
import javafx.stage.Stage;
import scenes.Home;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        new Home(stage);

    }

    public static void main(String[] args) {
        launch();
    }
}