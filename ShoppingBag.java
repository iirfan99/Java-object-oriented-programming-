package lab8;


import java.util.Arrays;

public class ShoppingBag extends Bag{
		public boolean robust;
		
		public ShoppingBag(boolean robust) {
			super(30);
			this.robust = robust;
		}
		
		public double getTotalWeight() {
			double weight = 0;
			for(int i = 0; i < capacity; i++) {
				if(items[i] != null) {
					weight += items[i].getTotalWeight();
				}
			}
			return weight;
		}
		
		public String toString() {
				String info;
				if(robust == true) {
					info = "Extra robust handbag contains: ";
				}
				else {
					info = "Non extra robust quality handbag contains: ";
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
			if (obj instanceof ShoppingBag) {
				ShoppingBag bag = (ShoppingBag) obj;
				if (this.capacity == bag.capacity && getUsedCapacity() == getUsedCapacity()  && this.robust == bag.robust) {
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
