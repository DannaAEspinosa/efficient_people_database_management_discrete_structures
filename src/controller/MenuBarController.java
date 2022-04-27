package controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MenuBarController {

	private Main main;

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

	public void setMain(Main main) {
		this.main = main;
	}
}
