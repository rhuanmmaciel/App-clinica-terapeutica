package scenes;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    private static Stage primaryStage;

    public static void setPrimaryStage(Stage stage) {
        primaryStage = stage;
    }

    public static void setScene(Scene scene) {
        primaryStage.setScene(scene);
    }

    public static void loadAndSetScene(String fxmlPath) {
        try {
            Parent root = FXMLLoader.load(SceneController.class.getResource(fxmlPath));
            primaryStage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
