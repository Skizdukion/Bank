package sample.Controller;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
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
    private AnchorPane mAccountPane;
    @FXML
    private AnchorPane mCreateTransactionPane;
    @FXML
    private AnchorPane mTransactionDataPane;
    @FXML
    private Label mAtmLabel;
    @FXML
    private VBox mTransactionListPane;
    private int num;
    private String currentPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Node [] nodes = new Node[5];
        for (int i = 0; i< nodes.length; i++)
        {
            try {
                nodes[i] = (Node) FXMLLoader.load(getClass().getResource("../Views/Items/TransactionItem.fxml"));
                mTransactionListPane.getChildren().add(nodes[i]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void changePane(ActionEvent event)
    {
        if(event.getSource() == mAccountBtn)
        {
            mAccountPane.toFront();
            currentPane = mAccountPane.getId();
        }
        if(event.getSource() == mCTBtn)
        {
            mCreateTransactionPane.toFront();
            currentPane = mCreateTransactionPane.getId();
        }
        if(event.getSource() == mTDBtn)
        {
            mTransactionDataPane.toFront();
            currentPane = mTransactionDataPane.getId();
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
