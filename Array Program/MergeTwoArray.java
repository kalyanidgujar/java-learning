//write a java program to merge two arrays into one single array
import java.util.Scanner;
import java.util.Arrays;
class MergeTwoArray
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array1 size:");
		int size1=sc.nextInt();
		System.out.println("Enter array1 element:");
		int []arr1=new int[size1];

		for(int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}



		System.out.print("Enter array1 size:");
		int size2=sc.nextInt();
		System.out.print("Enter array2 element:");
		int []arr2=new int[size2];
		for(int i=0;i<size2;i++)
		{
			arr2[i]=sc.nextInt();
		}




		int mergedArraySize=size1+size2;
		int[]mergedArray=new int[mergedArraySize];
		for(int i=0;i<size1;i++)
		{
			mergedArray[i]=arr1[i];
		}

		for(int i=0;i<size2;i++)
		{
			mergedArray[size1+i]=arr2[i];
		}
		System.out.println("First Array:"+Arrays.toString(arr1));
		System.out.println("Second Array:"+Arrays.toString(arr2));
	    System.out.println("Merged Array:"+Arrays.toString(mergedArray));




	}
}
