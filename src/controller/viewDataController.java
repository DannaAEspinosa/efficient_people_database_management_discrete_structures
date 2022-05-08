package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class viewDataController implements Initializable{
	private Main main;
	

	public void setMain(Main main) {
		this.main = main;
	}
	
	//Attributes for send
	
		private String name;
		
		private String lastName;
		
		private String fullName;
		
		private String id;
		
		private String gender;
		
		private String nationality;
		
		private String age;
		
		private String height;
		
		private String birthDay;
		
		public viewDataController(String name, String lastName, String fullName, String id, String gender,
				String nationality, String age, String height, String birthDay, String urlImage) {
			super();
			this.name = name;
			this.lastName = lastName;
			this.fullName = fullName;
			this.id = id;
			this.gender = gender;
			this.nationality = nationality;
			this.age = age;
			this.height = height;
			this.birthDay = birthDay;
			this.urlImage = urlImage;
		}

		private String urlImage;
		//
		
	
		
	  @FXML
	    private Label codeUniquePersonLB;

	    @FXML
	    private Label ageLb;

	    @FXML
	    private Label nameLB;

	    @FXML
	    private Label lastNameLb;

	    @FXML
	    private Label dateOfBirthLb;

	    @FXML
	    private Label fullNameLB;

	    @FXML
	    private Label heightLb;

	    @FXML
	    private Label nationalityLb;

	    @FXML
	    private Label genderLb;

	    @FXML
	    private Button img;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		nameLB.setText(name);
		lastNameLb.setText(lastName);
		fullNameLB.setText(fullName);
		codeUniquePersonLB.setText(id);
		heightLb.setText(height);
		genderLb.setText(gender);
		nationalityLb.setText(nationality);
		dateOfBirthLb.setText(birthDay);
		ageLb.setText(age);
		//Image
		
		
		Image imagePerson = new Image(urlImage, 130, 150, false, true);
		img.setGraphic(new ImageView(imagePerson));
	}

}
