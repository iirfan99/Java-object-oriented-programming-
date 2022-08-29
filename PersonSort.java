

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class PersonSort {

	private Vector<Person> allPeople= new Vector<Person>();

	public PersonSort(String fileName) {
		try {
			Scanner sc= new Scanner(new File(fileName));
			while (sc.hasNextLine()) {
				String oneLine=sc.nextLine();
				Person p= new Person(oneLine);
				allPeople.add(p);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("No such file: "+fileName);
			System.exit(1);
		}
	}
	public void showFirstNameSort() {

		Collections.sort(allPeople, new FirstNameComparator());
		showPeople("Showing first name sorted:");
	}
	public void showLastNameSort() {
		Collections.sort(allPeople, new LastNameComparator());
		showPeople("Showing last name sorted:");
	}
	public void showAffialtionFirstNameSort() {
		Collections.sort(allPeople, new AffiliationFirtsNameComparator());
		showPeople("Showing affiliation and first name sorted:");
	}
	public void showAffialtionFirstNameHeightSort() {
		Collections.sort(allPeople, new AffiliationFirstNameHeightComparator());
		showPeople("Showing affiliation,first name and height sorted:");
	}
	protected void showPeople(String message) {
		System.out.println(message);
		for (Person p : allPeople) {
			System.out.println(p);
		}
	}
}
