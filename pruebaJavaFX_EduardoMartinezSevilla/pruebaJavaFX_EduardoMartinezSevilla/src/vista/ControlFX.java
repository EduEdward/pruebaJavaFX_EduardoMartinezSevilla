package vista;

import java.io.IOException;

import clase.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/***
 * El controlador de toda la app
 * @author edu__
 * @version 1.0
 */

public class ControlFX {
	@FXML
	private ImageView imageRaw;

    private Main mainApp;

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
/***
 * Le mandamos cargar el segundo archivo fxml al dar en el boton y crea la nueva stage
 */
    public void showSendProfile() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../vista/Send.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("Send");
            Scene scene = new Scene(page);
            sendStage.setScene(scene);

            
            sendStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /***
     * Handlesend el metodo para que vaya a la segunda stage
     */
    @FXML
    private void handleSend() {
    	showSendProfile();
    }
    /***
     * handleClose el metodo que sirve para que salga de la app
     */
    @FXML
    private void handleClose() {
   	        System.exit(0);
    }
}
