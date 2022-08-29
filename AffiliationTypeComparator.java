

import java.util.Comparator;

public class AffiliationTypeComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {

		return o1.type.compareTo(o2.type);
	}
}
