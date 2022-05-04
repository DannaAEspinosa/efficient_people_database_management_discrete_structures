package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class viewDataController implements Initializable{
	private Main main;
	

	public void setMain(Main main) {
		this.main = main;
	}
	
    @FXML
    private ImageView imgPerson;

    @FXML
    private Label codeUniquePerson;

    @FXML
    private Label nameLB;

    @FXML
    private Label lastNameLB;

    @FXML
    private Label ageLB;

    @FXML
    private Label heightLB;

    @FXML
    private Label nationalityLB;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
