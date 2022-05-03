package application;

import java.io.IOException;

import controller.InitialViewController;
import controller.MenuBarController;
import enumerations.Nationality;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Controller;
import model.Person;
import model.PersonData;

public class Main extends Application {

	private Stage currentStage;

	private Controller controller;

	@Override
	public void start(Stage primaryStage) {
		controller = new Controller();
		
		try {
			generateData();
		}catch(Exception e){
			e.printStackTrace();
		}
		currentStage.getIcons().add(new Image("/img/superpoblacion.png"));
		currentStage.setTitle("Base Data S.A");
		
		
		
		
	}

	public static void main(String[] args) {
		launch(args);
		
		PersonData prueba = new PersonData();
		
		PersonData.data.add(new Person("Danna","Espinosa",18,15.4,"A00378613",1));
		PersonData.data.add(new Person("Daniel","Erazo",19,15.5,"A00378614",4));

	}

	public void generateData() {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;

			root = (BorderPane) loader.load();
			
			MenuBarController controller = loader.getController();
			
			controller.setMain(this);
			
			Scene scene= new Scene(root,791,557);
			Stage stage = new Stage();
			stage.setScene(scene);
			
			
			currentStage = stage;
			currentStage.close();
			
			BorderPane initialView;
			FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/InitialView.fxml"));
			
			BorderPane root_2=(BorderPane) loader_2.load();
			
			InitialViewController controller2 = loader_2.getController();
			//GenerateDataController controller2 = loader_2.getController();
			
			controller2.setMain(this);
			
			initialView= (BorderPane)stage.getScene().getRoot();
			
			
			
			//
			Image img = new Image("/img/img_main_5.png");
	        BackgroundImage bImg = new BackgroundImage(img,
	                                                   BackgroundRepeat.NO_REPEAT,
	                                                   BackgroundRepeat.NO_REPEAT,
	                                                   BackgroundPosition.DEFAULT,
	                                                   BackgroundSize.DEFAULT);
	        Background bGround = new Background(bImg);
	        root.setBackground(bGround);
	        
	        initialView.setCenter(root_2);
			//
			stage.show();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
