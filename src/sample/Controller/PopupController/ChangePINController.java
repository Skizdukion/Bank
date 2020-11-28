package sample.Controller.PopupController;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ChangePINController implements Initializable {

    @FXML
    private JFXPasswordField mPIN;

    @FXML
    private JFXPasswordField mNewPIN;

    @FXML
    private JFXPasswordField mConfirmPIN;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void Close(ActionEvent event) {
        JFXButton newBtn = (JFXButton) event.getSource();
        Stage newS =(Stage) newBtn.getScene().getWindow();
        newS.close();
    }

    public void Save(ActionEvent event) {

        //do things here
        JFXButton newBtn = (JFXButton) event.getSource();
        Stage newS =(Stage) newBtn.getScene().getWindow();
        newS.close();
    }
}
