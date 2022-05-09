package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import enumerations.Gender;
import enumerations.Nationality;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class UpdatePersonViewController implements Initializable {
	
	private String[] country = { "USA", "MEXICO", "CANADA", "GUATEMALA", "HAITI", "CUBA", "HONDURAS", "EL SALVADOR",
			"COSTA RICA", "PANAMA", "JAMAICA", "PUERTO RICO", "TRINIDAD AND TOBAGO", "BELIZE", "BAHAMAS", "BARBADOS",
			"SAINT LUCIA", "GRENADA", "SAINT VINCENT AND THE GRENADINES", "ANTIGUA AND BARBUDA", "DOMINICA", "BERMUDA",
			"SAINT KITTS AND NEVIS", "ANGUILLA", "BRAZIL", "COLOMBIA", "ARGENTINA", "PERU", "VENEZUELA",
			"CHILE", "ECUADOR", "BOLIVIA", "PARAGUAY", "URUGUAY", "GUYANA", "SURINAME", "NICARAGUA" };

	private String[] gender = { "MAN", "WOMAN" };
	
	private Main main;
	
	@FXML
	private TextField nameTextField,lastNameTextField,heightTextField;
	
	@FXML
	private DatePicker birthDP;
	
	@FXML
	private ComboBox<String> countryCB;
	
	@FXML
	private ComboBox<String> genderCB;
	
	private Button buttonSave;
	
	
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		countryCB.getItems().addAll(country);
		countryCB.setOnAction(this::chooseCountry);
		genderCB.getItems().addAll(gender);
		genderCB.setOnAction(this::chooseGender);
		
	}
	
	@FXML
	void chooseCountry(ActionEvent e) {
		chooseNationalityC();
	}
	
	@FXML
	void chooseGender(ActionEvent e) {
		chooseGenderC();
	}
	
	public Nationality chooseNationalityC() {
		String nationalityS = countryCB.getValue();
		if (nationalityS.equals("USA")) {
			return Nationality.USA;
		} else if (nationalityS.equals("BRAZIL")) {
			return Nationality.BRAZIL;
		} else if (nationalityS.equals("MEXICO")) {
			return Nationality.MEXICO;
		} else if (nationalityS.equals("COLOMBIA")) {
			return Nationality.COLOMBIA;
		} else if (nationalityS.equals("ARGENTINA")) {
			return Nationality.ARGENTINA;
		} else if (nationalityS.equals("CANADA")) {
			return Nationality.CANADA;
		} else if (nationalityS.equals("PERU")) {
			return Nationality.PERU;
		} else if (nationalityS.equals("VENEZUELA")) {
			return Nationality.VENEZUELA;
		} else if (nationalityS.equals("CHILE")) {
			return Nationality.CHILE;
		} else if (nationalityS.equals("ECUADOR")) {
			return Nationality.ECUADOR;
		} else if (nationalityS.equals("GUATEMALA")) {
			return Nationality.GUATEMALA;
		} else if (nationalityS.equals("BOLIVIA")) {
			return Nationality.BOLIVIA;
		} else if (nationalityS.equals("CUBA")) {
			return Nationality.CUBA;
		} else if (nationalityS.equals("HAITI")) {
			return Nationality.HAITI;
		} else if (nationalityS.equals("HONDURAS")) {
			return Nationality.HONDURAS;
		} else if (nationalityS.equals("PARAGUAY")) {
			return Nationality.PARAGUAY;
		} else if (nationalityS.equals("NICARAGUA")) {
			return Nationality.NICARAGUA;
		} else if (nationalityS.equals("EL SALVADOR")) {
			return Nationality.EL_SALVADOR;
		} else if (nationalityS.equals("COSTA RICA")) {
			return Nationality.COSTA_RICA;
		} else if (nationalityS.equals("PANAMA")) {
			return Nationality.PANAMA;
		} else if (nationalityS.equals("URUGUAY")) {
			return Nationality.URUGUAY;
		} else if (nationalityS.equals("JAMAICA")) {
			return Nationality.JAMAICA;
		} else if (nationalityS.equals("PUERTO RICO")) {
			return Nationality.PUERTO_RICO;
		} else if (nationalityS.equals("TRINIDAD AND TOBAGO")) {
			return Nationality.TRINIDAD_AND_TOBAGO;
		} else if (nationalityS.equals("GUYANA")) {
			return Nationality.GUYANA;
		} else if (nationalityS.equals("SURINAME")) {
			return Nationality.SURINAME;
		} else if (nationalityS.equals("BELIZE")) {
			return Nationality.BELIZE;
		} else if (nationalityS.equals("BAHAMAS")) {
			return Nationality.BAHAMAS;
		} else if (nationalityS.equals("BARBADOS")) {
			return Nationality.BARBADOS;
		} else if (nationalityS.equals("SAINT LUCIA")) {
			return Nationality.SAINT_LUCIA;
		} else if (nationalityS.equals("GRENADA")) {
			return Nationality.GRENADA;
		} else if (nationalityS.equals("SAINT VINCENT AND THE GRENADINES")) {
			return Nationality.SAINT_VINCENT_AND_THE_GRENADINES;
		} else if (nationalityS.equals("ANTIGUA AND BARBUDA")) {
			return Nationality.ANTIGUA_AND_BARBUDA;
		} else if (nationalityS.equals("DOMINICA")) {
			return Nationality.DOMINICA;
		} else if (nationalityS.equals("SAINT KITTS AND NEVIS")) {
			return Nationality.SAINT_KITTS_AND_NEVIS;
		}
		return null;

	}

	public Gender chooseGenderC() {
		String genderS = genderCB.getValue();
		System.out.println(genderS);
		if (genderS.equals("WOMAN")) {
			return Gender.WOMAN;
		} else if (genderS.equals("MAN")) {
			return Gender.MAN;
		}
		return null;

	}
	
	@FXML
	void toSetUpPerson(ActionEvent e) {
		
	}
	
	public void setMain(Main main) {
		this.main = main;
	}
	
}
