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
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GenerateDataController implements Initializable {
	
	private Main main;

	
	
	public GenerateDataController() {
		
	}

	@FXML
    private Button bttGenerate;

    @FXML
    private Button bttSave;
    
    @FXML
    private ImageView imIconGenerate;


	public void setMain(Main main) {
		this.main = main;
	}
	
	public void placeImageButtons() {
		//Icono guardar
		URL linkSave = getClass().getResource("/img/disco.png");
		Image imageSave = new Image(linkSave.toString(),20,20,false,true);
		bttSave.setGraphic(new ImageView(imageSave));
		
		//Icono generar
		URL linkGenerate = getClass().getResource("/img/magic-wand-free-icon-font (1).png");
		Image imageGenerate = new Image(linkGenerate.toString(),20,20, false,true);
		bttGenerate.setGraphic(new ImageView(imageGenerate));
		
	
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		placeImageButtons();
		bttSave.setDisable(true); //Inhabilitar botón
		bttSave.setVisible(true);
		bttGenerate.setVisible(true);
		//Icon superior y name

		
		
		
		
	}

}
