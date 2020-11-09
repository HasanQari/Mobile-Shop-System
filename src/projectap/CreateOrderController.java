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
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HsQ Galaxy Book
 */
public class CreateOrderController implements Initializable {

    @FXML
    private TextField txf_bySearch;
    @FXML
    private TableView<?> table_viewProduct;
    @FXML
    private TextField txf_bySrial;
    @FXML
    private Button btn_AddToCart;
    @FXML
    private ListView<?> lv_Bill;
    @FXML
    private Label lbl_TotalAmount;
    @FXML
    private Button btn_sCheckout;
    @FXML
    private Hyperlink btn_sHome;
    @FXML
    private Hyperlink btn_sBack;
    @FXML
    private TextField txf_bySrial1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AddToCart(ActionEvent event) {
    }

    @FXML
    private void sCheckout(ActionEvent event) {
    }

    @FXML
    private void sHome(ActionEvent event) throws IOException {
        btn_sHome.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("SellerHome.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        Image AppIcon = new Image("/img/AppIcon.png");
        stage.getIcons().add(AppIcon);
        stage.setTitle("Seller Home Page");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void sBack(ActionEvent event) throws IOException {
        btn_sBack.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("Orders.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        Image AppIcon = new Image("/img/AppIcon.png");
        stage.getIcons().add(AppIcon);
        stage.setTitle("The Orders");
        stage.setScene(scene);
        stage.show();
    }
    
}
