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
    
    @FXML
    void searchByName(ActionEvent event) {

    }

    @FXML
    void updatePerson(ActionEvent event) {

    }



	public void setMain(Main main) {
		this.main = main;
	}

	

	
}
