package sample.Controller.PopupController;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import sample.Controller.LoginController;

import java.net.URL;
import java.util.ResourceBundle;

public class ChangeInfoController implements Initializable {

    @FXML
    private Label mNameLabel;

    @FXML
    private Label mPIDLabel;

    @FXML
    private Label mMemberSinceLabel;

    @FXML
    private JFXTextField mEmailText;

    @FXML
    private JFXTextField mAddressText;

    @FXML
    private JFXTextField mPhoneText;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mNameLabel.setText(LoginController.userData.getName());
        mPIDLabel.setText(LoginController.userData.getPersonalID());
        mMemberSinceLabel.setText(LoginController.userData.getMemberSince());
        mEmailText.setText(LoginController.userData.getEmail());
        mAddressText.setText(LoginController.userData.getAddress());
        mPhoneText.setText(LoginController.userData.getPhoneNumber());
    }

    public void Close(ActionEvent event) {
        JFXButton newBtn = (JFXButton) event.getSource();
        Stage newS =(Stage) newBtn.getScene().getWindow();
        newS.close();
    }

    public void Save(ActionEvent event) {

        //update o day, nen cap nhat luon uderdata, may tu them may cai ham set vo
        JFXButton newBtn = (JFXButton) event.getSource();
        Stage newS =(Stage) newBtn.getScene().getWindow();
        newS.close();
    }
}
