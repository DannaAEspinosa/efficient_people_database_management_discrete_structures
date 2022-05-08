package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.PersonData;

public class searchByFullNameController<T> implements Initializable{
	
	private Main main;
	

	public void setMain(Main main) {
		this.main = main;
	}
	private Stage currentStage;
	
	private PersonData psClicked;
	
	 @FXML
	    private TableView<T> TableViewFullName;

	    @FXML
	    private TableColumn<T, T> fullNameFull;
		@FXML
		private TextField fullNameTF;

	    @FXML
	    private Button updateBTN;

	    @FXML
	    private Button deleteBTN;

	    @FXML
	    private Button viewDataBTN;
	    
	    @FXML
	    private Label numberBusqueda;

	    @FXML
	    void deletePerson(ActionEvent event) {
	    	//Delete (revisar)
			PersonData.data.remove(psClicked);
	    }

	    @FXML
	    void updateData(ActionEvent event) {
	    	main.updatePerson();
	    }

	    @FXML
	    void viewData(ActionEvent event) {
	    	//main.viewData();
	    }
	    
	    public void imageIcons() {
			// Icono update
			URL linkUpdateBTN = getClass().getResource("/img/rotate-right-free-icon-font.png");
			Image imageUpdateBTN = new Image(linkUpdateBTN.toString(), 24, 24, false, true);
			updateBTN.setGraphic(new ImageView(imageUpdateBTN));

			// Icono delete
			URL linkDeleteBTN = getClass().getResource("/img/delete-user-free-icon-font.png");
			Image imageDeleteBTN = new Image(linkDeleteBTN.toString(), 24, 24, false, true);
			deleteBTN.setGraphic(new ImageView(imageDeleteBTN));

			// Icono viewData
			URL linkViewDataBTN = getClass().getResource("/img/eye-free-icon-font.png");
			Image imageViewDataBTN = new Image(linkViewDataBTN.toString(), 24, 24, false, true);
			viewDataBTN.setGraphic(new ImageView(imageViewDataBTN));

		}

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			imageIcons();
			viewDataBTN.setDisable(true);
			deleteBTN.setDisable(true);
			updateBTN.setDisable(true);
		}
}
