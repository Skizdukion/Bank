package sample.Controller.PopupController;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class DepositController implements Initializable {


    @FXML
    private AnchorPane mAmountPane;

    @FXML
    private AnchorPane mReceiptPane;

    @FXML
    private JFXTextField mAmountText;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
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

    public void InitAmount(ActionEvent event)
    {
        Random rand = new Random();
        int upperbound = 4990;
        int int_random = rand.nextInt(upperbound) + 10;
        mAmountText.setText(int_random+"");
        mAmountPane.toFront();
        //cap nhat o day
    }

}
