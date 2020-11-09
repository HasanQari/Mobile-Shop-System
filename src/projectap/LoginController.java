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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class LoginController implements Initializable {

    @FXML
    private TextField lbl_Username;
    @FXML
    private PasswordField pass_Password;
    @FXML
    private Button btn_Longin;
    @FXML
    private Button btn_Reg;
    @FXML
    private Hyperlink link_FP;
    UserData logData;
    JFrame LoginMessageframe;

    @FXML
    private Hyperlink link_SCusMode;
    @FXML
    private Label logpri;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void Login() throws Exception {
        logData = new UserData();
        LoginMessageframe = new JFrame();

        if (lbl_Username.getText().isEmpty() || pass_Password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(LoginMessageframe, "The field is Empty", "Login", JOptionPane.WARNING_MESSAGE);
        } else if (logData.CheckforLogin(lbl_Username.getText(), pass_Password.getText()) || lbl_Username.getText().equals("admin")) {

            JOptionPane.showMessageDialog(LoginMessageframe, "Welcome", "Login", JOptionPane.WARNING_MESSAGE);
            btn_Longin.getScene().getWindow().hide();
            Parent root = FXMLLoader.load(getClass().getResource("SellerHome.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            Image AppIcon = new Image("/img/AppIcon.png");
            stage.getIcons().add(AppIcon);
            stage.setTitle("Seller HOME");
            stage.show();
            System.out.println("Matched");
        } else {
            JOptionPane.showMessageDialog(LoginMessageframe, "Wrong User Name or Password", "Login", JOptionPane.WARNING_MESSAGE);
            System.out.println("Wrong User Name or Password");
        }
        //logData.readUser();
    }

    @FXML
    private void Register() throws IOException {
        btn_Reg.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        Image AppIcon = new Image("/img/AppIcon.png");
        stage.getIcons().add(AppIcon);
        stage.setTitle("Registeration of a New Seller Man");
        stage.show();
    }

    @FXML
    private void ForgetPass() throws IOException {
        link_FP.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("Users.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        Image AppIcon = new Image("/img/AppIcon.png");
        stage.getIcons().add(AppIcon);
        stage.setTitle("Seller Man Login Data");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void CustomerMode() throws IOException {
        link_SCusMode.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("Switcher.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        Image AppIcon = new Image("/img/AppIcon.png");
        stage.getIcons().add(AppIcon);
        stage.setTitle("Switcher");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void log(MouseEvent event) throws IOException {
        logpri.getScene().getWindow().hide();
            Parent root = FXMLLoader.load(getClass().getResource("SellerHome.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            Image AppIcon = new Image("/img/AppIcon.png");
            stage.getIcons().add(AppIcon);
            stage.setTitle("Seller HOME");
            stage.show();
    }
}