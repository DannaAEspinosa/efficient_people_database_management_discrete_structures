package controller;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;

import application.Main;
import enumerations.Nationality;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.input.InputMethodEvent;
import model.Controller;
import model.Person;

public class addPersonController implements Initializable{
	private Main main;
	
	Calendar cal= new GregorianCalendar();
	
	Controller controller = new Controller();

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
    private ComboBox<Nationality> nationalityPersonCB;   

    @FXML
    private Label codeUniquePerson;

    @FXML
    private Button changePhotoBTN;
    
    @FXML
    private DatePicker dateOfBirthDP;

    @FXML
    private Label ageLb;

    @FXML
    private ComboBox<?> genderCB;

    @FXML
    void addPhoto(ActionEvent event) {
    	double random=controller.generateRandomNumberForPercent();
    	String urlImge=controller.randomImage(random);
    	Image imagePerson = new Image(urlImge);
    	imgPerson.setImage(imagePerson);

    }

    @FXML
    void chooseGender(ActionEvent event) {

    }

    @FXML
    void chooseNationality(ActionEvent event) {

    }
    
    @FXML
    void generateAgePerson(InputMethodEvent event) {
    		int age=returnAge();
    		
    		String ageP=String.valueOf(age);
    		ageLb.setText(ageP);
    }
    
    public void imageIcons() {
    	//Icono guardar
    			URL linkaddPhoto = getClass().getResource("/img/portrait-free-icon-font.png");
    			Image imageAddPhoto = new Image(linkaddPhoto.toString(),20,20,false,true);
    			changePhotoBTN.setGraphic(new ImageView(imageAddPhoto));
    }
    

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
		imageIcons();
		
		ArrayList<Nationality> list= new ArrayList<>();
		
		
		
		
	}

	public int returnAge() {
		
		int monthCurrent= cal.get(Calendar.MONTH), yearCurrent=cal.get(Calendar.YEAR),dayCurrent=cal.get(Calendar.DAY_OF_MONTH);
		int month=dateOfBirthDP.getValue().getMonthValue();
		int year=dateOfBirthDP.getValue().getYear();
		int day=dateOfBirthDP.getValue().getDayOfMonth();
		
		int monthB= Math.abs(month-monthCurrent);
		int dayB=dayCurrent;
		int yearB= Math.abs(year-yearCurrent);
		
		System.out.println(yearB+" "+dayB+" "+monthB);
		
		
		return yearB;
		
		
		
	}
	
	public void setMain(Main main) {
		this.main = main;
	}
	
	public void updateObtein() {
		//Nombre
		String name=namePersonTF.getText();
		//Apellido
		String lastName=lastNamePersonTF.getText();
		//Edad
		int age=returnAge();
		//NombreCompleto
		String fullName=name+" "+lastName;
		//Imagen
		double random=controller.generateRandomNumberForPercent();
    	String urlImge=controller.randomImage(random);
		
		//Estatura
		int height=Integer.parseInt(heightPersonTF.getText());
		
		
	}


}
