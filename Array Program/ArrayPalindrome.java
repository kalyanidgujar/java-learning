//Write a java program to check palindrom array or not
//steps:1.create an array of char datatype
//2.reverse the array and store it in reversed array
//3.compare both array array.equals()

import java.util.Scanner;
import java.util.Arrays;
class ArrayPalindrome
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an array size:");
		int size=sc.nextInt();
		System.out.println("Enter array element:");
		char []arr=new char[size];

		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next().charAt(0);
		}

		char[]reverseArray=new char[size];

		int temp=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			reverseArray[temp]=arr[i];
			temp++;
		}
		if(Arrays.equals(arr,reverseArray))
		{
			System.out.println("It is Palindrome");
		}
		else 
		{
			System.out.println("Not palindrome");
		}
	}
}