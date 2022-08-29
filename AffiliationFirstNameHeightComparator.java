

import java.util.Comparator;

public class AffiliationFirstNameHeightComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		int typeCompareResult = o1.type.compareTo(o2.type);
		if(typeCompareResult != 0){
			return typeCompareResult;
		}
		int fistNameCompareResult = o1.firstName.compareTo(o2.firstName);
		if(fistNameCompareResult != 0){
			return fistNameCompareResult;
		}
		return Integer.compare(o1.height,o2.height);
	}
}
