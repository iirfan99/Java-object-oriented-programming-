package lab8;


import lab7.Item;

import lab7.ProductType;

public class Bag {
	
	
	private String nameType = "Bag";
	protected Item[] items;
	protected int capacity;
	
	
	
	public Bag(int bagCapacity) {
		// Set bag capacity
		capacity = verifyCapacity(bagCapacity);
		// Set item array length to capacity
		items = new Item[capacity];
	}
	
	public void removeAllItems() { 
		for (int i = 0; i < items.length; i++) {
			items[i] = null;
		}
	}
	
	public boolean putIn(Item item) {
		// Check for available space
		if (capacity - getUsedCapacity() >= item.getQuantity()) {
			for (int i = 0; i < items.length; i++) {
				// Find first empty slot
				if (items[i] == null) {
					items[i] = item;
					return true;
				}
			}
		}
		return false;
	}

	public Boolean remove(ProductType product) {
		boolean removedSomething = false;
		for (int i = 0; i < items.length; i++) {
			// Search for same type, check for null FIRST
			if (items[i] != null && items[i].getType() == product) {
				// Remove it
				items[i] = null;
				removedSomething = true;
			}
		}
	return removedSomething;
	}
	
	public boolean remove(ProductType product, int n) {
		boolean reducedSomething = false;
		for (int i = 0; i < items.length; i++) {
			// Search for type, always check null before
			if (items[i] != null && items[i].getType() == product) {
				// Remove item if n equals or exceeds quantity
				if (items[i].getQuantity() == n || items[i].getQuantity() < n) {
					items[i] = null;
				} else {
					items[i].remove(n);
				}
				reducedSomething = true;
			}
		}
		return reducedSomething;
	}
	
	public String toString() {
		String str = "[ " + nameType + " - Capacity: " + getUsedCapacity() + "/" + capacity + " ] \n";
		int count = 0;
		for (int i = 0; i < items.length; i++) {
			Item item = items[i];
			if (item != null) {
				count++;
				str += "[" + count + "] [" + item.getType() + "" + " \tx " + item.getQuantity() + "]\n";
			}
		}
		if (count == 0) {
			str += "[- Empty -]\n";
		}
		return str;
	}
	
	public boolean equals(Object other) {
		// same type check
		if (other instanceof Bag) {
			return true;
		} else {
			return false;
		}
	}
	
	
		
	protected int verifyCapacity(int c) {
		if (c < 0) {
			return 0;
		} else {
			return c;
		}
	}
	
	protected int getUsedCapacity() {
		int c = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null) {
				c += items[i].getQuantity();
			}
		}
		return c;
	}

}