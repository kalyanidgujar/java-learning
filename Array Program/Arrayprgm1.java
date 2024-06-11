import java.util.Arrays;
import java.util.Scanner;
class Arrayprgm1
{
	int arr[];
	static Scanner sc=new Scanner(System.in);
	public void storeElements(int arr[])
	{
		this.arr=arr;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();

		}
	}
	public void displayElements()
	{
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		System.out.println("Enter array Element:");
		int arr[]=new int[size];
		Arrayprgm1 p1=new Arrayprgm1();
		p1.storeElements(arr);
		p1.displayElements();
	}
}