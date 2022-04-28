package application;

import java.io.IOException;

import controller.GenerateDataController;
import controller.MenuBarController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.Controller;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

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
			FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/generateData.fxml"));
			
			BorderPane root_2=(BorderPane) loader_2.load();
			
			GenerateDataController controller2 = loader_2.getController();
			
			controller2.setMain(this);
			
			initialView= (BorderPane)stage.getScene().getRoot();
			
			initialView.setCenter(root_2);
			
			//scene.setFill(Color.TRANSPARENT);
			//stage.initStyle(StageStyle.TRANSPARENT);
			
			stage.show();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
