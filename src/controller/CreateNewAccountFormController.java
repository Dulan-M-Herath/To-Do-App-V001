package controller;

import db.DBConnection;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.sql.Connection;

public class CreateNewAccountFormController {
    public PasswordField txtNewPassword;
    public PasswordField txtConfirmPassword;
    public Label lblPasswordDoesntMatch1;
    public Label lblPasswordDoesntMatch2;
    public AnchorPane rootCreateNewAccountForm;
    public TextField txtUsername;
    public TextField txtEmail;
    public Button btnRegister;

    public void initialize(){

        passwordDoesntMatchLable(false);
        displayFields(true);
    }

    public void btnRegisterOnAction(ActionEvent actionEvent) {
        String newPassword =  txtNewPassword.getText();
        String confirmPassword = txtConfirmPassword.getText();

        if(newPassword.equals(confirmPassword)){
            txtNewPassword.setStyle("-fx-border-color: transparent");
            passwordDoesntMatchLable(false);
        }else {
            txtNewPassword.setStyle("-fx-border-color: red");
            txtNewPassword.requestFocus();

            passwordDoesntMatchLable(true);
        }
    }

    public void passwordDoesntMatchLable(boolean state){
        lblPasswordDoesntMatch1.setVisible(state);
        lblPasswordDoesntMatch2.setVisible(state);
    }

    public void btnAddNewUser(ActionEvent actionEvent) {
        displayFields(false);
        txtUsername.requestFocus();

        Connection connection = DBConnection.getInstance().getConnection();
        System.out.println(connection);
    }

    public void displayFields(boolean state){
        txtUsername.setDisable(state);
        txtEmail.setDisable(state);
        txtNewPassword.setDisable(state);
        txtConfirmPassword.setDisable(state);
        btnRegister.setDisable(state);

    }
}
