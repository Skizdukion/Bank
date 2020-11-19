package sample.Controller;

import com.jfoenix.controls.JFXToggleButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXPasswordField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Main;

import java.io.IOException;

public class LoginController {
    @FXML
    private JFXTextField mLoginID;
    @FXML
    private JFXPasswordField mLoginPassWord;
    @FXML
    private JFXToggleButton mToggleRoles;

    public void Login(ActionEvent event)
    {
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        if (mToggleRoles.isSelected())
//        {
//            alert.setContentText("Invalid email");
//        }
//        else
//        {
//            alert.setContentText("Invalid card number");
//        }
//        alert.show();
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
}
