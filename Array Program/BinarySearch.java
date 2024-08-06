package comArrays;

import java.util.Arrays;

public class BinarySearch
 {

	public static void main(String[] args) {
	    int[]a= {5,4,6,3,7,2,8,1,9,10};
        bubbleSort(a);                              //sort the arra a
        System.out.println(Arrays.toString(a));      //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        int target=6;
        
        int index= binarySearch(a,target);
        if(index==-1)
        {
        	System.out.println("Element not found");      //Element found at 5
        }
        else 
        {
        	System.out.println("Element found at "+index);
        }
        
       
	}
	private static int[] bubbleSort(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	private static int binarySearch(int a[],int target)
	{
		int min=0;
		int max=a.length-1;
		// int mid=0;
		while(min<=max)
		{
		 int  mid=min+(max-min)/2;
		  int midEle=a[mid];
		  if(a[mid]==target)
		  	return mid;
		  else if(a[mid]<target)
		  	min=mid+1;
		  else if(a[mid]>target)
		  	max=mid-1;
		}
		return -1;
	}

}
	


