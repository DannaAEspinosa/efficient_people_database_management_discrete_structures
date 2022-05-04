package comparators;

import java.util.Comparator;

import model.Person;

public class CompareById implements Comparator<Person> {

	@Override
	public int compare(Person arg0, Person arg1) {
		return arg0.getId().compareTo(arg1.getId());
	}

}
