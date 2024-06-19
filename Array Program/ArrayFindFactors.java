//1.WAJP to find the factors of a number and store all this factors in an array


import java.util.Arrays;
class ArrayFindFactors
{
	static int[]factorArray;
	static int factorCount=0;
	public static void main(String[] args) {
         int num=12;
		//find factor
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				factorCount++;
			}
		}

		factorArray=new int[factorCount];
		int itt1=0;
		for(int j=1;j<=num;j++)
		{
			if(num%j==0)
			 factorArray[itt1++]=j;
		}
		System.out.println(Arrays.toString(factorArray));
	}
}

//2.WAJP to fetch all the factors in an array

//3.find sum of all elements at even indexex 
//4.WAJP find sum of odd indexes(indices)
//5.WAJP to store first 10th prime numbers in a new array
//6.WAJP to store the fibonacco series of any terms in an array



























/*import java.util.Scanner;
import java.util.Arrays;
class ArrayFindFactors
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]a={1,2,3,4,5,6,7,8,9,10};

		System.out.print("Enter a number:");
		int num=sc.nextInt();
		System.out.println(Arrays.toString(a));

         int factorCount=0;
		for(int i=0=i<a.length;i++)
		{
			for(int j=1;j<=num;j++)
			{
				if(a[i]%num)
				{
                  factorCount++;
				}
				
			}

		}
	}
}*/




