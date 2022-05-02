package model;

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
}
