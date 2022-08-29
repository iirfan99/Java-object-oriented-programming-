package lab7;


public enum ProductType {
	
	BREAD (3.5 ,3.5, 'g'), MILK(2.2 , 2.2,'l'), TEA(15.0 , 15.0,'g'), BUTTER(7.5 , 7.5 ,'g'), OTHER(0.0 , 0.0,'g');
	
	private double unitPrice;
	private double unitWeight;
private char fgg;
	public static ProductType fromString(String s) {
		s=s.toLowerCase().trim();
		switch(s) {
		case "bread": return BREAD;
		case "milk": return MILK;
		case "tea": return TEA;
		case "butter": return BUTTER;
		default: return OTHER;
		}
	}
	private ProductType(double Weight, double price, char g) {
		unitPrice=price;
		unitWeight=Weight;
		fgg =g;
	}

	public double getPrice() {
		return unitPrice;
	}
	public double getWeight() {
		return unitWeight;
	}
	public char fgg() {
		return fgg;
	}
	public String show() {
		String s=this+ " ["+unitPrice+"]";
		return s.toLowerCase();
	}
	public static void testMe() {
		ProductType p1=ProductType.BREAD;
		System.out.println(p1);
		p1=ProductType.fromString("tea");
		System.out.println(p1);
		for (ProductType p: ProductType.values()) {
			System.out.println(p.show());
		}
	}

}

