package comparators;

import java.util.Comparator;

import model.Person;

public class CompareByFullName implements Comparator<Person> {

	@Override
	public int compare(Person arg0, Person arg1) {
		return arg0.getFullName().compareTo(arg1.getFullName());
	}

}
