

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {

		return o1.firstName.compareTo(o2.firstName);
	}
}