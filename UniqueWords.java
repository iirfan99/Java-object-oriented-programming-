package lab9;

public class UniqueWords extends Words{
	String str="";
	String ar[];
	public UniqueWords(String arg) {
		super(arg);
		if (arg == null ) {
			str = "";
		}else {
			ar=arg.split("[\\s\\?!:,]+");
			for(int i=0;i<ar.length;i++)
				if(!str.contains(ar[i]))
					str+=ar[i];
		}
	}
	public void append(String S) {
		ar=S.split("[\\s\\?!:,]+");
		for(int i=0;i<ar.length;i++)
			if(!str.contains(ar[i]))
				str+=ar[i];
	}
	public void append(UniqueWords uwds) {
		ar=uwds.str.split("[\\s\\?!:,]+");
		for(int i=0;i<ar.length;i++)
			if(!str.contains(ar[i]))
				str+=ar[i];
	}
	public void append(Words wds) {
		ar=wds.str.split("[\\s\\?!:,]+");
		for(int i=0;i<ar.length;i++)
			if(!str.contains(ar[i]))
				str+=ar[i];
	}
	public UniqueWords common(UniqueWords uwds) {
		UniqueWords temp=new UniqueWords("");
		ar=uwds.str.split("[\\s\\?!:,]+");
		for(int i=0;i<ar.length;i++)
			if(uwds.str.contains(ar[i]))
				temp.str+=ar[i];
		return temp;
	}
	public UniqueWords common(Words wds) {
		UniqueWords temp=new UniqueWords("");
		ar=wds.str.split("[\\s\\?!:,]+");
		for(int i=0;i<ar.length;i++)
			if(wds.str.contains(ar[i]))
				temp.str+=ar[i];
		return temp;
	}
	public boolean equals(Object ob) {
		return ob instanceof UniqueWords;
	}
}