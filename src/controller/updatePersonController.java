package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class updatePersonController implements Initializable{


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
    void changePhoto(ActionEvent event) {

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
	}
}
