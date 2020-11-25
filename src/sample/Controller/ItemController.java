package sample.Controller;


import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.Models.TransactionModel;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ItemController implements Initializable {

    @FXML
    private JFXButton mDetailBtn;

    @FXML
    private Label mTransactionID;

    @FXML
    private Label mTransactionType;

    @FXML
    private Label mTransactionAmount;

    @FXML
    private Label mTransactionDateTime;


    static private TransactionModel model;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            loadData();
    }
    public void DetailDisplay(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("evoke by: " + mTransactionID.getText());
        alert.show();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../Views/FormPopup/TransactionDetail.fxml"));
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
    public static void initModel(TransactionModel tModel)
    {
        model = tModel;
    }
    private void loadData()
    {
        mTransactionID.setText(model.getTransactionID());
        mTransactionType.setText(model.getType());
        mTransactionAmount.setText(model.getAmount());
        mTransactionDateTime.setText(model.getExeDate());
    }

}
