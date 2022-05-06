package controller;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import application.Main;
import enumerations.Gender;
import enumerations.Nationality;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Person;

public class SearchByNameViewController implements Initializable {
	
	//Attribute
	private Main main;
	
	public  SearchByNameViewController() {
		
	}
	
	@FXML
	private TableView<Person> tableData;
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
		// TODO Auto-generated method stub
		
	}
	
	public void setMain(Main main) {
		this.main = main;
	}

}
