package comparators;

import java.util.Comparator;

import model.Person;

public class CompareByName implements Comparator<Person> {

	@Override
	public int compare(Person arg0, Person arg1) {
		return arg0.getName().compareTo(arg1.getName());
	}

}
