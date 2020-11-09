package projectap;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class SwitcherController implements Initializable {

    public Button newBTN;
    @FXML
    private Button btn_SSide;
    @FXML
    private Button btn_CSide;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void SellerSide(ActionEvent event) throws IOException {
        btn_SSide.getScene().getWindow().hide();
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        Image AppIcon = new Image("/img/AppIcon.png");
        stage.getIcons().add(AppIcon);
        stage.setTitle("Seller Man Login");
        stage.show();
    }

    @FXML
    private void CustomerSide(ActionEvent event) throws IOException {
        btn_CSide.getScene().getWindow().hide();
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        Image AppIcon = new Image("/img/AppIcon.png");
        stage.getIcons().add(AppIcon);
        stage.setTitle("Customer HOME PAGE OF STORE");
        stage.setScene(scene);
        stage.show();
    }

    public void qaz(ActionEvent event) {

    }
}
