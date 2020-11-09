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
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HsQ Galaxy Book
 */
public class OrdersController implements Initializable {

    @FXML
    private Hyperlink btn_sHome;
    @FXML
    private Button btn_UProcess;
    @FXML
    private Button btn_Wait;
    @FXML
    private Button btn_Cancel;
    @FXML
    private Button btn_Ready;
    @FXML
    private TableView<?> table_Order;
    @FXML
    private Button btn_CreateO;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
    private void OUnderProcess(ActionEvent event) {
    }

    @FXML
    private void OWait_Hold(ActionEvent event) {
    }

    @FXML
    private void OCancel(ActionEvent event) {
    }

    @FXML
    private void OReady(ActionEvent event) {
    }

    @FXML
    private void OCreateOrder(ActionEvent event) throws IOException {
        btn_CreateO.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("CreateOrder.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        Image AppIcon = new Image("/img/AppIcon.png");
        stage.getIcons().add(AppIcon);
        stage.setTitle("Create a New Order");
        stage.setScene(scene);
        stage.show();
    }

}
