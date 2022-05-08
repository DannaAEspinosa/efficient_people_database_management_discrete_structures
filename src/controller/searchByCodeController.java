package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.ObservableList;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Person;
import model.PersonData;

public class searchByCodeController implements Initializable {

	
	private PersonData psClicked;

	private Main main;
	

	public void setMain(Main main) {
		this.main = main;
	}

	private Stage currentStage;
	@FXML
	private TableView<Person> TableViewCode;

	@FXML
	private TableColumn<Person, String> codeTV;

	@FXML
	private TextField codeTF;

	@FXML
	private Button updateBTN;

	@FXML
	private Button deleteBTN;

	@FXML
	private Button viewDataBTN;
	
	@FXML
    private Label numberBusqueda;
	
	@FXML
    private Button SearchByCodeBTN;

  

    @FXML
    void searchByCode(ActionEvent event) {
    	
    	 
    		for(int i=0;i<PersonData.getData().size();i++) {
    			
        		if(codeTF.getText().equals(PersonData.data.get(i).getId())) {
        			codeTV.setCellValueFactory(new PropertyValueFactory<Person,String>("code"));
        			System.out.println(PersonData.getData().get(i).getId());
        			
        			
    		}
        		TableViewCode.setItems(PersonData.getData());
        		
        		
        		
        		
        	}
    	
    	
   
    }

	@FXML
	void deletePerson(ActionEvent event) {
		//Delete (revisar)
		//Borrar del arrayList.
		PersonData.data.remove(psClicked);
		
		//Borrar del arbol.
		
		
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
		
		//Icono button search
		URL linkSearchBTN = getClass().getResource("/img/search-free-icon-font.png");
		Image imageSearchBTN = new Image(linkSearchBTN.toString(), 24, 24, false, true);
		SearchByCodeBTN.setGraphic(new ImageView(imageSearchBTN));
		
		

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		imageIcons();
		viewDataBTN.setDisable(true);
		deleteBTN.setDisable(true);
		updateBTN.setDisable(true);
	}

}
