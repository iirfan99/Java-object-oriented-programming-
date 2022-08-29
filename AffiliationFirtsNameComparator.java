

import java.util.Comparator;

public class AffiliationFirtsNameComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		int typeCompareResult = o1.type.compareTo(o2.type);
		if(typeCompareResult != 0){
			return  typeCompareResult;
		}
		return o1.firstName.compareTo(o2.lastName);
	}
}
