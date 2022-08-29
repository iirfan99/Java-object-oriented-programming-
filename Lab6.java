package lab6;

public class Lab6 {

	public static int factrorialRecursion (int num ) {
		if(num >=1)
			return num*factrorialRecursion(num-1);
		else
			return 1;
	}
	public static int factorialIterative (int num ) {
		int result=1,i=1;
		while(i<=num){
			result=result*i;
			i++;
		}

		return result;
	}
	public static int gcdRecursive(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcdRecursive(b, a % b);
	}
	public static int gcdIterative(int a, int b) {
		int result=1;
		if (b==0)
			return a;
		while (b!=0) {
			result=b;
			b=a%b;
			a=result;
		}
		return a;
	}
	public static int numberIterative(int []arr) {
		int elemn=0;
		int currele;
		if (arr.length==0) {
			return elemn;
		}
		for (int x=0; x<arr.length; x++) {
			currele=arr[x];
			if (currele>0)
				elemn=elemn+1;
		}
		return elemn;
	}
	public static int sumIterative(int [] arr) {
		int sum=0;
		int currele;
		if (arr.length==0) {
			return sum;
		}
		for (int x=0; x<arr.length; x++) {
			currele=arr[x];
			if (currele>0)
				sum=sum+currele;
		}
		return sum;
	}
	public static void sumRecursive(int [] arr, int y, int sum) {
		if (y<0) {
			System.out.println(sum);
			return;
		}
		if((arr[y])>0) {
			sum+=(arr[y]);
		}
		sumRecursive(arr, y-1, sum);
	}
	public static void numberRecursive(int [] arr, int y, int elemno) {
		if (y<0) {
			System.out.print(elemno);
			return;
		}if ((arr[y])>0) {
			elemno++;
		}
		numberRecursive(arr,y-1, elemno);
	} 



	public static void main(String[] args) {
		int n=5;
		System.out.println("The factorial of the number "+n+" using recursive method is: "+factrorialRecursion(n));
		System.out.println("The factorial of the number "+n+" using iterative method is: "+factorialIterative(n));
		System.out.println("The GCD of 2 numbers using recursive method is: "+gcdRecursive(40,50));
		System.out.println("The GCD of 2 numbers using iterative method is: "+gcdIterative(40,50));
		int [] arr= {1,-1,2,-2,0,1,2};
		int y=0;
		System.out.print("The number of the elemnts "+ "in the arr array that are greater than 0 "+ "using recursive method is: ");
		numberRecursive(arr, arr.length-1, y);
		System.out.println();
		System.out.println("The number of the elemnts in the arr array that are greater than 0 "+ "using iterative method is: "+numberIterative(arr));
		System.out.println("The total sum of the numbers "+ "in the arr array that are greater than 0 "+ "using iterative method is: "+sumIterative(arr));
		System.out.print("The total sum of the numbers "+ "in the arr array that are greater than 0 "+ "using recursive method is: ");
		sumRecursive(arr, arr.length-1,y);


	}
}
