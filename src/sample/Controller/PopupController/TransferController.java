package sample.Controller.PopupController;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class TransferController implements Initializable {

    @FXML
    private AnchorPane mReceiptPane;

    @FXML
    private JFXButton mAmountOKBtn;

    @FXML
    private JFXButton mAmountClearBtn;

    @FXML
    private JFXButton mIDRecipientNext;

    @FXML
    private JFXButton mIDRecipientClearBtn;

    @FXML
    private AnchorPane mAmountPane;

    @FXML
    private JFXTextField mIDRecipientText;

    @FXML
    private JFXTextField mAmountText;

    @FXML
    private AnchorPane mRecipientPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void ClearText(ActionEvent event) {
        if (event.getSource() == mIDRecipientClearBtn)
        {
            mIDRecipientText.setText("");
        }
        if (event.getSource() == mAmountClearBtn)
        {
            mAmountText.setText("");
        }
    }

    public void Close(ActionEvent event) {
        JFXButton newBtn = (JFXButton) event.getSource();
        Stage newS =(Stage) newBtn.getScene().getWindow();
        newS.close();
    }

    public void NextScene(ActionEvent event) {
        if (event.getSource() == mAmountOKBtn)
        {
            mReceiptPane.toFront();
        }
        if (event.getSource() == mIDRecipientNext)
        {
            mAmountPane.toFront();
        }
    }
}
