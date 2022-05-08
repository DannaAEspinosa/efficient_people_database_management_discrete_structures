package model;

import java.time.LocalDate;

import enumerations.Gender;
import enumerations.Nationality;
import interfaces.HelpInSearch;


public class Person implements HelpInSearch{
	
	//Attributes
	public String id;

	private String name;

	private String lastName;
	
	private String fullName;
	
	
	private Gender gender;

	
	private int age;
	
	
	private int height;

	private Nationality country;


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
		this.country=country;
		this.gender=gender;
		
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
	


	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public LocalDate getBirthDayDate() {
		return birthDayDate;
	}



	public void setBirthDayDate(LocalDate birthDayDate) {
		this.birthDayDate = birthDayDate;
	}



	public String getImagePath() {
		return imagePath;
	}



	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}



	@Override
	public String toString() {
		
		return fullName;
		//return ("Name: "+name+"\n"+"Last Name: "+lastName+"\n"+"Id: "+id+"\n"+"FullName: "+fullName+"\n"+"dateBirth: "+birthDayDate+"\n"+"Age: "+age+"\n"+"Gender: "+gender+"\n"+"Nationality: "+country+"\n"+"Image"+imagePath+"\n"+"Height"+height);
	}



	@Override
	public String getNameI() {
		// TODO Auto-generated method stub
		return name;
	}



	@Override
	public String getLastNameI() {
		// TODO Auto-generated method stub
		return lastName;
	}



	@Override
	public String getfullNameI() {
		// TODO Auto-generated method stub
		return fullName;
	}



	@Override
	public String getIdI() {
		// TODO Auto-generated method stub
		return id;
	}
	
	
	
	

}
