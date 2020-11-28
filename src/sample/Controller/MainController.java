package sample.Controller;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private  JFXButton mAccountBtn;

    @FXML
    private  JFXButton mCTBtn;

    @FXML
    private  JFXButton mTDBtn;

    @FXML
    private  JFXButton mSupportBtn;

    @FXML
    private Label mAtmLabel;

    @FXML
    private AnchorPane mSideScene;

    private AnchorPane accountPane;

    private AnchorPane transactionDataPane;

    private String currentPane;
    
    private AnchorPane createTransactionPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            accountPane = (AnchorPane) FXMLLoader.load(getClass().getResource("../Views/SideScene/Account/AccountScene.fxml"));
            mSideScene.getChildren().add(accountPane);
            transactionDataPane = (AnchorPane) FXMLLoader.load(getClass().getResource("../Views/SideScene/TransactionData/TransactionDataScene.fxml"));
            mSideScene.getChildren().add(transactionDataPane);

            createTransactionPane = (AnchorPane) FXMLLoader.load(getClass().getResource("../Views/SideScene/CreateTransaction/CreateTransactionScene.fxml"));
            mSideScene.getChildren().add(createTransactionPane);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void changePane(ActionEvent event)
    {
        if(event.getSource() == mAccountBtn)
        {
            accountPane.toFront();
            currentPane = accountPane.getId();
        }
        if(event.getSource() == mCTBtn)
        {
            createTransactionPane.toFront();
            currentPane = createTransactionPane.getId();
        }
        if(event.getSource() == mTDBtn)
        {
            transactionDataPane.toFront();
            currentPane = transactionDataPane.getId();
        }
        if(event.getSource() == mSupportBtn)
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("current pane is: " + currentPane);
            alert.show();
        }
    }

    public void logOut(ActionEvent event)
    {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../Views/LoginScene.fxml"));
            Stage stage = (Stage) mAccountBtn.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }


}
