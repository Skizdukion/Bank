package sample.Controller.PopupController;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import sample.Controller.LoginController;

import java.net.URL;
import java.util.ResourceBundle;

public class WithdrawalController implements Initializable {

    @FXML
    private AnchorPane mFirstPane;

    @FXML
    private JFXTextField mAmountLabel;

    @FXML
    private AnchorPane mReceiptPane;

    @FXML
    private Label mFundsLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mFundsLabel.setText(LoginController.userData.getBalance()+"$");
    }

    public void ClearLabel(ActionEvent event)
    {
        mAmountLabel.setText("");
    }

    public void Close(ActionEvent event)
    {
        JFXButton newBtn = (JFXButton) event.getSource();
        Stage newS =(Stage) newBtn.getScene().getWindow();
        newS.close();
    }

    public void NextScene(ActionEvent event)
    {
        mReceiptPane.toFront();
    }
}
