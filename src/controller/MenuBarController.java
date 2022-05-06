package controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class MenuBarController {

	private Main main;

	public MenuBarController() {

	}
	
	
	
	@FXML
	void goHome(ActionEvent event) {
		main.intialView();
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
		main.newSearchByName();

	}

	public void setMain(Main main2) {
		this.main = main2;
	}

}
