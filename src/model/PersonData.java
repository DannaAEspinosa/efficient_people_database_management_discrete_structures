package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.google.gson.Gson;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PersonData {
	public static ObservableList<Person> data = FXCollections.observableArrayList();

	public static ObservableList<Person> getData() {
		return data;
	}

	public static void setData(ObservableList<Person> data) {
		PersonData.data = data;
	}
	
	//Cambiar por un arbol
	private static	ArrayList personData;
	
	

	
	//NO FUNCIONAL
	//Serializar
		public static void saveJSON() {
			try {
				Gson gson = new Gson();
				String json = gson.toJson(personData);

				File file = new File("personData.json");
				FileOutputStream fos = new FileOutputStream(file);
				fos.write(json.getBytes());
				fos.close();

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//Serializar
		public static void loadJSON() {
			try {
				FileInputStream fis = new FileInputStream(new File("personData.json"));
				BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
				String json = "";
				String line;
				while ((line = reader.readLine()) != null) {
					json += line;
				}
				Gson gson = new Gson();
				Person[] data = gson.fromJson(json, Person[].class);
				for (Person u : data) {
					personData.add(u);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	
	
	
}
