package sample.Views.SideScene.TransactionData;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import sample.Controller.ItemController;
import sample.Controller.LoginController;
import sample.Models.TransactionModel;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class TransactionDataController implements Initializable {

    @FXML
    private AnchorPane mTransactionDataPane;

    @FXML
    private VBox mTransactionListPane;

    @FXML
    private ComboBox mTransactionTypeCB;

    @FXML
    private ComboBox mFilterTypeCB;

    @FXML
    private ToggleGroup sortByFilter;

    private TransactionModel model;

    private ItemController itemController;

    ObservableList<String> transactionTypeList = FXCollections.observableArrayList("Withdrawal","Transfer","Deposit","Payment","None");

    ObservableList<String> filterTypeList = FXCollections.observableArrayList("Date Time","Amount");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        mTransactionTypeCB.setValue("None");
        mTransactionTypeCB.setItems(transactionTypeList);
        mFilterTypeCB.setValue("Date Time");
        mFilterTypeCB.setItems(filterTypeList);

        Node[] nodes = new Node[LoginController.transList.getLength()];

        for (int i = 0; i< nodes.length; i++)
        {
            try {
                itemController.initModel(LoginController.transList.getTransactionListInIndex(i));
                nodes[i] = (Node) FXMLLoader.load(getClass().getResource("../../Items/TransactionItem.fxml"));
                mTransactionListPane.getChildren().add(nodes[i]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
