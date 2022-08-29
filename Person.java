

public class Person {

	protected String firstName = "XX";

	protected String lastName = "XX";

	protected AffiliationType type = AffiliationType.NOT_KNOWN;

	protected int height = -1;

	public Person(String line) {

		String valueArr[] = line.split(" ");
		if (valueArr != null ) {
			if(valueArr.length > 0){
				this.firstName = valueArr[0];
			}
			if(valueArr.length > 1){
				this.lastName = valueArr[1];
			}
			if(valueArr.length > 2){
				this.type = AffiliationType.fromString(valueArr[2]);
			}
			if(valueArr.length > 3){
				try {
					this.height =  Integer.parseInt(valueArr[3]);
				} catch(Exception e) {
					System.out.println("Height could not be parsed: "+valueArr[3] );
				}

			}
		}

	}

	@Override
	public String toString() {

		return "Person{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", type=" + type + ", height=" + height + '}';
	}
}
