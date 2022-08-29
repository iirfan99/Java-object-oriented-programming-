package blueprint;

import java.util.ArrayList;
import java.util.List;

public class SmallStack extends Stock {

	private int maxItemNo;

	private List<Item> items;

	public SmallStack(int maxItemNo) {
		this.maxItemNo = maxItemNo;
		this.items = new ArrayList<Item>();
	}

	@Override
	public boolean addItem(Item it) {
		if(items.size() < maxItemNo){
			items.add(it);
			return true;
		}
		return false;
	}

	@Override
	public int getItemCount() {
		return items.size();
	}

	@Override
	public Item getItem(int index) {
		return items.remove(index);
	}
}

