package model;

import enumerations.Nationality;
import javafx.scene.image.Image;

public class Person {

	private String name;

	private String lastName;

	private int age;
	
	private int height;

	private Nationality country;

	private String code;
	
	private Image imagePerson;

	public Person(String name, String lastName, int age,int height, String code, int numCountry) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.height=height;
		this.code = code;

	}

	public void selectCountry(int numCountry) {
		switch (numCountry) {
		case 1:
			setCountry(Nationality.USA);
			break;
		case 2:
			setCountry(Nationality.MEXICO);
			break;
		case 3:
			setCountry(Nationality.CANADA);
			break;
		case 4:
			setCountry(Nationality.GUATEMALA);
			break;
		case 5:
			setCountry(Nationality.HAITI);
			break;
		case 6:
			setCountry(Nationality.CUBA);
			break;
		case 7:
			setCountry(Nationality.DOMINICAN_REPUBLIC);
			break;
		case 8:
			setCountry(Nationality.HONDURAS);
			break;
		case 9:
			setCountry(Nationality.EL_SALVADOR);
			break;
		case 10:
			setCountry(Nationality.COSTA_RICA);
			break;
		case 11:
			setCountry(Nationality.PANAMA);
			break;
		case 12:
			setCountry(Nationality.JAMAICA);
			break;
		case 13:
			setCountry(Nationality.PUERTO_RICO);
			break;
		case 14:
			setCountry(Nationality.TRINIDAD_AND_TOBAGO);
			break;
		case 15:
			setCountry(Nationality.GUADELOUPE);
			break;
		case 16:
			setCountry(Nationality.BELIZE);
			break;
		case 17:
			setCountry(Nationality.BAHAMAS);
			break;
		case 18:
			setCountry(Nationality.MARTINIQUE);
			break;
		case 19:
			setCountry(Nationality.BARBADOS);
			break;
		case 20:
			setCountry(Nationality.SAINT_LUCIA);
			break;
		case 21:
			setCountry(Nationality.CURACAO);
			break;
		case 22:
			setCountry(Nationality.GRENADA);
			break;
		case 23:
			setCountry(Nationality.SAINT_VINCENT_AND_THE_GRENADINES);
			break;
		case 24:
			setCountry(Nationality.ARUBA);
			break;
		case 25:
			setCountry(Nationality.UNITED_STATES_VIRGIN_ISLANDS);
			break;
		case 26:
			setCountry(Nationality.ANTIGUA_AND_BARBUDA);
			break;
		case 27:
			setCountry(Nationality.DOMINICA);
			break;
		case 28:
			setCountry(Nationality.CAYMAN_ISLANDS);
			break;
		case 29:
			setCountry(Nationality.BERMUDA);
			break;
		case 30:
			setCountry(Nationality.GREENLAND);
			break;
		case 31:
			setCountry(Nationality.SAINT_KITTS_AND_NEVIS);
			break;
		case 32:
			setCountry(Nationality.SINT_MAARTEN);
			break;
		case 33:
			setCountry(Nationality.TURKS_AND_CAICOS_ISLANDS);
			break;
		case 34:
			setCountry(Nationality.SAINT_MARTIN);
			break;
		case 35:
			setCountry(Nationality.BRITISH_VIRGIN_ISLANDS);
			break;
		case 36:
			setCountry(Nationality.CARIBBEAN_NETHERLANDS);
			break;
		case 37:
			setCountry(Nationality.ANGUILLA);
			break;
		case 38:
			setCountry(Nationality.SAINT_BARTHELEMY);
			break;
		case 39:
			setCountry(Nationality.SAINT_PIERRE_AND_MIQUELON);
			break;
		case 40:
			setCountry(Nationality.MONTSERRAT);
			break;
		case 41:
			setCountry(Nationality.BRAZIL);
			break;
		case 42:
			setCountry(Nationality.COLOMBIA);
			break;
		case 43:
			setCountry(Nationality.ARGENTINA);
			break;
		case 44:
			setCountry(Nationality.PERU);
			break;
		case 45:
			setCountry(Nationality.VENEZUELA);
			break;
		case 46:
			setCountry(Nationality.CHILE);
			break;
		case 47:
			setCountry(Nationality.ECUADOR);
			break;
		case 48:
			setCountry(Nationality.BOLIVIA);
			break;
		case 49:
			setCountry(Nationality.PARAGUAY);
			break;
		case 50:
			setCountry(Nationality.URUGUAY);
			break;
		case 51:
			setCountry(Nationality.GUYANA);
			break;
		case 52:
			setCountry(Nationality.SURINAME);
			break;
		case 53:
			setCountry(Nationality.FRENCH_GUIANA);
			break;
		case 54:
			setCountry(Nationality.FALKLAND_ISLANDS);
			break;

		}
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Image getImagePerson() {
		return imagePerson;
	}

	public void setImagePerson(Image imagePerson) {
		this.imagePerson = imagePerson;
	}

	
}
