package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class addPersonController implements Initializable{
	private Main main;

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
    private ComboBox<?> nationalityPersonCB;

    @FXML
    private Label codeUniquePerson;

    @FXML
    private Button changePhotoBTN;

    @FXML
    void addPhoto(ActionEvent event) {

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
	}
	
	public void setMain(Main main) {
		this.main = main;
	}


}
