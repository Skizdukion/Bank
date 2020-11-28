package sample.Views.SideScene.Account;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.Controller.LoginController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AccountController implements Initializable {


    @FXML
    private JFXButton mChangeInfoBtn;

    @FXML
    private JFXButton mChangePINBtn;

    @FXML
    private Label mAccountNumberLabel;

    @FXML
    private Label mNameText;

    @FXML
    private Label mEmailText;

    @FXML
    private Label mPhoneText;

    @FXML
    private Label mAddressText;

    @FXML
    private Label mPIDText;

    @FXML
    private Label mMemberSinceText;

    @FXML
    private Label mCardNumberText;

    @FXML
    private Label mPINPassword;

    @FXML
    private Label mCardCreationDateText;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mAccountNumberLabel.setText(LoginController.userData.getAccountID());
        mNameText.setText(LoginController.userData.getName());
        mEmailText.setText(LoginController.userData.getEmail());
        mPhoneText.setText(LoginController.userData.getPhoneNumber());
        mAddressText.setText(LoginController.userData.getAddress());
        mPIDText.setText(LoginController.userData.getPersonalID());
        mMemberSinceText.setText(LoginController.userData.getMemberSince());
        mCardNumberText.setText(LoginController.userData.getCardNumber());
        mPINPassword.setText(LoginController.userData.getPIN());
        mCardCreationDateText.setText(LoginController.userData.getCardCreationDate());
    }

    public void AccountPopup(ActionEvent event) {
        if (event.getSource() == mChangeInfoBtn) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../FormPopup/ChangeInfo.fxml"));
            Scene newScene;
            try {
                newScene = new Scene(loader.load());
                Stage newStage = new Stage();
                newStage.setScene(newScene);
                newStage.setResizable(false);
                newStage.initModality(Modality.APPLICATION_MODAL);
                newStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (event.getSource() == mChangePINBtn) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../FormPopup/ChangePin.fxml"));
            Scene newScene;
            try {
                newScene = new Scene(loader.load());
                Stage newStage = new Stage();
                newStage.setScene(newScene);
                newStage.setResizable(false);
                newStage.initModality(Modality.APPLICATION_MODAL);
                newStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
