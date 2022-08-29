package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPack {
	static ArrayPack instance= new ArrayPack();
	public static void main(String [] args) {



		Scanner sc= new Scanner(System.in);
		int [] testarray=ReadArray(sc);
		int [] testarray1= {1,3,64,23,3} ;
		int [] testarray2= {2,4,6,23,3,};
		appendArrays(testarray, testarray2);
		showArr(testarray);


		System.out.print("The commomn elemnts in both testarray1 and testarray2 are: "+Arrays.toString(commonElements(testarray1,testarray2))); 


		System.out.println();
		System.out.print("The unique elemnts in both testarray1 and testarray2 are: "); 
		uniqueElemnts(testarray1, testarray2);
		int [] inOutArr={0,12,15,23,22,88,100,120};
		System.out.println("\nbefore reversing");
	       
		print(inOutArr,0);
		reverseMe(inOutArr);
        System.out.println();
        System.out.println("after reversing");
        print(inOutArr,0);
        fillWith(inOutArr,0);
        int oneDim[] = {1, 2, 12, 2, -2, 0, 12,14,23,8, 9, 8,};
        getMinimalElements(oneDim);
		
        int twoDim[][] = {{1, 2, 12, 2}, {-2}, {0, 12,14}, {-23,8, 9, 8,}};
        getMinimals(twoDim);
		
	}
	public static void showArr(int []arr) {
		int LFGT=5; //Limit for greater than
		int LFST=5; //Limit for smaller than
		int what2look4=5; //What to look for
		System.out.println("The maximum value of the array is: "+instance.getMaxele(arr));
		System.out.println("The minmum value of the array is: "+instance.getMinele(arr));
		instance.returnReversed(arr);
		instance.getGreaterThan(arr, LFGT);
		instance.getLessThan(arr, LFST);
		instance.getRange(arr, instance.getMinele(arr),instance.getMaxele(arr));
		System.out.println("Is the element "+what2look4+" an elemnt in the array? "+instance.isAnElement(arr, what2look4));
	}
	
	// scanner
	public static int [] ReadArray(Scanner sc) {
		int [] arr= new int [10];
		for (int k=0; k<arr.length; k++) {
			String token=sc.next();
			try {
				arr[k]=Integer.parseInt(token);
			}catch (Exception ex) {
				k--;
			}
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	public static int [] appendArrays (int [] arr1, int [] arr2) {
		int x=arr1.length, y=arr2.length;
		int [] arr= new int [(y+x)];
		System.arraycopy(arr1, 0, arr, 0, x);
		System.arraycopy(arr2, 0, arr, x, y);
		Arrays.toString(arr);
		return arr;
	}
	public static int[] commonElements(int[] arr1, int[] arr2)
	{
		int howLong = 0;

		for(int x = 0; x < arr1.length; x++)
		{

			boolean wasUsed = false;

			for(int y = 0; y < x; y++)
			{
				if(arr1[y] == arr2[x])
				{
					wasUsed = true;
					break;
				}
			}
			if(instance.isAnElement(arr2, arr1[x]) && !wasUsed)
			{
				howLong++;
			}

		}


		int[] array = new int[howLong];
		int where = 0;


		for(int x = 0; x < arr1.length; x++)
		{

			boolean wasUsed = false;

			for(int y = 0; y < x; y++)
			{
				if(arr1[y] == arr1[x])
				{
					wasUsed = true;
					break;



				}
			}


			if(instance.isAnElement(arr2, arr1[x]) && !wasUsed)

			{

				array[where] = arr1[x];
				where++; 




			}


		}




		return array;

	}
	public static int [] uniqueElemnts(int [] arr, int []arr2) {
		int []array=appendArrays(arr,arr2);
		Arrays.sort(array);
		int size=0;
		for (int x=1; x<array.length-1; x++) {
			if (array[x]!=array[x+1]&&array[x]!=array[x-1]) {
				size++;

			}


		}
		int [] newarr=new int [size+2];
		if (array[0]!=array[1]) {
			newarr[0]=array[0];
		}
		for (int x=1, r=1; x<array.length-1; x++) {
			if (array[x]!=array[x+1]&&array[x]!=array[x-1]) {
				newarr[r]=array[x];
				r++;
			}
		}
		if (array[array.length-1]!=array[array.length-2]) {
			newarr[newarr.length-1]=array[array.length-1];
		}
		System.out.print(Arrays.toString(newarr)+" ");
		return array;
	}	
	public int getMaxele(int []arr) {
		int max=Integer.MAX_VALUE;
		int currele; 
		boolean check=true;  
		for (int x=0; x<arr.length; x++) {
			currele=arr[x];
			if(check) {
				max=currele;
				check= false;
			}
			if (currele>max) max=currele;
		}
		return max;
	}
	public int getMinele(int []arr) {
		int min=Integer.MIN_VALUE;
		int currele;
		boolean check=true; 
		for (int x=0; x<arr.length; x++) {
			currele=arr[x];
			if (check) {
				min=currele;
				check= false;
			}
			if (currele<min) min=currele;
		}
		return min;
	}
	public static int[] getMinimalElements(int [] arr) {
		 int minValue = arr[0]; 
		    for(int i=1;i<arr.length;i++){ 
		      if(arr[i] < minValue){ 
		        minValue = arr[i]; 
		      } 
		    } 
		    System.out.println("\nMin value one dimensional array is : "  + minValue);
			return arr;
		    
		  } 
		
		
	
	public int [] getRange (int [] arr, int lowerlimit, int upperlimit) {
		upperlimit=instance.getMaxele(arr);
		lowerlimit=instance.getMinele(arr);
		int range=upperlimit-lowerlimit;
		System.out.println("The range of the array is: "+range);
		return arr;
	}
	public int [] getGreaterThan(int [] arr, int limit) {
		int size=0;
		for (int x=0; x<arr.length; x++) {
			if (arr[x]>limit) {
				size++;
			}
		}
		int [] newArray=new int [size];
		int currele;
		for (int x=0, y=0; x<arr.length; x++) {
			currele=arr[x];
			if (currele>limit) {
				newArray[y]=currele;
				y++;
			}
		}
		System.out.println("The set of elemnts that are greater than "+limit+" is: "+Arrays.toString(newArray));
		return newArray; 

	}
	public int [] getLessThan(int [] arr, int limit) {
		int size=0;
		for (int x=0; x<arr.length; x++) {
			if (arr[x]<limit) {
				size++;
			}
		}
		int [] newarray= new int[size];
		int currele; 
		for (int x=0, y=0; x<arr.length; x++) {
			currele=arr[x];
			if(currele<limit) {
				newarray[y]=currele;
				y++;
			}
		}
		System.out.println("The set of elemnts that are less than "+limit+" is: "+Arrays.toString(newarray));
		return newarray;
	}
	public boolean isAnElement(int[] arr, int what2look4) {
		int currele;
		for (int x=0; x<arr.length; x++) {
			currele=arr[x];
			if (currele==what2look4) {
				return true;
			}
		}
		return false;
	}
	public static void print(int [] ... arr) {
		for (int[] arrs : arr) {
			appendArrays(arr[0],arr[1]);
			Arrays.sort(arrs);
			int size=0;
			for (int x=1; x<arrs.length-1; x++) {
				if (arrs[x]!=arrs[x+1]&&arrs[x]!=arrs[x-1]) {
					size++;
				}
			}
			int [] newarr=new int [size+2];
			if (arrs[0]!=arrs[1]) {
				newarr[0]=arrs[0];
			}
			for (int x=1, r=1; x<arrs.length-1; x++) {
				if (arrs[x]!=arrs[x+1]&&arrs[x]!=arrs[x-1]) {
					newarr[r]=arrs[x];
					r++;
				}
			}
			if (arrs[arrs.length-1]!=arrs[arrs.length-2]) {

				newarr[newarr.length-1]=arrs[arrs.length-1];
			}
			System.out.print(Arrays.toString(newarr)+" ");
		}	

	}
	
	
	// return an array with elements in reversed order
	public static int[] returnReversed(int[] arr) {
		 for(int i=0; i<arr.length/2; i++){
	            int temp = arr[i];
	            arr[i] = arr[arr.length -i -1];
	            arr[arr.length -i -1] = temp;
	        }
	 
	        System.out.println("Array after reverse: " + Arrays.toString(arr) );
			return arr;
	    }
	
	public static void fillWith(int[] inOutArr, int fillValue) {
		 
        if (fillValue<inOutArr.length)
        {
        	System.out.println("\nbefore fillWith ");
            System.out.print(inOutArr[fillValue]+" ");
            fillValue++;
            print(inOutArr,fillValue);
        }
    
        
       // fillArray
        Arrays.fill(inOutArr,3);
        System.out.println("\nafter  fillWith ");
        for(int i=0;i<inOutArr.length;i++){
         System.out.print(inOutArr[i]+" ");
        }
      

	}




public static void reverseMe(int[] inOutArr) {
	 for(int i=0; i<inOutArr.length/2; i++){
            int temp = inOutArr[i];
            inOutArr[i] = inOutArr[inOutArr.length -i -1];
            inOutArr[inOutArr.length -i -1] = temp;
        }
 
       
	
    }
 //method to print array
public static void print(int[] inOutArr,int a)
{
    if (a<inOutArr.length)
    {
        System.out.print(inOutArr[a]+" ");
        a++;
        print(inOutArr,a);
    }
}



	public static int[] getMinimals (int [][] arr) {
		int minValue = arr[0][0];
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                if (arr[j][i] < minValue ) {
                    minValue = arr[j][i];
                }
            }
        }
       System.out.println("Minimum number of the two dimensional array is : " + minValue);
	return null;
    }
		
		
	


}



