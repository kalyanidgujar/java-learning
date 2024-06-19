/*class Kartik
{
	public static void main(String[] args) {
		String name[]={"Kalyani","Prajakta","Tanisha","Komal","Vrutika"};
		System.out.println(name.length);                  //5
		System.out.println(name[4]);                    //Vrutika
 
        for(int i=0;i<name.length;i++)
        {
        	System.out.print(name[i]+" ");  
                                                        //Kalyani Prajakta Tanisha Komal Vrutika
        }

	}
}*/


/*class ArrayExample
{
	public static void main(String[] args) {
		//find even odd ele in arr
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		System.out.println("length:"+arr.length);

		System.out.println("Even number:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				System.out.println("Even Number:"+arr[i]);
			else 
				System.out.println("Odd Number:"+arr[i]);
		}
	}
}*/


/*class ArrayExample
{
	public static void main(String[] args) {
		//reverse number
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		System.out.println(arr.length);    //10

		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}


	}
}*/


/*class ArrayExample
{
	public static void main(String[] args) {
		//reverse String
		String str[]={"Kalyani","Prajakta","Tanisha","Komal","Vrutika"};
        
        for(int i=str.length-1;i>=0;i--)
        {
        	System.out.print(str[i]+" ");
        }

		
	}
}*/

/*import java.util.*;
class ArrayExample
{
	public static void main(String[] args) {
		//find an ele an arr
		int arr[]={1,9,7,4,8};

		int findElement=7;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==findElement)
				System.out.print(findElement+" Element found at index "+i);
		}

		
	}
}*/

/*import java.util.Arrays;
class ArrayExample
{
	public static void main(String[] args) {
		
		int[][]a={{1,2},{5,4}};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			 sum+=a[i][j];
		}
		System.out.println("Sum of an array element:"+sum);   //12
	}
}


*/

/*import java.util.Arrays;
import java.util.Scanner;
class ArrayExample
{
	public static void main(String[] args) {
		
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter array1 size1:");
         int size1=sc.nextInt();
         int[]a1=new int[size1];
         System.out.print("Enter array1 element:");
         for(int i=0;i<a1.length;i++)
         {
         	a1[i]=sc.nextInt();
         }

         System.out.println("Enter array2 size2:");
         int size2=sc.nextInt();
         int[]a2=new int[size2];

         System.out.print("Enter array2 element:");
         for(int j=0;j<a2.length;j++)
         {
         	a2[j]=sc.nextInt();
         }

           System.out.println(Arrays.toString(a1));
           System.out.println(Arrays.toString(a2));
	}
}*/



//WAJP to display element of 2D Array dynamically
/*import java.util.Arrays;
import java.util.Scanner;
class ArrayExample
{
	public static void main(String[] args) {
		
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter a number of rows:");
         int rows=sc.nextInt();
         System.out.print("Enter a number of cols");
         int cols=sc.nextInt();
         int arr[][]=new int[rows][cols];
         System.out.print("enter array element:");

         for(int i=0;i<rows;i++)
         {
         	for(int j=0;j<cols;j++)
         	{
         		arr[i][j]=sc.nextInt()
         	}
         }
          for(int i=0;i<rows;i++)
         {
         	for(int j=0;j<cols;j++)
         	{
         		System.out.print(arr[i][j]+" "); 
            }
          System.out.println();

         }
         
         
	}*/




//WAJP  find count of positive & negative elements
	/*import java.util.Arrays;
	class ArrayExample
	{
		public static void main(String[] args) {
			int[]a={1,-2,3,4,-7,3,-8,9,-11,10,0,22};
			int positiveCount=0;
			int negativeCount=0;

			for(int i=0;i<a.length;i++)
			{
				if(a[i]<0)
					negativeCount++;
				if(a[i]>0)
					positiveCount++;

			}
			System.out.println(Arrays.toString(a));
			System.out.println("Positive Count:"+positiveCount);
			System.out.println("Negative Count:"+negativeCount);
		}
	}*/

// 	[1, -2, 3, 4, -7, 3, -8, 9, -11, 10, 0, 22]
// Positive Count:7
// Negative Count:4


//	WAJP even odd arr in two different array

import java.util.Arrays;
class ArrayExample
{
	public static void main(String[] args) {
		int []a={1,2,3,4,5,6,7,8,9,10,11};
		
		int evenCount=0;
		int oddCount=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evenCount++;     //5

			}
			else 
			{
				oddCount++;      //6
			}

		}
		int evenArray[]=new int[evenCount];
		int oddArray[]=new int[oddCount];
		int index=0;
		for(int i=0;i<evenCount;i++)
		{
			if(i%2==0)
				evenArray[index++]=i;
			System.out.println("Even Array:"+evenArray[i]);

		}
		int index1=0;
		for(int i=0;i<oddCount;i++)
		{
			if(i%2!=0)
				evenArray[index1++]=i;
		    System.out.println("Odd Array:"+oddArray[i]);

			}

		// System.out.println("Even Array:"+evenArray);
		// System.out.println("Odd Array:"+oddArray);


		
	}
}
















