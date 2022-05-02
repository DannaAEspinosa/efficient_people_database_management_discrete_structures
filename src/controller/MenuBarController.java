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

			generateData = (BorderPane) stage.getScene().getRoot();

			generateData.setCenter(root_2);
			// Icon y titulo de la ventana
			currentStage.getIcons().add(new Image("/img/portrait-free-icon-font.png"));
			currentStage.setTitle("Base Data S.A | Generate Data");
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@FXML
	void searchByCode(ActionEvent event) {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;

			root = (BorderPane) loader.load();

			MenuBarController controller = loader.getController();

			Scene scene = new Scene(root, 791, 556);
			Stage stage = new Stage();
			stage.setScene(scene);

			currentStage = stage;
			currentStage.close();

			BorderPane searchByCode;
			FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/searchByCodeWindow.fxml"));

			BorderPane root_2 = (BorderPane) loader_2.load();

			searchByCodeController controller2 = loader_2.getController();

			searchByCode = (BorderPane) stage.getScene().getRoot();

			searchByCode.setCenter(root_2);

			currentStage.getIcons().add(new Image("/img/search-free-icon-font.png"));
			currentStage.setTitle("Base Data S.A | Search By Code");

			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	void searchByFullName(ActionEvent event) {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;

			root = (BorderPane) loader.load();

			MenuBarController controller = loader.getController();

			Scene scene = new Scene(root, 791, 556);
			Stage stage = new Stage();
			stage.setScene(scene);

			currentStage = stage;
			currentStage.close();

			BorderPane searchByFullName;
			FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/searchByFullNameWindow.fxml"));

			BorderPane root_2 = (BorderPane) loader_2.load();

			searchByFullNameController controller2 = loader_2.getController();

			searchByFullName = (BorderPane) stage.getScene().getRoot();

			searchByFullName.setCenter(root_2);

			currentStage.getIcons().add(new Image("/img/search-free-icon-font.png"));
			currentStage.setTitle("Base Data S.A | Search By Full Name");

			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	void searchByLastName(ActionEvent event) {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;

			root = (BorderPane) loader.load();

			MenuBarController controller = loader.getController();

			Scene scene = new Scene(root, 791, 556);
			Stage stage = new Stage();
			stage.setScene(scene);

			currentStage = stage;
			currentStage.close();

			BorderPane searchByLastName;
			FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/searchByLastNameWindow.fxml"));

			BorderPane root_2 = (BorderPane) loader_2.load();

			searchByLastNameController controller2 = loader_2.getController();

			searchByLastName = (BorderPane) stage.getScene().getRoot();

			searchByLastName.setCenter(root_2);

			currentStage.getIcons().add(new Image("/img/search-free-icon-font.png"));
			currentStage.setTitle("Base Data S.A | Search By Last Name");

			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	void searchByName(ActionEvent event) {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;

			root = (BorderPane) loader.load();

			MenuBarController controller = loader.getController();

			Scene scene = new Scene(root, 791, 556);
			Stage stage = new Stage();
			stage.setScene(scene);

			currentStage = stage;
			currentStage.close();

			BorderPane searchByName;
			FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/searchByNameWindow.fxml"));

			BorderPane root_2 = (BorderPane) loader_2.load();

			searchByNameController controller2 = loader_2.getController();

			searchByName = (BorderPane) stage.getScene().getRoot();

			searchByName.setCenter(root_2);

			currentStage.getIcons().add(new Image("/img/search-free-icon-font.png"));
			currentStage.setTitle("Base Data S.A | Search By Name");

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
