package controller;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

import application.Main;
import enumerations.Gender;
import enumerations.Nationality;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Person;

public class SearchByNameViewController implements Initializable {
	
	//Attribute
	private Main main;
	@SuppressWarnings("unused")
	private ArrayList<Person> aux = new ArrayList<>(); 
	
	public  SearchByNameViewController() {
		
	}
	
	@FXML
	private TableView<Person> tableData = new TableView<Person>();
	@FXML
	private TableColumn<Person,String> nameColumn;
	@FXML
	private TableColumn<Person,String> LastNameColumn;
	@FXML
	private TableColumn<Person,String> idColumn;
	@FXML
	private TableColumn<Person,Gender> genderColumn;
	@FXML
	private TableColumn<Person,Integer> ageColumn;
	@FXML
	private TableColumn<Person,Integer> heightColumn;
	@FXML
	private TableColumn<Person,LocalDate> birthdayColumn;
	@FXML
	private TableColumn<Person,Nationality> nationalityColumn;
	
	@FXML
	private TextField nameTextField;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		LastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
		idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
		genderColumn.setCellValueFactory(new PropertyValueFactory<>("gender"));
		ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
		heightColumn.setCellValueFactory(new PropertyValueFactory<>("height"));
		birthdayColumn.setCellValueFactory(new PropertyValueFactory<>("birthDayDate"));
		nationalityColumn.setCellValueFactory(new PropertyValueFactory<>("country"));
		
	}
	
	public void setMain(Main main) {
		this.main = main;
	}
	
	@FXML
	void refreshData(ActionEvent e) {
		
		try {
			
			if(main.thereArePeopleInSystem()== true) {
				String input  = nameTextField.getText();
				ObservableList<Person> aux = main.refreshData(input);
				
				if(aux.size()==0) {
					tableData.setItems(aux);
					Alert alert = new Alert(AlertType.CONFIRMATION);
					alert.setTitle("Successful process");
					alert.setHeaderText("Name not found in database");
					alert.showAndWait();
				}
				else {
					tableData.setItems(aux);
					Alert alert = new Alert(AlertType.CONFIRMATION);
					alert.setTitle("Successful process");
					alert.setHeaderText("The search has been made...");
					alert.showAndWait();
				}

				
			}else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Alert!");
				alert.setHeaderText("You must first register people in the system...");
				alert.showAndWait();
			}
			
			
			
		}catch(NullPointerException null_e) {
			
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error de registro!");
			alert.setHeaderText("There are no people matching the entered value..");
			
			null_e.printStackTrace();
		}
		
		
		
		
		
	}

}
