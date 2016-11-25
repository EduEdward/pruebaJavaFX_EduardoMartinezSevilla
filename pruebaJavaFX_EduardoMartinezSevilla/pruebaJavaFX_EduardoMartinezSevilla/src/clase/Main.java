package clase;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

/***
 * El metodo main, donde se inicia la apicacion
 * @author edu__
 * @version 1.0
 * @see ControlFX
 */

public class Main extends Application {
	

	private AnchorPane rootLayout;
	public Stage primaryStage;
/***
 * El metodo start donde inicia el layout
 */
	@Override
	public void start(Stage primaryStage) {
		try {
			
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Profile");
			this.primaryStage.setX(200);
			this.primaryStage.setY(200);

			primaryStage.show();
			initRootLayout();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	/***
	 * El metodo initRootLayout donde carga el fxml de Profile con su stylesheet
	 */
	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("../vista/Profile.fxml"));
			rootLayout = (AnchorPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout, 600, 400);
			scene.getStylesheets().add(
					getClass().getResource("../vista/stylesheet.css").toExternalForm());
			
			//adding fonts
			scene.getStylesheets().add("http://fonts.googleapis.com/css?family=Shadows+Into+Light");           

			primaryStage.setScene(scene);
		

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/***
	 * Donde se lanza la aplicacion
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}