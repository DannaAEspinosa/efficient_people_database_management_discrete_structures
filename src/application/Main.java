package application;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import controller.SearchByNameViewController;
import controller.UpdatePersonViewController;
import controller.AddPersonController;
import controller.GenerateDataController;
import controller.InitialViewController;
import controller.MenuBarController;
import controller.SearchByCodeViewController;
import controller.SearchByFullNameViewController;
import controller.SearchByLastNameViewController;
import controller.updatePersonController;
import controller.viewDataController;
import enumerations.Gender;
import enumerations.Nationality;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

public class Main extends Application {

	private Stage currentStage;

	private Controller controller;

	@Override
	public void start(Stage primaryStage) {

		controller = new Controller();

		controller.loadJSON();

		try {
			intialView();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);

	}

	public void toGenerateDate(int numDates) {
		controller.toCreatePerson(numDates);
		// controller.showTree();
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

			Scene scene = new Scene(root, 791, 549);
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
			currentStage.setResizable(false);
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

			currentStage.close();

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;

			root = (BorderPane) loader.load();

			MenuBarController controller = loader.getController();
			controller.setMain(this);

			controller.setMain(this);

			Scene scene = new Scene(root, 791, 549);
			Stage stage = new Stage();
			stage.setScene(scene);

			currentStage = stage;
			currentStage.close();

			BorderPane addPerson;
			FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/AddPersonWindow.fxml"));

			BorderPane root_2 = (BorderPane) loader_2.load();

			AddPersonController controller2 = loader_2.getController();

			controller2.setMain(this);

			addPerson = (BorderPane) stage.getScene().getRoot();

			addPerson.setCenter(root_2);
			currentStage.setResizable(false);
			// Icon y titulo de la ventana
			currentStage.getIcons().add(new Image("/img/user-add-free-icon-font.png"));
			currentStage.setTitle("Base Data S.A | Add Person");
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void newSearchByName() {
		try {
			controller.loadJSON();
			currentStage.close();
			

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;

			root = (BorderPane) loader.load();

			MenuBarController controller = loader.getController();
			controller.setMain(this);
			Scene scene = new Scene(root, 900, 525);
			Stage stage = new Stage();
			stage.setScene(scene);

			currentStage = stage;
			currentStage.close();

			FXMLLoader loaderSBN = new FXMLLoader(getClass().getResource("../ui/searchByName.fxml"));
			BorderPane rootSBN = (BorderPane) loaderSBN.load();

			SearchByNameViewController controllerSBN = loaderSBN.getController();
			controllerSBN.setMain(this);

			BorderPane searchByName = (BorderPane) stage.getScene().getRoot();

			searchByName.setCenter(rootSBN);
			currentStage.setResizable(false);

			currentStage.getIcons().add(new Image("/img/search-free-icon-font.png"));
			currentStage.setTitle("Base Data S.A | Search By Name");

			stage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void searchByCode() {
		try {

			currentStage.close();

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;

			root = (BorderPane) loader.load();

			MenuBarController controller = loader.getController();
			controller.setMain(this);
			Scene scene = new Scene(root, 900, 525);
			Stage stage = new Stage();
			stage.setScene(scene);

			currentStage = stage;
			currentStage.close();

			BorderPane searchByCode;
			FXMLLoader loaderSBC = new FXMLLoader(getClass().getResource("../ui/searchByCode.fxml"));

			BorderPane rootSBC = (BorderPane) loaderSBC.load();

			SearchByCodeViewController controller2 = loaderSBC.getController();
			controller2.setMain(this);
			searchByCode = (BorderPane) stage.getScene().getRoot();

			searchByCode.setCenter(rootSBC);
			currentStage.setResizable(false);

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

			currentStage.close();

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;

			root = (BorderPane) loader.load();

			MenuBarController controller = loader.getController();
			controller.setMain(this);
			Scene scene = new Scene(root, 900, 525);
			Stage stage = new Stage();
			stage.setScene(scene);

			currentStage = stage;
			currentStage.close();

			BorderPane searchByFullName;
			FXMLLoader loaderSBFN = new FXMLLoader(getClass().getResource("../ui/searchByFullName.fxml"));

			BorderPane rootSBFN = (BorderPane) loaderSBFN.load();

			SearchByFullNameViewController controller2 = loaderSBFN.getController();

			controller2.setMain(this);
			searchByFullName = (BorderPane) stage.getScene().getRoot();

			searchByFullName.setCenter(rootSBFN);
			currentStage.setResizable(false);

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
			controller.loadJSON();
			currentStage.close();
			

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;

			root = (BorderPane) loader.load();

			MenuBarController controller = loader.getController();
			controller.setMain(this);
			Scene scene = new Scene(root, 900, 525);
			Stage stage = new Stage();
			stage.setScene(scene);

			currentStage = stage;
			currentStage.close();

			BorderPane searchByLastName;
			FXMLLoader loaderSBLN = new FXMLLoader(getClass().getResource("../ui/searchByLastName.fxml"));

			BorderPane rootSBLN = (BorderPane) loaderSBLN.load();

			SearchByLastNameViewController controllerSBLN = loaderSBLN.getController();
			controllerSBLN.setMain(this);
			searchByLastName = (BorderPane) stage.getScene().getRoot();

			searchByLastName.setCenter(rootSBLN);

			currentStage.getIcons().add(new Image("/img/search-free-icon-font.png"));
			currentStage.setTitle("Base Data S.A | Search By Last Name");

			stage.show();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Abre interfaz initialView
	public void intialView() {
		try {

			if (currentStage != null) {
				currentStage.close();
			}

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
			currentStage.setResizable(false);

			initialView = (BorderPane) stage.getScene().getRoot();
			currentStage.getIcons().add(new Image("/img/superpoblacion.png"));
			currentStage.setTitle("Base Data S.A");

			//
			Image img = new Image("/img/img_main_5.png");
			BackgroundImage bImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
					BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
			Background bGround = new Background(bImg);
			root.setBackground(bGround);

			initialView.setCenter(root_2);
			currentStage.setResizable(false);
			//
			stage.show();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void viewData(Person personClicked) {
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
			String name = personClicked.getName();
			String lastName = personClicked.getLastName();
			String fullName = personClicked.getFullName();
			String id = personClicked.getId();
			String gender = String.valueOf(personClicked.getGender());
			String nationality = String.valueOf(personClicked.getCountry());
			String age = String.valueOf(personClicked.getAge());
			String height = String.valueOf(personClicked.getHeight());
			String birthDay = String.valueOf(personClicked.getBirthDayDate());
			String urlImage = personClicked.getImagePath();

			if (urlImage.equals("")) {
				urlImage = "/photos/AdultaFemenino3.jpg";
			}

			loader_2.setController(new viewDataController(name, lastName, fullName, id, gender, nationality, age,
					height, birthDay, urlImage));
			BorderPane root_2 = (BorderPane) loader_2.load();

			viewDataController controller2 = loader_2.getController();
			controller2.setMain(this);
			viewData = (BorderPane) stage.getScene().getRoot();

			viewData.setCenter(root_2);
			currentStage.setResizable(false);

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

			currentStage.close();

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;

			root = (BorderPane) loader.load();

			MenuBarController controller = loader.getController();
			controller.setMain(this);
			Scene scene = new Scene(root, 900, 525);
			Stage stage = new Stage();
			stage.setScene(scene);

			currentStage = stage;
			currentStage.close();

			BorderPane searchByLastName;

			FXMLLoader loaderSBLN = new FXMLLoader(getClass().getResource("../ui/UpdatePerson.fxml"));

			BorderPane rootSBLN = (BorderPane) loaderSBLN.load();

			UpdatePersonViewController controllerSBLN = loaderSBLN.getController();

			controllerSBLN.setMain(this);
			searchByLastName = (BorderPane) stage.getScene().getRoot();

			searchByLastName.setCenter(rootSBLN);

			currentStage.getIcons().add(new Image("/img/search-free-icon-font.png"));
			currentStage.setTitle("Base Data S.A | Search By Last Name");

			stage.show();

			currentStage.getIcons().add(new Image("/img/rotate-right-free-icon-font.png"));
			currentStage.setTitle("Base Data S.A | Update Data");

			// stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addPerson(String name, String lastName, String fullName, int age, int height, String id,
			Nationality nationalityString, Gender gender, String imagePath, LocalDate doB) {
		controller.addPerson(name, lastName, fullName, age, height, id, nationalityString, gender, imagePath, doB);
	}

	// type = 1 --> search by name

	public ObservableList<Person> refreshData(String input, int id) {

		controller.setNullList();

		ObservableList<Person> aux = FXCollections.observableArrayList();
		;

		ArrayList<Person> temp = controller.getListOfPeople(input, id);

		for (int i = 0; i < temp.size(); i++) {
			aux.add(temp.get(i));
		}

		return aux;
	}

	public boolean thereArePeopleInSystem() {
		return controller.thereArePeopleRegistered();
	}

}
