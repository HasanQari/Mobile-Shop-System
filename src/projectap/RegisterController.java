package projectap;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RegisterController implements Initializable {

    @FXML
    private TextField lbl_Username;
    @FXML
    private PasswordField pass_Password;
    @FXML
    private TextField lbl_Name;
    @FXML
    private PasswordField pass_PIN;
    @FXML
    private Button btn_Reg;

    UserData RegData = new UserData();
    JFrame RegisterMessageframe;

    @FXML
    private Hyperlink link_BTlogin;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void Register() throws Exception {
        RegisterMessageframe = new JFrame();

        if (lbl_Username.getText().isEmpty() || pass_Password.getText().isEmpty() || lbl_Name.getText().isEmpty() || pass_PIN.getText().isEmpty()) {
            JOptionPane.showMessageDialog(RegisterMessageframe, "The field is Empty", "Registration", JOptionPane.WARNING_MESSAGE);
        } else if (!"0000".equals(pass_PIN.getText())) {
            JOptionPane.showMessageDialog(RegisterMessageframe, "The PIN isn't Correct !", "Registration", JOptionPane.WARNING_MESSAGE);
        } else {
            RegData.RegUser(lbl_Name.getText(), lbl_Username.getText(), pass_Password.getText());
            JOptionPane.showMessageDialog(RegisterMessageframe, "The Registration Is Complete \n       THANK YOU !",
                    "Registration", JOptionPane.WARNING_MESSAGE);
            btn_Reg.getScene().getWindow().hide();
            Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            Image AppIcon = new Image("/img/AppIcon.png");
            stage.getIcons().add(AppIcon);
            stage.setTitle("Seller Man Login");
            stage.setScene(scene);
            stage.show();
        }
    }

    @FXML
    private void BackToLogin() throws IOException {
        link_BTlogin.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        Image AppIcon = new Image("/img/AppIcon.png");
        stage.getIcons().add(AppIcon);
        stage.setTitle("Seller Man Login Data");
        stage.setScene(scene);
        stage.show();
    }

}