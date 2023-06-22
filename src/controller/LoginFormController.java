package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class LoginFormController {

    public AnchorPane rootLoginForm;

    public void lblCreateAccountOnMouseClicked(MouseEvent mouseEvent) throws IOException {

//        Parent parent = FXMLLoader.load(this.getClass().getResource("../view/CreateNewAccountForm.fxml"));
//        Scene scene = new Scene(parent);

        Stage primaryStage = (Stage) rootLoginForm.getScene().getWindow();
        primaryStage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("../view/CreateNewAccountForm.fxml"))));
        primaryStage.setTitle("Register Form");


    }
}
