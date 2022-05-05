package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class GenerateDataController implements Initializable {

	private Main main;


	double progress;
	

	public GenerateDataController() {

	}

	@FXML
	private TextField numberPeople;

	@FXML
	private Button bttGenerate;

	@FXML
	private ProgressBar progressBar;

	@FXML
	private Button bttSave;

	@FXML
	private Label numberDataGenerate;

	@FXML
	private ImageView imIconGenerate;

	@FXML
	void generateData(ActionEvent event) {
		//textfield
		int numDates = Integer.parseInt(numberPeople.getText());
		//label
		//int numDataGenerate = Integer.parseInt(numberDataGenerate.getText());


		
		//main.toGenerateDate(numDates);

		 generatingData(numDates);

	}

	public void setMain(Main main) {
		this.main = main;
	}

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

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		placeImageButtons();

		bttSave.setVisible(false);
		bttGenerate.setVisible(true);

		progressBar.setStyle("-fx-accent: #71d1d3;");

		numberDataGenerate.setText("0"); // Prueba

	}

	// Metodo para incrementar la barra
	public void increaseProgress(int numDates) {

		progress += 0.01;

		progressBar.setProgress(progress);

	}
	
	public void generatingData(int numDates) {
		new Thread(()->{
			for(int i = 0;i<numDates;i++) {
				try {
					Thread.sleep(0);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Todo lo que implique cambiar de Ui en este metodo.
				Platform.runLater(()->{
					//Operation de UI
					main.toGenerateDate(1);
					increaseProgress(numDates);
					
					
				});
			}
		}).start();
	}

	/**
	 * Condicional para parar la barra de progreso
	 * 
	 * @return boolean true si el numero de personas generadas es igual a las
	 *         personas que el suuario digito(Si es igual, entonces aparece el boton
	 *         save) false si es menor.
	 */
	public boolean conditionalPersons(int numPeople, int numDataGenerate) {

		if ((numDataGenerate+1) == numPeople) {
			bttSave.setVisible(true);
			return true;
		} else if (numDataGenerate < numPeople) {
			return false;
		} else if (numDataGenerate > numPeople) {
			return false;
		}
		return false;

	}
}
