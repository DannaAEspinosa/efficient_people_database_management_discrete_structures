package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;


public class GenerateDataController implements Initializable {

	private Main main;


	double progress;
	
	int i;

	public GenerateDataController() {

	}

	@FXML
	private TextField numberPeople;

	@FXML
	private Button bttGenerate;

	@FXML
	private ProgressBar progressBar;

	/*
	@FXML
	private Button bttSave;
	*/
	
	@FXML
	private Button bttSaveData;

	@FXML
	private Label numberDataGenerate;

	@FXML
	private ImageView imIconGenerate;

	@FXML
	void generateData(ActionEvent event) {
		//textfield
		try {
			
			int numDates = Integer.parseInt(numberPeople.getText());
			
			
			bttGenerate.setVisible(false);

			generatingData(numDates);
			
		}catch(NumberFormatException e) {
			e.printStackTrace();
			numberPeople.setText("");
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error!!");
			alert.setHeaderText("Invalid input format..");
			alert.showAndWait();
			
		}
		
		

	}
	@FXML
	void saveData(ActionEvent e) {
	main.intialView();
	}
	

	public void setMain(Main main) {
		this.main = main;
	}

	/*
	public void placeImageButtons() {
		// Icono guardar
		URL linkSave = getClass().getResource("/img/disco.png");
		Image imageSave = new Image(linkSave.toString(), 20, 20, false, true);
		bttSave.setGraphic(new ImageView(imageSave));

		// Icono generar
		URL linkGenerate = getClass().getResource("/img/magic-wand-free-icon-font (1).png");
		Image imageGenerate = new Image(linkGenerate.toString(), 20, 20, false, true);
		bttGenerate.setGraphic(new ImageView(imageGenerate));

	}
	*/

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		/*
		placeImageButtons();

		bttSave.setVisible(false);
		*/
		bttGenerate.setVisible(true);

		progressBar.setStyle("-fx-accent: #71d1d3;");

		numberDataGenerate.setText("0"); 
		}

	// Metodo para incrementar la barra
	public void increaseProgress(int numDates) {

		progress += 0.01*100/numDates;

		progressBar.setProgress(progress);

	}
	
	public void generatingData(int numDates) {
		new Thread(()->{
			for( i = 0;i<numDates;i++) {
				try {
					Thread.sleep(0);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Todo lo que implique cambiar de Ui en este metodo.
				main.toGenerateDate(1);
				Platform.runLater(()->{
					//Operation de UI
					numberDataGenerate.setText(String.valueOf(i));
					increaseProgress(numDates);
				
					
				});
					
			}
			
			Platform.runLater(new Runnable(){

				@Override
				public void run() {
					Alert alert = new Alert(AlertType.CONFIRMATION);
					alert.setTitle("Successful process");
					alert.setHeaderText("The people were registered in the system");
					alert.showAndWait();
					bttGenerate.setVisible(true);
					
				}
				// do your GUI stuff here
				});
			
		
		}).start();
		
		
	
	}


	
	public void toShowMessage() {
		System.out.println("Entro");
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Successful process");
		alert.setHeaderText("The people have been created");
		alert.showAndWait();
	}
}
