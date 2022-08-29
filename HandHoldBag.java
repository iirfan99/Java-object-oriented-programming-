package lab8;


import java.util.Arrays;

public class HandHoldBag extends Bag {
	private boolean quality;
	
	public HandHoldBag(boolean quality) {
		super(5);
		this.quality = quality;
	}
	
	
	

	
	public String toString() {
		String info;
		if(quality == true) {
			info = "Premium quality handbag contains: ";
		}
		else {
			info = "Non-premium quality handbag contains: ";
		}
		for (int i = 0; i < capacity; i++) {
			if (items[i] != null) {
				info += "\n" + items[i].toString();
				info += "\n";
			}
		}
		return info;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof HandHoldBag) {
			HandHoldBag bag = (HandHoldBag) obj;
			if (this.capacity == bag.capacity && getUsedCapacity() == bag.getUsedCapacity() && this.quality == bag.quality) {
				if(!Arrays.equals(items, bag.items)) {
					return false;
				}
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		return true;
	}
	
	
}
