// write a java program to count of digit in an array
//eg. arr-> 1 3 5 7 3 5 7 9
import java.util.Scanner;
import java.util.Arrays;
class ArrayCountElement
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size:");
		int size=sc.nextInt();
		System.out.println("Enter array element:");
		int []arr=new int[size];

		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.print("Enter the num to get count of it:");
		int num=sc.nextInt();

		int count=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==num)
			{
				count++;
			}
		}
		System.out.println("Count of number is:"+count);
	}
}