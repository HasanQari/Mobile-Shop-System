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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private Button BtCart;
    @FXML
    private Text TexMobile;
    @FXML
    private TextField TfSearh;
    @FXML
    private Button backBtn;
    @FXML
    private Button btn_addEToCart;
    @FXML
    private Button btn_PhMo;
    @FXML
    private Button btn_samsung;
    @FXML
    private Button btn_Tab;
    @FXML
    private Button btn_google;
    @FXML
    private Button btn_apple;
    @FXML
    private Button btn_Hwa;
    @FXML
    private Button btn_nokkia;
    @FXML
    private Button btn_lg;
    @FXML
    private Button btn_asus;
    @FXML
    private Button btn_lenovo;
    @FXML
    private Button btn_honor;
    @FXML
    private Pane pane0;
    @FXML
    private ImageView Pimg0;
    @FXML
    private Label Pname0;
    @FXML
    private Label Pdesc0;
    @FXML
    private Label Pprice0;
    @FXML
    private Pane pane01;
    @FXML
    private ImageView Pimg01;
    @FXML
    private Label Pname01;
    @FXML
    private Label Pdesc01;
    @FXML
    private Label Pprice01;
    @FXML
    private Pane pane02;
    @FXML
    private ImageView Pimg02;
    @FXML
    private Label Pname02;
    @FXML
    private Label Pdesc02;
    @FXML
    private Label Pprice02;
    @FXML
    private Pane pane03;
    @FXML
    private ImageView Pimg03;
    @FXML
    private Label Pname03;
    @FXML
    private Label Pdesc03;
    @FXML
    private Label Pprice03;
    @FXML
    private Pane pane04;
    @FXML
    private ImageView Pimg04;
    @FXML
    private Label Pname04;
    @FXML
    private Label Pdesc04;
    @FXML
    private Label Pprice04;
    @FXML
    private Pane pane05;
    @FXML
    private ImageView Pimg05;
    @FXML
    private Label Pname05;
    @FXML
    private Label Pdesc05;
    @FXML
    private Label Pprice05;
    @FXML
    private Pane pane06;
    @FXML
    private ImageView Pimg06;
    @FXML
    private Label Pname06;
    @FXML
    private Label Pdesc06;
    @FXML
    private Label Pprice06;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void toCart(ActionEvent event) throws IOException {
        BtCart.getScene().getWindow().hide();
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Cart.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setAlwaysOnTop(true);
        Image AppIcon = new Image("/img/AppIcon.png");
        stage.getIcons().add(AppIcon);
        stage.setTitle("Customer Cart");
        stage.show();
    }

    @FXML
    private void addToCart(ActionEvent event) {
    }

    @FXML
    private void backToMain(ActionEvent actionEvent) throws IOException {
        backBtn.getScene().getWindow().hide();
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
    private void PhoneOrMobile(ActionEvent event) {
    }

    @FXML
    private void Samsung(ActionEvent event) {
    }

    @FXML
    private void TabletOrTab(ActionEvent event) {
    }

    @FXML
    private void Google(ActionEvent event) {
    }

    @FXML
    private void Apple(ActionEvent event) {
    }

    @FXML
    private void Huawi(ActionEvent event) {
    }

    @FXML
    private void Nokkia(ActionEvent event) {
    }

    @FXML
    private void LG(ActionEvent event) {
    }

    @FXML
    private void Asus(ActionEvent event) {
    }

    @FXML
    private void Lenovo(ActionEvent event) {
    }

    @FXML
    private void Honor(ActionEvent event) {
    }
}
