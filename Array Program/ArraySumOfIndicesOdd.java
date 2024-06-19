//3.WAJP find sum of odd indexes(indices) number in array

import java.util.Scanner;
import java.util.Arrays;
class ArraySumOfIndicesOdd
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size:");
		int size=sc.nextInt();
		System.out.print("Enter array element:");
		int []arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
         
         int sum=0;
		for(int j=0;j<arr.length;j++)
		{
           if(j%2!=0)
           {
           	sum+=arr[j];
           }
		}
		System.out.println("Sum of odd indices ele in array:"+sum);

		
	}
}
