package application;

import java.io.IOException;

import controller.GenerateDataController;
import controller.InitialViewController;
import controller.MenuBarController;
import controller.addPersonController;
import controller.searchByCodeController;
import controller.searchByFullNameController;
import controller.searchByLastNameController;
import controller.searchByNameController;
import controller.updatePersonController;
import controller.viewDataController;
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

public class Main extends Application {

	private Stage currentStage;

	private Controller controller;

	@Override
	public void start(Stage primaryStage) {
		controller = new Controller();

		try {
			intialView();
		} catch (Exception e) {
			e.printStackTrace();
		}
		currentStage.getIcons().add(new Image("/img/superpoblacion.png"));
		currentStage.setTitle("Base Data S.A");

	}

	public static void main(String[] args) {
		launch(args);

	}

	public boolean toGenerateDate(int numDates) {
		long startTime = System.currentTimeMillis();
		controller.toCreatePerson(numDates);
		long endTime = System.currentTimeMillis() - startTime;
		System.out.println("end: " + endTime);
		// System.out.println("Guardo");
		return true;
	}

	// Abre interfaz generateData
	public void generateData() {
		try {

			currentStage.close();

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;

			root = (BorderPane) loader.load();

			MenuBarController controller = loader.getController();
			controller.setMain(this);

			Scene scene = new Scene(root, 791, 555);
			Stage stage = new Stage();
			stage.setScene(scene);

			currentStage = stage;
			currentStage.close();

			BorderPane generateData;
			FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/generateData.fxml"));

			BorderPane root_2 = (BorderPane) loader_2.load();

			GenerateDataController controller2 = loader_2.getController();
			controller2.setMain(this);

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

	// Abre interfaz addPerson
	public void addPerson() {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;

			root = (BorderPane) loader.load();

			MenuBarController controller = loader.getController();

			controller.setMain(this);

			Scene scene = new Scene(root, 791, 555);
			Stage stage = new Stage();
			stage.setScene(scene);

			currentStage = stage;
			currentStage.close();

			BorderPane addPerson;
			FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/addPersonWindow.fxml"));

			BorderPane root_2 = (BorderPane) loader_2.load();

			addPersonController controller2 = loader_2.getController();

			controller2.setMain(this);

			addPerson = (BorderPane) stage.getScene().getRoot();

			addPerson.setCenter(root_2);
			// Icon y titulo de la ventana
			currentStage.getIcons().add(new Image("/img/user-add-free-icon-font.png"));
			currentStage.setTitle("Base Data S.A | Add Person");
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void searchByCode() {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;

			root = (BorderPane) loader.load();

			MenuBarController controller = loader.getController();
			controller.setMain(this);
			Scene scene = new Scene(root, 791, 556);
			Stage stage = new Stage();
			stage.setScene(scene);

			currentStage = stage;
			currentStage.close();

			BorderPane searchByCode;
			FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/searchByCodeWindow.fxml"));

			BorderPane root_2 = (BorderPane) loader_2.load();

			searchByCodeController controller2 = loader_2.getController();
			controller2.setMain(this);
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

	public void searchByFullName() {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;

			root = (BorderPane) loader.load();

			MenuBarController controller = loader.getController();
			controller.setMain(this);
			Scene scene = new Scene(root, 791, 556);
			Stage stage = new Stage();
			stage.setScene(scene);

			currentStage = stage;
			currentStage.close();

			BorderPane searchByFullName;
			FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/searchByFullNameWindow.fxml"));

			BorderPane root_2 = (BorderPane) loader_2.load();

			searchByFullNameController controller2 = loader_2.getController();

			controller2.setMain(this);
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

	public void searchByLastName() {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;

			root = (BorderPane) loader.load();

			MenuBarController controller = loader.getController();
			controller.setMain(this);
			Scene scene = new Scene(root, 791, 556);
			Stage stage = new Stage();
			stage.setScene(scene);

			currentStage = stage;
			currentStage.close();

			BorderPane searchByLastName;
			FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/searchByLastNameWindow.fxml"));

			BorderPane root_2 = (BorderPane) loader_2.load();

			searchByLastNameController controller2 = loader_2.getController();
			controller2.setMain(this);
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

	public void searchByName() {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;

			root = (BorderPane) loader.load();

			MenuBarController controller = loader.getController();
			controller.setMain(this);
			Scene scene = new Scene(root, 791, 556);
			Stage stage = new Stage();
			stage.setScene(scene);

			currentStage = stage;
			currentStage.close();

			BorderPane searchByName;
			FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/searchByNameWindow.fxml"));

			BorderPane root_2 = (BorderPane) loader_2.load();

			searchByNameController controller2 = loader_2.getController();
			controller2.setMain(this);
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

	// Abre interfaz initialView
	public void intialView() {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;

			root = (BorderPane) loader.load();

			MenuBarController controller = loader.getController();

			controller.setMain(this);

			Scene scene = new Scene(root, 791, 557);
			Stage stage = new Stage();
			stage.setScene(scene);

			currentStage = stage;
			currentStage.close();

			BorderPane initialView;
			FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/InitialView.fxml"));

			BorderPane root_2 = (BorderPane) loader_2.load();

			InitialViewController controller2 = loader_2.getController();
			// GenerateDataController controller2 = loader_2.getController();

			controller2.setMain(this);

			initialView = (BorderPane) stage.getScene().getRoot();

			//
			Image img = new Image("/img/img_main_5.png");
			BackgroundImage bImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
					BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
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

	public void viewData() {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;

			root = (BorderPane) loader.load();

			MenuBarController controller = loader.getController();
			controller.setMain(this);
			Scene scene = new Scene(root, 791, 556);
			Stage stage = new Stage();
			stage.setScene(scene);

			currentStage = stage;
			currentStage.close();

			BorderPane viewData;
			FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/viewDataWindow.fxml"));

			BorderPane root_2 = (BorderPane) loader_2.load();

			viewDataController controller2 = loader_2.getController();
			controller2.setMain(this);
			viewData = (BorderPane) stage.getScene().getRoot();

			viewData.setCenter(root_2);

			currentStage.getIcons().add(new Image("/img/eye-free-icon-font.png"));
			currentStage.setTitle("Base Data S.A | View Data");

			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updatePerson() {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;

			root = (BorderPane) loader.load();

			MenuBarController controller = loader.getController();
			controller.setMain(this);
			Scene scene = new Scene(root, 791, 556);
			Stage stage = new Stage();
			stage.setScene(scene);

			currentStage = stage;
			currentStage.close();

			BorderPane updatePerson;
			FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/updatePersonWindow.fxml"));

			BorderPane root_2 = (BorderPane) loader_2.load();

			updatePersonController controller2 = loader_2.getController();
			controller2.setMain(this);
			updatePerson = (BorderPane) stage.getScene().getRoot();

			updatePerson.setCenter(root_2);

			currentStage.getIcons().add(new Image("/img/rotate-right-free-icon-font.png"));
			currentStage.setTitle("Base Data S.A | Update Data");

			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
