package lab9;

public class Words {

	// instance variable of words 
	String str ;
	private String [] longestString;
	private String [] minStringArrays;

	public Words(String arg) { // if arg == null use ""
		if (arg == null ) {
			// variable is assigned null 
			str = "";

		}else {
			str =  arg;
		}
	}
	public boolean equals(Object ob) { // return true only of ob is of the type Words and both objects contain the same SET of words
		if(ob instanceof Words) {
			
			return true;

		}else {
			 
			return false ;
	
		}
	}
	@Override
	public String toString() { // return the number of words and string
		//if the string is empty 
		if(str == null || str.isEmpty()) {
			return "Number of words : 0 \nString : " + str;
		}else {
			String [] words = str.split("\\s+");
			return "Number of words : " + words.length +   "\nString :" + str ;

		}
	}
	public void clear() { // sets internal string to ""
		str = "";		 
	}
	public void append(String s) { // append a string to the existing one
		str+=s;
	}
	public void append(Words wrd) { // append a string from wrd
		str+=wrd;
	
	}
	 public String maxLenWords(String[] arr) {
	      int maxLength = 0;
	      String longestString = null;
	      for (String s : arr) {
	          if (s.length() > maxLength) {
	              maxLength = s.length();
	              longestString = s;
	          }
	      }
	      return longestString;
	  }
	
	 public String minLenWords(String[] arr) {
	     //Keep track of the shortest word by index and length
	        int index = 0, minLength = arr[0].length();
	        for (int i = 1; i < arr.length; i++){
	            //if the next string is smaller in length then we save that index and length in our variables
	            if(arr[i].length() < minLength){
	                index = i;
	                minLength = arr[i].length();  
	            }           
	        }
	        //returns the smallest word
	        return arr[index];
	    }
	
	
	
//	public String[] maxLenWords(String arr []) { // returns an array of words with maximal length
//
//		longestStringArrays = null;
//		int index = 0 ;
//		int maxLength = 0;
//		String longestString = null;
//		for(String s  : arr) {
//			if(s.length()> maxLength) {
//				maxLength = s.length();
//				longestString = s;
//				longestStringArrays[index]= longestString;
//				index++;
//			}
//		}
//
//
//
//
//		return longestStringArrays;
//	}
//	public String[] minLenWords(String arr []) { // returns an array with words with minimal lengh
//		minStringArrays = null ;
//		int index =0;
//		int minLength = 0;
//		String minString = null;
//		for(String s  : arr) {
//			if(s.length()  < minLength) {
//				minLength = s.length();
//				minString = s;
//				minStringArrays[index]= minString;
//				index++;
//
//			}
//
//		}
//
//
//		return minStringArrays;
//
//
//	}
}