package projectap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;

public class PayController implements Initializable {
    @FXML
    private Text Pay;
    @FXML
    private Button BtCancel;
    @FXML
    private Button BtConfirm;
    @FXML
    private RadioButton RnPay;
    @FXML
    private RadioButton RnMaster;
    @FXML
    private Text TexMobile;
    @FXML
    private Button BtBack;
    @FXML
    private RadioButton RnCash;
    @FXML
    private ToggleGroup pays;
    @FXML
    private TextField ourPaypal;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ourPaypal.setDisable(true);
    }

    @FXML
    private void ToCart(ActionEvent event) throws IOException {
        BtCancel.getScene().getWindow().hide();
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Cart.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        Image AppIcon = new Image("/img/AppIcon.png");
        stage.getIcons().add(AppIcon);
        stage.setTitle("Customer Cart");
        stage.show();
    }

    @FXML
    private void Confirm(ActionEvent event) throws IOException {
        }

    @FXML
    private void backToMain(ActionEvent event) throws IOException {
        BtBack.getScene().getWindow().hide();
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setAlwaysOnTop(true);
        stage.setResizable(false);
        Image AppIcon = new Image("/img/AppIcon.png");
        stage.getIcons().add(AppIcon);
        stage.setTitle("Customer STORE HOME");
        stage.show();
    }

    @FXML
    private void CreditCard(ActionEvent event) {
    }

    @FXML
    private void PayPal(ActionEvent event) {
    }

}
