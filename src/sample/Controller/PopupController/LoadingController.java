package sample.Controller.PopupController;

import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class LoadingController implements Initializable {
    @FXML
    private Circle mLoadingCircle;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setRotate(mLoadingCircle,true,360,5);
    }
    private void setRotate(Circle loadingCircle, boolean reverse, int angle, int duration)
    {
        RotateTransition rotateTransition = new RotateTransition(Duration.seconds(duration),loadingCircle);
        rotateTransition.setAutoReverse(reverse);
        rotateTransition.setByAngle(angle);
        rotateTransition.setCycleCount(25);
        rotateTransition.play();
    }
}
