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
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HsQ Galaxy Book
 */
public class Report_P_infoController implements Initializable {

    @FXML
    private Hyperlink btn_sHome;
    @FXML
    private ListView<?> lv_ProductList;
    @FXML
    private Label lbl_Tprofit;
    @FXML
    private Label lbl_Titem;
    @FXML
    private Label lbl_TnewItem;
    @FXML
    private ListView<?> lv_TopSelling;

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

}
