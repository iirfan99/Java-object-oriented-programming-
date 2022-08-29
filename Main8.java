package lab8;

import lab7.Item;
import lab7.ProductType;

public class Main8 {
	
	
	public static void main(String args []){
	
		    Item Tea1 = new Item(ProductType.TEA , 20);
			Item Milk1 = new Item(ProductType.MILK , 20);
		    Item Bread3=new Item(ProductType.BREAD,30);
		    Item Butter1=new Item(ProductType.BUTTER);
		    Item Tea2=new Item(ProductType.TEA);
		    Item Butter2=new Item(ProductType.BUTTER);
		    Item Bread2=new Item(ProductType.BREAD,2);
		
		     
		     
		     
		     
		     Bag bag1=new Bag(60);
		     Bag bag2=new Bag(100);
		     System.out.println("*Bag capacity(1) :"+bag1.capacity);
		     System.out.println("*Bag capacity (2)"+bag2.capacity);
		     bag1.putIn(Tea1);
		     bag1.putIn(Bread3);
		     bag2.putIn(Butter1);

		     
		     System.out.println( bag1.toString());
		     System.out.println( bag2.toString());
	    
		     bag1.putIn(Tea1); 
		     bag2.putIn(Tea1);
		     System.out.println(bag1.toString());
		     System.out.println(bag2.toString());
		     
		     bag1.removeAllItems();
		     bag2.removeAllItems();
		     
		     
		      System.out.println(bag1.toString());
		      System.out.println(bag2.toString());
		      
		      bag2.remove(ProductType.BREAD);
		      bag2.putIn(Bread3);
		      bag2.putIn(Milk1);
		      bag1.putIn(Butter1);
		      bag1.putIn(Tea1);
		      bag1.putIn(Milk1);
		      bag1.remove(ProductType.BREAD);
		    
		      bag2.remove(ProductType.BREAD);
		      
		      System.out.println(bag1.toString());
		      System.out.println(bag2.toString());
		      
       
		      bag1.remove(ProductType.BREAD);
		      bag2.remove(ProductType.BREAD);
		    
		      
		      System.out.println(bag1.toString());
		      System.out.println(bag2.toString());
		      
		      System.out.println("Used capacity(1): "+bag1.getUsedCapacity()); 
		      System.out.println("Used capacity(2): "+bag2.getUsedCapacity()); 
		      
		      
		      System.out.println("#TASK 2");
		      
		      
		      HandHoldBag Pbag1=new HandHoldBag(true);
		      HandHoldBag Pbag2=new HandHoldBag(false);
		      Pbag1.putIn(Bread2);
		      Pbag1.putIn(Tea2);
		      Pbag1.putIn(Butter2);
		      Pbag2.putIn(Bread2);
		      
		      System.out.println(Pbag1.toString());
		      System.out.println(Pbag2.toString());
		     
		      ShoppingBag shoppingbag1=new ShoppingBag(true);
		      ShoppingBag shoppingbag2=new ShoppingBag(false); 
		      System.out.println("#Task 3");
		      shoppingbag1.putIn(Butter2);
		      shoppingbag1.putIn(Tea2);
		      shoppingbag2.putIn(Milk1);//20
		      shoppingbag2.putIn(Bread3);//30
		      
		      System.out.println(shoppingbag1.toString());
		      System.out.println(shoppingbag2.toString());
		      
		      

	} 

}
