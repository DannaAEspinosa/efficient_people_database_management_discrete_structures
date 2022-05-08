package controller;

import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Controller;

public class updatePersonController implements Initializable{


	public updatePersonController() {
		
	}

	
	public updatePersonController(String[] country, String[] gender, ImageView imgPerson, TextField namePersonTF,
			TextField lastNamePersonTF, TextField agePersonTF, TextField heightPersonTF,
			ComboBox<String> nationalityPersonCB, Label codeUniquePerson, ComboBox<String> genderCB,
			DatePicker dateOfBirthDP, Label ageLb) {
		super();
		this.country = country;
		this.gender = gender;
		this.imgPerson = imgPerson;
		this.namePersonTF = namePersonTF;
		this.lastNamePersonTF = lastNamePersonTF;
		this.agePersonTF = agePersonTF;
		this.heightPersonTF = heightPersonTF;
		this.nationalityPersonCB = nationalityPersonCB;
		this.codeUniquePerson = codeUniquePerson;
		this.genderCB = genderCB;
		this.dateOfBirthDP = dateOfBirthDP;
		this.ageLb = ageLb;
	}


	@SuppressWarnings("unused")
	private Main main;
	
	Calendar cal = new GregorianCalendar();

	Controller controller = new Controller();

	@SuppressWarnings("unused")
	private String[] country = { "USA", "MEXICO", "CANADA", "GUATEMALA", "HAITI", "CUBA", "HONDURAS", "EL SALVADOR",
			"COSTA RICA", "PANAMA", "JAMAICA", "PUERTO RICO", "TRINIDAD AND TOBAGO", "BELIZE", "BAHAMAS", "BARBADOS",
			"SAINT LUCIA", "GRENADA", "SAINT VINCENT AND THE GRENADINES", "ANTIGUA AND BARBUDA", "DOMINICA", "BERMUDA",
			"SAINT KITTS AND NEVIS", "ANGUILLA", "BRAZIL", "COLOMBIA", "ARGENTINA", "PERU", "VENEZUELA",
			"CHILE", "ECUADOR", "BOLIVIA", "PARAGUAY", "URUGUAY", "GUYANA", "SURINAME", "NICARAGUA" };

	@SuppressWarnings("unused")
	private String[] gender = { "MAN", "WOMAN" };

	

	public void setMain(Main main) {
		this.main = main;
	}
	
    @FXML
    private ImageView imgPerson;

    @FXML
    private TextField namePersonTF;

    @FXML
    private TextField lastNamePersonTF;

    @FXML
    private TextField agePersonTF;

    @FXML
    private TextField heightPersonTF;

    @FXML
    private ComboBox<String> nationalityPersonCB;

    @FXML
    private Label codeUniquePerson;

    @FXML
    private Button changePhotoBTN;
    
    @FXML
	private ComboBox<String> genderCB;
    

    @FXML
    private Button updatePersonBTN;
    
    @FXML
	private DatePicker dateOfBirthDP;

	@FXML
	private Label ageLb;
	

    @FXML
    void updatePerson(ActionEvent event) {

    }

    @FXML
    void changePhoto(ActionEvent event) {

    }
    
    @FXML
	void chooseGender(ActionEvent event) {
		chooseGenderC();

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
	void chooseNationality(ActionEvent event) {
		chooseNationalityC();
	}

	public Nationality chooseNationalityC() {
		String nationalityS = nationalityPersonCB.getValue();
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

	@FXML
	void validationAge(ActionEvent event) {
		int age = returnAge();

		String ageP = String.valueOf(age);
		ageLb.setText(ageP);
	}
	
	public int returnAge() {

		int monthCurrent = cal.get(Calendar.MONTH), yearCurrent = cal.get(Calendar.YEAR),
				dayCurrent = cal.get(Calendar.DAY_OF_MONTH);
		int month = dateOfBirthDP.getValue().getMonthValue();
		int year = dateOfBirthDP.getValue().getYear();
		@SuppressWarnings("unused")
		int day = dateOfBirthDP.getValue().getDayOfMonth();

		int monthB = Math.abs(month - monthCurrent);
		int dayB = dayCurrent;
		int yearB = Math.abs(year - yearCurrent);

		System.out.println(yearB + " " + dayB + " " + monthB);

		return yearB;

	}
    
    
    public void imageIcons() {
    	//Icono guardar
    			URL linkChangePhoto = getClass().getResource("/img/portrait-free-icon-font.png");
    			Image imageChangePhoto = new Image(linkChangePhoto.toString(),20,20,false,true);
    			changePhotoBTN.setGraphic(new ImageView(imageChangePhoto));
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		imageIcons();		
		initialValues();
	}
	
	public void initialValues() {
		//namePersonTF.setText();
	}
}
