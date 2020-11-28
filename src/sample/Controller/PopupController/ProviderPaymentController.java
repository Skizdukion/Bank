package sample.Controller.PopupController;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.Controller.LoginController;

import java.net.URL;
import java.util.ResourceBundle;

public class ProviderPaymentController implements Initializable {

    @FXML
    private AnchorPane mProviderPane;

    @FXML
    private JFXButton mProviderNextBtn;

    @FXML
    private ComboBox mProviderCB;

    @FXML
    private AnchorPane mReceiptPane;

    @FXML
    private AnchorPane mIDPaymentPane;

    @FXML
    private JFXTextField mIDPaymentText;

    @FXML
    private JFXButton mIDPaymentNextBtn;

    @FXML
    private JFXButton mIDPaymentClearBtn;

    @FXML
    private AnchorPane mPaymentAmountPane;

    @FXML
    private JFXTextField mAmountPaymentText;

    @FXML
    private JFXButton mPaymentAmountBtn;

    @FXML
    private Label mFundsLabel;

    ObservableList<String> providerList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        providerList = FXCollections.observableArrayList("Viettel","Vinaphone","FPT","Shit","I","Dont","know");
        mProviderCB.setValue("Viettel");
        mProviderCB.setItems(providerList);
        mFundsLabel.setText(LoginController.userData.getBalance()+"$");
    }

    public void Close(ActionEvent event) {
        JFXButton newBtn = (JFXButton) event.getSource();
        Stage newS =(Stage) newBtn.getScene().getWindow();
        newS.close();
    }

    public void NextScene(ActionEvent event) {
        if (event.getSource() == mProviderNextBtn)
        {
            mIDPaymentPane.toFront();
        }
        if (event.getSource() == mIDPaymentNextBtn)
        {
            mPaymentAmountPane.toFront();
        }
        if (event.getSource() == mPaymentAmountBtn)
        {
            mReceiptPane.toFront();
        }
    }

    public void ClearText(ActionEvent event) {
        mIDPaymentText.setText("");
    }

}
