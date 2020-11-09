/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author HsQ Galaxy Book
 */
public class AddItemController implements Initializable {

    @FXML
    private Hyperlink btn_sHome;
    @FXML
    private TextField txf_DeviceName;
    @FXML
    private TextField txf_Quntity;
    @FXML
    private TextField txf_Price;
    @FXML
    private TextField txf_CPU;
    @FXML
    private TextField txf_GPU;
    @FXML
    private TextField txf_Brand;
    @FXML
    private TextField txf_Color;
    @FXML
    private TextField txf_RAM;
    @FXML
    private TextField txf_ROM;
    @FXML
    private TextField txf_Srial;
    @FXML
    private Button btn_ADD;

    UserData logData;
    JFrame ItamAddedMessageframe;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        logData = new UserData();
    }

    @FXML
    private void sHome(ActionEvent event) throws IOException {
        btn_sHome.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("SellerHome.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        Image AppIcon = new Image("/img/AppIcon.png");
        stage.getIcons().add(AppIcon);
        stage.setTitle("Seller Home");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void AddItem(ActionEvent event) throws Exception {
        logData.Additems(txf_DeviceName.getText(), txf_Quntity.getText(), txf_Price.getText(),
                txf_Brand.getText(), txf_Color.getText(), txf_CPU.getText(), txf_GPU.getText(),
                txf_RAM.getText(), txf_ROM.getText(), txf_Srial.getText());
        System.out.println("تم تسجيل المنتج بنجاح");
    }

    private Connection connect() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:sqlite:ProjectDB");
        System.out.println("The Connection established");
        return con;
    }
}
