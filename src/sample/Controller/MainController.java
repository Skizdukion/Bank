package sample.Controller;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sample.Models.TransactionModel;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
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

    @FXML
    private ComboBox mTransactionTypeCB;

    @FXML
    private ComboBox mFilterTypeCB;

    ObservableList<String> transactionTypeList = FXCollections.observableArrayList("Withdrawal","Transfer","Deposit","Payment","None");
    ObservableList<String> filterTypeList = FXCollections.observableArrayList("Date Time","Amount");

    private TransactionModel model;

    private ItemController itemController;

    private String currentPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mTransactionTypeCB.setValue("None");
        mTransactionTypeCB.setItems(transactionTypeList);
        mFilterTypeCB.setValue("Date Time");
        mFilterTypeCB.setItems(filterTypeList);
        Node [] nodes = new Node[10];
        for (int i = 0; i< nodes.length; i++)
        {
            try {
                Random rand = new Random(); //instance of random class
                int upperbound = 899999;
                int int_random = rand.nextInt(upperbound) + 100000;
                model = new TransactionModel(int_random + "", "Withdrawal", "999,999,000$", "20/11/2020", "#015", "676209", "");
                itemController.initModel(model);
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
