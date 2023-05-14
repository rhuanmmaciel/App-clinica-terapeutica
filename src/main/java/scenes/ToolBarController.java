package scenes;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class ToolBarController {

    @FXML
    private Button btnHome;

    @FXML
    private Button btnPatients;

    @FXML
    private Button btnResponsibles;

    @FXML
    private Button btnReports;

    @FXML
    private void onBtnHomeAction(){

        SceneController.loadAndSetScene("Home.fxml");

    }

    @FXML
    private void onBtnPatientsAction(){

        SceneController.loadAndSetScene("Patients.fxml");

    }

    @FXML
    private void onBtnResponsiblesAction(){

        SceneController.loadAndSetScene("Responsibles.fxml");

    }

    @FXML
    private void onBtnReportsAction(){

        SceneController.loadAndSetScene("Reports.fxml");

    }


}
