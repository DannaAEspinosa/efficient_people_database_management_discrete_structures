package controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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

public class MenuBarController {

	private Main main;
	private Stage currentStage;

	public MenuBarController() {

	}

	@FXML
	void addPerson(ActionEvent event) {
		

	}

	@FXML
	void deletePerson(ActionEvent event) {

	}

	@FXML
	void generateData(ActionEvent event) {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;

			root = (BorderPane) loader.load();

			MenuBarController controller = loader.getController();

			// controller.setMain(this);

			Scene scene = new Scene(root, 791, 555);
			Stage stage = new Stage();
			stage.setScene(scene);

			currentStage = stage;
			currentStage.close();

			BorderPane generateData;
			FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/generateData.fxml"));

			BorderPane root_2 = (BorderPane) loader_2.load();

			GenerateDataController controller2 = loader_2.getController();
			// GenerateDataController controller2 = loader_2.getController();

			// controller2.setMain(this);

			generateData = (BorderPane) stage.getScene().getRoot();
			
			generateData.setCenter(root_2);
			//
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@FXML
	void searchByCode(ActionEvent event) {

	}

	@FXML
	void searchByFullName(ActionEvent event) {

	}

	@FXML
	void searchByLastName(ActionEvent event) {

	}

	@FXML
	void searchByName(ActionEvent event) {

	}

	@FXML
	void updatePerson(ActionEvent event) {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;

			root = (BorderPane) loader.load();

			MenuBarController controller = loader.getController();

		

			Scene scene = new Scene(root, 791, 557);
			Stage stage = new Stage();
			stage.setScene(scene);

			currentStage = stage;
			currentStage.close();

			BorderPane updatePerson;
			FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/updatePersonWindow.fxml"));

			BorderPane root_2 = (BorderPane) loader_2.load();

			updatePersonController controller2 = loader_2.getController();
			// GenerateDataController controller2 = loader_2.getController();

			// controller2.setMain(this);

			updatePerson = (BorderPane) stage.getScene().getRoot();
			
			updatePerson.setCenter(root_2);
			//
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void setMain(Main main2) {
		this.main = main2;
	}

}
