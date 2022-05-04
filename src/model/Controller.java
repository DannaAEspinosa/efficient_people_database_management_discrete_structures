package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import comparators.CompareByFullName;
import comparators.CompareById;
import comparators.CompareByLastName;
import comparators.CompareByName;
import enumerations.Gender;
import enumerations.Nationality;
import generics.RedBlackTree;

public class Controller {
	
	//Attributes
	
	private RedBlackTree<Person> treeRBName,treeRBLastName,treeRBFullName,treeRBId;

	
	private int currentYear;
	private Date date;
	



	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Controller() {
		
		//To initialize trees
		Comparator cName = new CompareByName();
		Comparator cLastName = new CompareByLastName();
		Comparator cFullName = new CompareByFullName();
		Comparator cId = new CompareById();
		
		
		treeRBName = new RedBlackTree<Person>(cName);
		
		treeRBLastName = new RedBlackTree<Person>(cLastName);
		
		treeRBFullName = new RedBlackTree<Person>(cFullName);
		
		treeRBId = new RedBlackTree<Person>(cId);
		
		date = new Date();
		currentYear = date.getYear()+1900;
	}
	
	public void toCreatePerson(int numDates) {
		String relativePathNames = ".\\data\\babynames-clean.csv";
		String relativePathLastNames = ".\\data\\Apellidos.csv";
		
		//Attributes of the class person
		String name,lastName,fullName,id,imagePath= "";
		
		Gender gender = null;
		
		Nationality country = null;
		
		int age,height = 0;
		
		LocalDate birthDay = null;
		
		
		
		Person p = null;
		
		
		double randomN = 0;
		
		for(int i = 0;i<numDates;i++) {
			//System.out.println("i: "+(i+1));
			
			name = randomValueCSV(relativePathNames);
			
			while(name == null) {
				name = randomValueCSV(relativePathNames);
			}
			
			lastName = randomValueCSV(relativePathLastNames);
			
			while(lastName == null) {
				lastName = randomValueCSV(relativePathLastNames);
			}
			
			fullName = name+" "+lastName;
			
			randomN = generateRandomNumberForPercent();
			
			gender = generateGender(randomN);
			
			country = selectNationality(randomN);
			
			age =  generateAge(randomN);
			
			height = generateHeight(age);
			
			birthDay =  generateBirthDayDate(age);
			
			id = String.valueOf(i);
			
			imagePath=randomImage(randomN);
			
			p = new Person(id,name,lastName,fullName,gender,age,height,country,birthDay,imagePath);
			
			//System.out.println(p.toString());			
			
			
			//To serialize
			
			treeRBName.insert(p);
			treeRBLastName.insert(p);
			treeRBFullName.insert(p);
			treeRBId.insert(p);
			
			
		}
		
		
	}
	
	public String randomImage(double randomN) {
		
		return "";
		
	}
	
	public String randomValueCSV(String relativePath) {
		String randomValue = "";
		File file = new File(relativePath);
		try {
			final RandomAccessFile randomFile = new RandomAccessFile(file,"r");
			final long randomPosition = (long) (Math.random() * randomFile.length()+1);
			randomFile.seek(randomPosition);
			randomFile.readLine();
			randomValue = randomFile.readLine();
			randomFile.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return randomValue;
	}
	
	public Nationality selectNationality(double randomN) {
		
		if(randomN >= 1 && randomN<=32.84383095) {
			return Nationality.USA;
		}
		else if(randomN>32.84383095 && randomN <=53.93509875) {
			return Nationality.BRAZIL;
		}
		else if(randomN>53.93509875 && randomN <= 66.43887565) {
			return Nationality.MEXICO;
		}
		else if(randomN>66.43887565 && randomN <= 71.48774479) {
			return Nationality.COLOMBIA;
		}
		else if( randomN>1.48774479 && randomN <= 75.97230815) {
			return Nationality.ARGENTINA;
		}
		else if(randomN>75.97230815 && randomN <= 79.71728398) {
			return Nationality.CANADA;
		}
		else if(randomN>79.71728398 && randomN <= 83.00650439) {
			return Nationality.PERU;
		}
		else if(randomN>83.00650439 && randomN<=85.82806852) {
			return Nationality.VENEZUELA;
		}
		else if(randomN>85.82806852 && randomN<=87.72487893) {
			return Nationality.CHILE;
		}
		else if(randomN>87.72487893 && randomN<=89.51671068) {
			return Nationality.ECUADOR;
		}
		else if(randomN>89.51671068 && randomN<=91.29438794) {
			return Nationality.GUATEMALA;
		}
		else if(randomN>91.29438794 && randomN<=92.45264673) {
			return Nationality.BOLIVIA;
		}
		else if(randomN>92.45264673 && randomN<=93.57653338) {
			return Nationality.CUBA;
		}
		else if(randomN>93.57653338 && randomN<=94.70795242) {
			return Nationality.HAITI;
		}
		else if(randomN>94.70795242 && randomN<=95.69073983) {
			return Nationality.HONDURAS;
		}
		else if(randomN>95.69073983 && randomN<=96.39846791) {
			return Nationality.PARAGUAY;
		}
		else if(randomN>96.39846791 && randomN<=97.05579114) {
			return Nationality.NICARAGUA;
		}
		else if(randomN>97.05579114 && randomN<=97.69938666) {
			return Nationality.EL_SALVADOR;
		}
		else if(randomN>97.69938666 && randomN<=98.20485194) {
			return Nationality.COSTA_RICA;
		}
		else if(randomN>98.20485194&& randomN<=98.63298591) {
			return Nationality.PANAMA;
		}
		else if(randomN>98.63298591&& randomN<=98.97766774) {
			return Nationality.URUGUAY;
		}
		else if(randomN>98.977667741 && randomN<=99.27149037) {
			return Nationality.JAMAICA;
		}
		else if(randomN>99.27149037 && randomN<=99.55535931) {
			return Nationality.PUERTO_RICO;
		}
		else if(randomN>99.55535931 && randomN<=99.6942239) {
			return Nationality.TRINIDAD_AND_TOBAGO;
		}
		else if(randomN>99.6942239 && randomN<=99.77226975) {
			return Nationality.GUYANA;
		}
		else if(randomN>99.77226975&& randomN<=99.83047847) {
			return Nationality.SURINAME;
		}
		else if(randomN>99.83047847 && randomN<=99.86993322) {
			return Nationality.BELIZE;
		}
		else if(randomN>99.86993322 && randomN<=99.90895297) {
			return Nationality.BAHAMAS;
		}
		else if(randomN>99.90895297 && randomN<=99.93746783) {
			return Nationality.BARBADOS;
		}
		else if(randomN>99.93746783 && randomN<=99.95568827) {
			return Nationality.SAINT_LUCIA;
		}
		else if(randomN>99.95568827 && randomN<=99.9668534) {
			return Nationality.GRENADA;
		}
		else if(randomN>99.9668534 && randomN <= 99.97786145) {
			return Nationality.SAINT_VINCENT_AND_THE_GRENADINES;
		}
		else if(randomN>99.97786145 && randomN <= 99.98757848) {
			return Nationality.ANTIGUA_AND_BARBUDA;
		}
		else if(randomN>99.98757848 && randomN <= 99.99472131) {
			return Nationality.DOMINICA;
		}
		else if(randomN>99.99472131 && randomN <= 100) {
			return Nationality.SAINT_KITTS_AND_NEVIS;
		}
		else {
			return Nationality.BRAZIL;
		}
		
	}
	
	public Gender generateGender(double randomN) {
		if(randomN>=1 && randomN<=50) {
			return Gender.WOMAN;
		}
		else {
			return Gender.MAN;
		}
	}
	
	public int generateHeight(int age) {
		
		int height = 0;
		if(age>=1 && age<=2) {
			height = (int)(Math.random()*((91+1)-68)+68);
			return height;
		}
		else if(age>2 && age<=5) {
			height = (int)(Math.random()*((124+1)-92)+92);
			return height;
		}
		else if(age>6 && age<=12) {
			height = (int)(Math.random()*((161+1)-125)+125);
			return height;
		}
		else if(age>12 && age<=18) {
			height =  (int)(Math.random()*((178+1)-162)+162);
			return height;
		}
		else {
			height =  (int)(Math.random()*((200+1)-162)+162);
			return height;
		}
	}
	
	public LocalDate generateBirthDayDate(int age) {
		
		LocalDate startDate = LocalDate.of((currentYear)-age, 1, 1); //start date
	    long start = startDate.toEpochDay();
	    
	    LocalDate endDate = LocalDate.of((currentYear)-age, 12, 31); //end date
	    long end = endDate.toEpochDay();
	    
	    long randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
	    
		return LocalDate.ofEpochDay(randomEpochDay);
	}
	
	public int generateAge(double randomN) {
		
		int age = 0;
		
		if(randomN >= 1 && randomN<=18.62) {
			age = (int)(Math.random()*14)+1;
			return age;
		}
		else if(randomN>18.62 && randomN<=31.74) {
			age = (int)(Math.random()*((24+1)-15)+15);
			return age;
		}
		else if(randomN>31.74 && randomN<=71.03) {
			age = (int)(Math.random()*((54+1)-25)+25);
			return age;
		}
		else if(randomN>71.03 && randomN<=83.97) {
			age = (int)(Math.random()*((64+1)-55)+55);
			return age;
		}
		else if(randomN>83.97 && randomN<=100) {
			age = (int)(Math.random()*((100+1)-65)+65);
			return age;
		}
		else{
			age = (int)(Math.random()*((24+1)-15)+15);
			return age;
		}
	}
	
	public double generateRandomNumberForPercent() {
		return (Math.random()*(100)+1);
	}
	
}