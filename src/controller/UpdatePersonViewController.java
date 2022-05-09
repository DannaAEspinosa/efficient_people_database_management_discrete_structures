package controller;

import java.net.URL;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import application.Main;
import enumerations.Gender;
import enumerations.Nationality;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Person;

public class UpdatePersonViewController implements Initializable {
	
	private String[] countryArray = { "USA", "MEXICO", "CANADA", "GUATEMALA", "HAITI", "CUBA", "HONDURAS", "EL SALVADOR",
			"COSTA RICA", "PANAMA", "JAMAICA", "PUERTO RICO", "TRINIDAD AND TOBAGO", "BELIZE", "BAHAMAS", "BARBADOS",
			"SAINT LUCIA", "GRENADA", "SAINT VINCENT AND THE GRENADINES", "ANTIGUA AND BARBUDA", "DOMINICA", "BERMUDA",
			"SAINT KITTS AND NEVIS", "ANGUILLA", "BRAZIL", "COLOMBIA", "ARGENTINA", "PERU", "VENEZUELA",
			"CHILE", "ECUADOR", "BOLIVIA", "PARAGUAY", "URUGUAY", "GUYANA", "SURINAME", "NICARAGUA" };

	private String[] genderArray = { "MAN", "WOMAN" };
	
	private Main main;
	
	@FXML
	private TextField nameTextField,lastNameTextField,heightTextField;
	
	@FXML
	private DatePicker birthDP;
	
	@FXML
	private ComboBox<String> countryCB;
	
	@FXML
	private ComboBox<String> genderCB;
	
	@FXML
	private Button buttonSave,buttonCancel;
	@FXML
    private Button img;
	
	//Attributes
	private String name;
	private String lastName;
	private String id;
	private int age;
	private String height;
	private LocalDate birthday;
	private Nationality country;
	private Gender gender;
	private String urlImage;
	
	private Person person;
	
	@FXML
	private Label labelName,labelLastName,labelBirthday,labelHeight,labelCountry,labelGender,
		labelId;
	
	public UpdatePersonViewController(String name,String lastName,String id,int age,int height, 
			LocalDate birthday, Nationality country, Gender gender,String urlImage,
			Person person) {
		super();
		
		nameTextField = new TextField();
		lastNameTextField = new TextField();
		heightTextField = new TextField();
		birthDP = new DatePicker();
		countryCB = new ComboBox<String>();
		genderCB = new ComboBox<String>();
		
		
		
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.age = age;
		this.height = String.valueOf(height);
		this.birthday =  birthday;
		this.country = country;
		this.gender = gender;
		this.urlImage = urlImage;
		this.person = person;
		
		
	}
	
	
	@FXML
	void toSetUpPerson(ActionEvent e) {
		main.toDeleteAPerson(person);
		
	
		
		if(!(nameTextField.getText().equals(""))) {
			name = nameTextField.getText();
		}
	
		
		if(!(lastNameTextField.getText().equals(""))) {
			lastName = lastNameTextField.getText();
		}
		
	
		if(!(birthDP.getValue() == null)) {
			birthday = birthDP.getValue();
			age = calculateAge(birthDP.getValue());
		}	
		
		if(!(heightTextField.getText().equals(""))) {
			height = heightTextField.getText();
		}
		
		
		if(!(countryCB.getValue() == null)) {
			country = selectCountry(countryCB.getValue());
		}
		
		if(!(genderCB.getValue() == null)) {
			gender =  selectGenderC(genderCB.getValue());
		}
		
		
		
		
		
		main.addPerson(name.toUpperCase(), lastName.toUpperCase(),(name+" "+lastName).toUpperCase(),age,Integer.valueOf(height), id, country, gender, urlImage, birthday);
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Successful process");
		alert.setHeaderText("The changes has been saved");
		alert.showAndWait();
	}
	
	public int calculateAge(LocalDate birthDay) {
		
		 LocalDate hoy = LocalDate.now() ; 
		    
		 int edad = hoy.getYear()-birthDay.getYear();
		 

		return  edad;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		labelName.setText(name);
		labelLastName.setText(lastName);
		
		labelBirthday.setText(birthday.toString());
		
		labelHeight.setText(String.valueOf(height));
		
		labelCountry.setText(country.toString());
		
		labelGender.setText(gender.toString());
		
		labelId.setText(id);
		
		Image imagePerson = new Image(urlImage, 130, 150, false, true);
		img.setGraphic(new ImageView(imagePerson));
		
		// TODO Auto-generated method stub
		countryCB.getItems().addAll(countryArray);
		countryCB.setOnAction(this::chooseCountry);
		countryCB.setAccessibleText(country.toString());
		genderCB.getItems().addAll(genderArray);
		genderCB.setAccessibleText(gender.toString());
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
	
	public Nationality selectCountry(String nationalityS) {
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
		if (genderS.equals("WOMAN")) {
			return Gender.WOMAN;
		} else if (genderS.equals("MAN")) {
			return Gender.MAN;
		}
		return null;

	}
	
	public Gender selectGenderC(String genderS) {
		if (genderS.equals("WOMAN")) {
			return Gender.WOMAN;
		} else if (genderS.equals("MAN")) {
			return Gender.MAN;
		}
		return null;
	}
	
	
	
	@FXML
	void toCancel(ActionEvent e) {
		main.intialView();
	}
	
	
	public void setMain(Main main) {
		this.main = main;
	}
	
}
