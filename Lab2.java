package com.Oop;



public class Lab2 {


   static void printMaxValue(int [] arr) {
		int max = arr[0];  
		//Loop through the array  
		for (int i = 0; i < arr.length; i++) {  
			//Compare elements of array with max  
			if(arr[i] > max)  
				max = arr[i];  
		}  
		System.out.println("Largest element present in oneDim array = " + max);  
	}
	static void printMaxValue(int [][] arr) {
		 int maxValue = arr[0][0];
	        for (int j = 0; j <arr.length; j++) {
	            for (int i = 0; i < arr[j].length; i++) {
	                if (arr[j][i] > maxValue) {
	                    maxValue = arr[j][i];
	               
	                }
	           
	            }
	        
	        }
	        System.out.println("Largest element present in twoDim array  =" +maxValue);
	      
	}	

	static void printMostCommonDigit(int[] arr) {
		int count = 1, tempCount;
		int popular = arr[0];
		int temp = 0;
		for (int i = 0; i < (arr.length - 1); i++)
		{
			temp = arr[i];
			tempCount = 0;
			for (int j = 1; j < arr.length; j++)
			{
				if (temp == arr[j])
					tempCount++;
			}
			if (tempCount > count)
			{
				popular = temp;
				count = tempCount;
			}

		}

		System.out.println("Most Common Digit is  =\t"+ popular);
	}
	static void printMostCommonDigit(int[][] arr) {

		int[] digits = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int[] a : arr) {
			for (int num : a) {
				int[] digitCount = calcDigits(num);
				for (int i = 0; i < 10; i++) {
					digits[i] += digitCount[i];
				}
			}
		}
		int resultDigit = -1;
		int resultCount = 0;
		for (int i = 0; i < 10; i++) {
			if (digits[i] > resultCount) {
				resultCount = digits[i];
				resultDigit = i;
			}
		}
		System.out.print("Most Common Digit is  = " );
		System.out.println( resultDigit);
	}

	static int[] calcDigits(int num) {
		int[] result = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int digit;
		while (num > 0) {
			digit = num % 10;
			result[digit]++;
			num /= 10;
		}
		return result;
	}

	
	static void printSorted(int [] arr) {
		int temp = 0;

		for(int i=0; i < arr.length; i++){
			for(int j=1; j < arr.length; j++){
				if(arr[j-1] > arr[j]){
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Sorted oneDim array is = ");
		for( int i=0; i<arr.length; i++ ){

			System.out.print("\t"+arr[i] );
		}


	}
	static void printSorted(int [][] arr) {
		 
		int len = 0;
		for (int[] a : arr) {
			len += a.length;
		}
		int[] newArr = new int[len];
		int i = 0;
		for (int[] a : arr) {
			for (int num : a) {
				newArr[i] = num;
				i++;
			}
		}
		
		System.out.print("\nSorted twoDim array is =");
		quickSort(newArr, 0, newArr.length - 1);
		for (int num : newArr) {
		
			System.out.print ("\t"+ num);
		
		}
	}
	
	static void quickSort(int[] arr, int lo, int hi) {
		if (lo < hi) {
			int pivot = arr[hi];
			int i = lo - 1;
			for (int j = lo; j < hi; j++) {
				if (arr[j] <= pivot) {
					i++;
					if (arr[j] < arr[i]) {
						int h = arr[i];
						arr[i] = arr[j];
						arr[j] = h;
					}
				}
			}
			arr[hi] = arr[i + 1];
			arr[i + 1] = pivot;
			quickSort(arr, lo, i);
			quickSort(arr, i + 2, hi);
		}
	}
	




	public static void main(String[] args) {
		int oneDim[]= {1, 10, 23, 87, 14, 1, 6, 177, 71};
		int twoDim[][] = {{1, 2, 12, 2}, {87}, {7, 12,14}, {1,8, 9, 8,}};
		printMaxValue(oneDim);
		printMaxValue(twoDim);
		printMostCommonDigit(oneDim);
		printMostCommonDigit(twoDim);
		printSorted(oneDim);
		printSorted(twoDim);	
	}

}
