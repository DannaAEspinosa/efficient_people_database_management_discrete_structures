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
		main.addPerson();
	}

	@FXML
	void generateData(ActionEvent event) {
		main.generateData();

	}

	@FXML
	void searchByCode(ActionEvent event) {
		main.searchByCode();
	}

	@FXML
	void searchByFullName(ActionEvent event) {
		main.searchByFullName();
	}

	@FXML
	void searchByLastName(ActionEvent event) {
		main.searchByLastName();
	}

	@FXML
	void searchByName(ActionEvent event) {
		main.searchByName();

	}

	public void setMain(Main main2) {
		this.main = main2;
	}

}
