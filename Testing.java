package lab7;

public class Testing {

	public static void main(String[] args) {
		//Task 1  ProductType.testMe() method should produce the following lines:
	     ProductType.testMe();
				
		
		
		//Task 3.
        //Create an array with 3 references to Item objects.
		//Create an array of 3 Items and fill it with objects created above.
		Item[] itemArray = new Item[3];
		itemArray[0] = new Item(ProductType.BREAD , 200 , "Brown Bread" );
		itemArray[1] = new Item(ProductType.fromString("Tea") , 50 , null) ;
		itemArray[2] = new Item(ProductType.MILK );
		
		Item Bread1 = new Item(ProductType.BREAD , 50);
		Item Bread2 = new Item(ProductType.BREAD , 300);
		Item Bread3 = new Item(ProductType.TEA , 10);
		
		
		
		Bread1.AddItems(5);
		// we are just getting getQuantity value of Bread2
		System.out.println("Bread " + Bread2.getQuantity());
		// we are just getting (itemArray[0].toString() method 
		System.out.println(itemArray[0].toString());
		System.out.println(Bread1.remove(10));
		System.out.println(Bread1.toString() + "qqqq");
		
		System.out.println(Bread1.getTotalPrice());
		System.out.println("totalweihgt"+" "+Bread1.getTotalWeight());
	    System.out.println(Bread3.remove(12));	
	    System.out.println(Bread3.toString());

	    System.out.println("equal"+"  "+Bread3.equals(Bread3));
	    System.out.println("equal"+"  "+Bread3.equals(Bread1));
		}


	}