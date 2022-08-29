package blueprint;

public class Item {

	private String content;

	private TermBagTag bTag;

	private HierarchyTag hTag;


	public Item(String cont, TermBagTag tb, HierarchyTag hb) {

		this.content = cont;
		this.bTag = tb;
		this.hTag = hb;

	}

	public Item(String cont, String tb, String hb) {

		this.content = cont;
		this.bTag = new TermBagTag();
		this.bTag.setTag(tb);
		this.hTag = new HierarchyTag();
		this.hTag.setTag(hb);

	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("Content of item is " + this.content + ". TermBagTags of item are " + this.bTag.toString() + " and HierarchyTags of item are "
						  + hTag.toString());
		return sb.toString();
	}

	public boolean isMatching(Item sec) {
		if(sec == null || (this.bTag.isMatching(sec.bTag) && this.hTag.isMatching(sec.hTag))){
			return true;
		}
		return false;
	}
}
