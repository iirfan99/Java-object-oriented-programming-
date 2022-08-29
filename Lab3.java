package lab3;

public class Lab3 {


	public static double PIUsingWallis (int n) {
		double piApproximation = 1;
		// we are going to  multiplying  it 
		for(double i=1 ; i<=n; i+= 1.0)
		{
			piApproximation*=(2*i)*(2*i)/(2*i -1) / (2*i + 1 );

		}

		return piApproximation*2;
         //because piApproximation is PI /2
	}



	public static double PIUsingLeibniz (int n) {
		double pi = 1;

		for (int i = 3; i < n; i += 4) {
			pi = pi - (1 / (double) i) + (1 / (double) (i + 2));
		}
		return pi * 4;
	}

	public static int [] concatArrs(int [] data1, int data2[]) {
		  int[]a = {1,2,3,4,5};
	      int[]b = {6,7,8,9,11};
	      int[]c = new int[a.length+b.length];
	      int count = 0;

	      for(int i = 0; i<a.length; i++) {
	         c[i] = a[i];
	         count++;
	      }

	      for(int j = 0;j<b.length;j++) {
	         c[count++] = b[j];
	      }

	      for(int i = 0;i<c.length;i++)
	       
	    	  System.out.print(c[i]+" ");
		return c;
	}
 

	public static void main(String[] args) {

		double productPI =PIUsingWallis(10000000);
		System.out.println("pi ~= " + productPI);

		double pi = PIUsingLeibniz(10000000);
		System.out.println("pi ~= " +pi);
		
		concatArrs(null, null);
	}

}