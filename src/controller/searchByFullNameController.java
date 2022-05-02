package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class searchByFullNameController implements Initializable{
	
	private Main main;
	private Stage currentStage;
	
	 @FXML
	    private TableView<?> TableViewFullName;

	    @FXML
	    private TableColumn<?, ?> fullNameFull;
		@FXML
		private TextField fullNameTF;

	    @FXML
	    private Button updateBTN;

	    @FXML
	    private Button deleteBTN;

	    @FXML
	    private Button viewDataBTN;

	    @FXML
	    void deletePerson(ActionEvent event) {

	    }

	    @FXML
	    void updateData(ActionEvent event) {
	    	try {

				FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
				BorderPane root;

				root = (BorderPane) loader.load();

				MenuBarController controller = loader.getController();

				Scene scene = new Scene(root, 791, 556);
				Stage stage = new Stage();
				stage.setScene(scene);

				currentStage = stage;
				currentStage.close();

				BorderPane updatePerson;
				FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/updatePersonWindow.fxml"));

				BorderPane root_2 = (BorderPane) loader_2.load();

				updatePersonController controller2 = loader_2.getController();

				updatePerson = (BorderPane) stage.getScene().getRoot();

				updatePerson.setCenter(root_2);

				currentStage.getIcons().add(new Image("/img/rotate-right-free-icon-font.png"));
				currentStage.setTitle("Base Data S.A | Update Data");

				stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	    @FXML
	    void viewData(ActionEvent event) {
	    	try {

				FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
				BorderPane root;

				root = (BorderPane) loader.load();

				MenuBarController controller = loader.getController();

				Scene scene = new Scene(root, 791, 556);
				Stage stage = new Stage();
				stage.setScene(scene);

				currentStage = stage;
				currentStage.close();

				BorderPane viewData;
				FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/viewDataWindow.fxml"));

				BorderPane root_2 = (BorderPane) loader_2.load();

				viewDataController controller2 = loader_2.getController();

				viewData = (BorderPane) stage.getScene().getRoot();

				viewData.setCenter(root_2);

				currentStage.getIcons().add(new Image("/img/eye-free-icon-font.png"));
				currentStage.setTitle("Base Data S.A | View Data");

				stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    public void imageIcons() {
			// Icono update
			URL linkUpdateBTN = getClass().getResource("/img/rotate-right-free-icon-font.png");
			Image imageUpdateBTN = new Image(linkUpdateBTN.toString(), 24, 24, false, true);
			updateBTN.setGraphic(new ImageView(imageUpdateBTN));

			// Icono delete
			URL linkDeleteBTN = getClass().getResource("/img/delete-user-free-icon-font.png");
			Image imageDeleteBTN = new Image(linkDeleteBTN.toString(), 24, 24, false, true);
			deleteBTN.setGraphic(new ImageView(imageDeleteBTN));

			// Icono viewData
			URL linkViewDataBTN = getClass().getResource("/img/eye-free-icon-font.png");
			Image imageViewDataBTN = new Image(linkViewDataBTN.toString(), 24, 24, false, true);
			viewDataBTN.setGraphic(new ImageView(imageViewDataBTN));

		}

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			imageIcons();
		}
}
