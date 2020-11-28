package sample.Views.SideScene.CreateTransaction;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.Controller.LoginController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CreateTransactionController implements Initializable {

    @FXML
    private AnchorPane mCreateTransactionPane;

    @FXML
    private JFXButton mWithdrawalPopup;

    @FXML
    private JFXButton mDepositPopup;

    @FXML
    private JFXButton mTransferPopup;

    @FXML
    private JFXButton mProviderPaymentPopup;

    @FXML
    private Label mFundsLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mFundsLabel.setText(LoginController.userData.getBalance()+"$");
    }

    public void TransactionPopup(ActionEvent event) {
        if(event.getSource() == mWithdrawalPopup)
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../FormPopup/WithdrawalScene.fxml"));
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
        if(event.getSource() == mDepositPopup)
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../FormPopup/DepositScene.fxml"));
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
        if(event.getSource() == mTransferPopup)
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../FormPopup/TransferScene.fxml"));
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
        if(event.getSource() == mProviderPaymentPopup)
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../FormPopup/ProviderPaymentScene.fxml"));
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