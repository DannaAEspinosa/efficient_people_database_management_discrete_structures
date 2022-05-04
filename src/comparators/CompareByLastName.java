package comparators;

import java.util.Comparator;

import model.Person;

public class CompareByLastName implements Comparator<Person> {

	@Override
	public int compare(Person arg0, Person arg1) {
		return arg0.getLastName().compareTo(arg1.getLastName());
	}

}
