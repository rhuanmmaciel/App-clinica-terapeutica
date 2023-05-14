package scenes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeController {

    @FXML
    private Button btnHome;
    @FXML
    public void onBtnRegisterPatient(){

        System.out.println("a");
        btnHome.setText("o");

    }

}