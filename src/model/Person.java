package model;

import java.time.LocalDate;

import enumerations.Gender;
import enumerations.Nationality;
import javafx.scene.image.Image;

public class Person {
	
	//Attributes
	private String id;

	private String name;

	private String lastName;
	
	private String fullName;
	
	
	private Gender gender;

	@SuppressWarnings("unused")
	private int age;
	
	@SuppressWarnings("unused")
	private int height;

	private Nationality country;

	@SuppressWarnings("unused")
	private LocalDate birthDayDate;
	
	private String imagePath;

	public Person(String id,String name, String lastName,String fullName,Gender gender, int age,int height,
			Nationality country,LocalDate birthDayDate,String imagePath) {
		
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.fullName = fullName;
		this.gender = gender;
		this.age = age;
		this.height=height;
		this.country = country;
		this.birthDayDate = birthDayDate;
		this.imagePath=imagePath;
		
	}

	

	// Getters and setters.

	public Nationality getCountry() {
		return country;
	}

	public void setCountry(Nationality country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public Gender getGender() {
		return gender;
	}



	public void setGender(Gender gender) {
		this.gender = gender;
	}






	public String getImagePath() {
		return imagePath;
	}



	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}



	@Override
	public String toString() {
		return name+lastName;
	}
	
	
	
	

}
