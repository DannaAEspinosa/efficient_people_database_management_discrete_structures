package model;

import enumerations.Nationality;

public class Person {
	
	private String name;
	
	private String lastName;
	
	private int age;
	
	private Nationality country;
	
	private String code;

	public Person(String name, String lastName, int age, String code,int numCountry) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.code = code;
		
	}
	
	
	public void selectCountry(int numCountry) {
		switch(numCountry){
		case 1:
			setCountry(Nationality.BRAZIL);
			break;
		case 2:
			setCountry(Nationality.COLOMBIA);
			break;
		case 3:
			setCountry(Nationality.PERU);
			break;
		case 4:
			setCountry(Nationality.VENEZUELA);
			break;
		case 5:
			//setCountry(Nationality.CHILE;
			break;
		case 6:
			setCountry(Nationality.ECUADOR);
			break;
		case 7:
			setCountry(Nationality.BOLIVIA);
			break;
		case 8:
			setCountry(Nationality.PARAGUAY);
			break;
		case 9:
			setCountry(Nationality.URUGUAY);
			break;
		case 10:
			setCountry(Nationality.GUYANA);
			break;
		case 11:
			setCountry(Nationality.SURINAME);
			break;
		case 12:
			setCountry(Nationality.FRENCH_GUIANA);
			break;
		case 13:
			setCountry(Nationality.FALKLAND_ISLANDS);
			break;
		case 14:
			setCountry(Nationality.ARGENTINA);
			break;
			
		}
	}

	//Getters and setters.

	public Nationality getCountry() {
		return country;
	}


	public void setCountry(Nationality country) {
		this.country = country;
	}
	
	

}
