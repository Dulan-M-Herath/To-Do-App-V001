package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class CreateNewAccountFormController {
    public PasswordField txtNewPassword;
    public PasswordField txtConfirmPassword;
    public Label lblPasswordDoesntMatch1;
    public Label lblPasswordDoesntMatch2;

    public void initialize(){
        passwordDoesntMatchLable(false);
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
}
