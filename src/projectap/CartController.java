/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hind
 */
public class CartController implements Initializable {

    @FXML
    private Button BtPay;
    @FXML
    private Button BtBack;
    @FXML
    private Text TexCart;
    @FXML
    private ListView<?> LiVItem;
    @FXML
    private Text OrderNm;
    @FXML
    private ImageView Imj;
    @FXML
    private Label LbPrice;
    @FXML
    private Text Img;
    @FXML
    private Text Price;
    @FXML
    private Text Total;
    @FXML
    private Label LbOrderNm;
    @FXML
    private Label LbTotal;
    @FXML
    private Text TexMobile;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
    private void toPay(ActionEvent event) throws IOException {
        BtPay.getScene().getWindow().hide();
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Pay.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        Image AppIcon = new Image("/img/AppIcon.png");
        stage.getIcons().add(AppIcon);
        stage.setTitle("Customer Payment");
        stage.show();
    }

}
