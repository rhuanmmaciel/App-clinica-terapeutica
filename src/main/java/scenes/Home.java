package scenes;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class Home {


    public Home(Stage stage) throws IOException {

        SceneController.setPrimaryStage(stage);

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/scenes/Home.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),
                Screen.getPrimary().getBounds().getWidth(),
                Screen.getPrimary().getBounds().getHeight());
        stage.setTitle("Recanto");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void setPrimaryStage(Stage stage) {
        SceneController.setPrimaryStage(stage);
    }

}
