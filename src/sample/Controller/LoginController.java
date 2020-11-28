package sample.Controller;

import com.jfoenix.controls.JFXToggleButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXPasswordField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Main;
import sample.Models.TransactionList;
import sample.Models.UserModel;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private JFXTextField mLoginID;
    @FXML
    private JFXPasswordField mLoginPassWord;
    @FXML
    private JFXToggleButton mToggleRoles;

    public static UserModel userData;

    public static TransactionList transList;

    public void Login(ActionEvent event)
    {
        //kiem tra dang nhap, init data vao` model o day.
        userData = new UserModel("281100","rider993sinus@gmail.com","Pham Thang Long","281221581","0982481842","Fuck u","28/11/2000","20000","123697456123","******","20/11/2020");
        //nen init ca danh sach transaction nua~.
        transList = new TransactionList(10);
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../Views/MainScene.fxml"));
            Stage stage = (Stage) mLoginID.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }
    public void Toggle(ActionEvent event)
    {
        if (mToggleRoles.isSelected()) {
            mToggleRoles.setText("Bank Employee");
            mLoginID.setPromptText("Email:");
            mLoginPassWord.setPromptText("Password:");
        }
        else
        {
            mToggleRoles.setText("Customer");
            mLoginID.setPromptText("Card No:");
            mLoginPassWord.setPromptText("PIN:");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
