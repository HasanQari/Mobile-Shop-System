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
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HsQ Galaxy Book
 */
public class SellerHomeController implements Initializable {

    @FXML
    private Hyperlink btn_Logout;
    @FXML
    private Button btn_Add_New_Item;
    @FXML
    private Button btn_Orders;
    @FXML
    private Button btn_Reports;
    @FXML
    private Button btn_NewOrder;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void Logout(ActionEvent event) throws IOException {
        btn_Logout.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        Image AppIcon = new Image("/img/AppIcon.png");
        stage.getIcons().add(AppIcon);
        stage.setTitle("Seller Man Login");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void Add_New_Item(ActionEvent event) throws IOException {
        btn_Add_New_Item.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("AddItem.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        Image AppIcon = new Image("/img/AppIcon.png");
        stage.getIcons().add(AppIcon);
        stage.setTitle("Add a New Item to Store");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void Orders(ActionEvent event) throws IOException {
        btn_Orders.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("Orders.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        Image AppIcon = new Image("/img/AppIcon.png");
        stage.getIcons().add(AppIcon);
        stage.setTitle("The Orders");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void Reports(ActionEvent event) throws IOException {
        btn_Reports.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("Report_P_info.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        Image AppIcon = new Image("/img/AppIcon.png");
        stage.getIcons().add(AppIcon);
        stage.setTitle("Reports and Product Information");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void newOrder(ActionEvent event) throws IOException {
        btn_NewOrder.getScene().getWindow().hide();
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
