//WAJP merge two 1d arry
import java.util.*;
class MergeTwo_OneDArray
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// creating array1
		System.out.print("Enter a size1:");
		int size1=sc.nextInt();
		System.out.print("Enter array1:");
		int arr1[]=new int [size1];
		for(int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}

		//creating array2
		System.out.print("Enter a size2:");
		int size2=sc.nextInt();
		System.out.print("Enter array2:");
		int arr2[]=new int [size2];
		for(int i=0;i<size2;i++)
		{
			arr2[i]=sc.nextInt();
		}


		int mergeSize=size1+size2;
        
        //create new array for merge
        int mergeArray[]=new int [mergeSize];

        for(int i=0;i<size1;i++)
        {
        	mergeArray[i]=arr1[i];
        }
        for(int i=0;i<size2;i++)
        {
        	mergeArray[size1+i]=arr2[i];
        }

        System.out.println("Array1:"+Arrays.toString(arr1));
  		System.out.println("Array2:"+Arrays.toString(arr2));
        System.out.println("Merge Array:"+Arrays.toString(mergeArray));

	}
}