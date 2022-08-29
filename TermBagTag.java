package blueprint;

import java.util.Arrays;
import java.util.List;

public class TermBagTag implements Tags {

	private List<String> tags;
	private static String DELIMITER = "; ";

	@Override
	public void setTag(String str) {
		if (str != null && !str.isBlank() && !str.isEmpty()) {
			this.tags = Arrays.asList(str.split(DELIMITER));
		}
	}

	@Override
	public boolean isMatching(Tags sec) {
		String secondTags = sec.toString();
		List<String> seconds;
		if (secondTags != null && !secondTags.isBlank() && !secondTags.isEmpty()) {
			seconds = Arrays.asList(secondTags.split(DELIMITER));
			for (String s : seconds){
				if(!this.tags.contains(s)){
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for (String t :tags){
			sb.append(t+DELIMITER);
		}
		return sb.toString();
	}
}
