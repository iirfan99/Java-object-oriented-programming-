package lab5;

import java.util.Arrays;
import java.util.Scanner;

public class Lab5 {

	public static int [] toNumberArray (int value) {

		{
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			String str = Integer.toString(num);
			char [] ch = new char [str.length()];

			for(int i=0; i<str.length(); i++)
			{
				ch[i] = str.charAt(i);
			}
			System.out.print("[");

			String separator = "";  // separator here is your ","

			for (char c : ch) {
			    System.out.print( separator + c );
			    separator = ",";
			}
			System.out.print("]");
			return null;
		}


	}

	public static int [] toNumberArray (String value) {

		String testString = "7634";
		char[] stringToCharArray = testString.toCharArray();
		System.out.print("[");

		String separator = "";  // separator here is your ","

		for (char output : stringToCharArray) {
		    System.out.print(separator + output);
		    separator = ",";
		}
		System.out.println("]");
		return null;
	}



public static int calSum(int a1[], int a2[], int n, int m) 
	{ 
		 
		// greater number of element 
		if (n >= m) 
			return addNumberArrays(a1, a2, n, m); 

		else
			return addNumberArrays(a2, a1, m, n); 
	} 
	public static int addNumberArrays(int a1[], int a2[], int n, int m) 
	{ 
		// array to store sum. 
		int[] sum= new int[n]; 

		int i = n - 1, j = m - 1, k = n - 1; 

		int carry = 0, s = 0; 

		
		while (j >= 0)  
		{ 
			// find sum of corresponding element 
			// of both array. 
			s = a1[i] + a2[j] + carry; 

			sum[k] = (s % 10); 

			
			carry = s / 10; 

			k--; 
			i--; 
			j--; 
		} 

		
		while (i >= 0)  
		{ 
			 
			s = a1[i] + carry; 
			sum[k] = (s % 10); 
			carry = s / 10; 

			i--; 
			k--; 
		} 

		int ans = 0; 

		if (carry == 1) 
			ans = 10; 

		for ( i = 0; i <= n - 1; i++) { 
			ans += sum[i]; 
			ans *= 10; 
		} 

		return ans / 10; 
	} 
	

	
	     public static int multiply() {
	    	 
		   String result = "";
		   int[] left_array = {1, 3, -5, 4};
		   int[] right_array = {1, 4, -5, -2};
		   System.out.println("\nArray1: "+Arrays.toString(left_array));  
		   System.out.println("\nArray2: "+Arrays.toString(right_array)); 
	       for (int i = 0; i < left_array.length; i++) {
					int num1 = left_array[i];
					int num2 = right_array[i];
					result += Integer.toString(num1 * num2) + " "; 
						
	       }
	       
			System.out.println("\nResult: "+result);
			return 0;     
		 }	
       
	
      
	
	public static void main(String[] args) {
		System.out.print("Converting  an integer to an array of digits is : ");
		toNumberArray(0);
		System.out.println("\nConverting  a String to an array of digits is : ");
		toNumberArray (null);

		int a1[] = { 1,9 }; 
		
        int a2[] = { 8,2,3 }; 
      
        int n = a1.length; 
        int m = a2.length; 
        

        System.out.println("Add Elements of two Arrays is :  " + "  [ " + calSum(a1, a2, n, m )+ "]"); 
        multiply();
        
        
	}
}