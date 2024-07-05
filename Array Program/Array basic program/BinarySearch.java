package comArrays;

import java.util.Arrays;

public class 
 {

	public static void main(String[] args) {
	    int[]a= {5,4,6,3,7,2,8,1,9,10};
        Arrays.sort(a);                   //sort the arra a
        int target=18;
        
        int index= binarySearch(a,target);
        if(index==-1)
        {
        	System.out.println("Element not found");
        }else {
        	System.out.println("Element found at "+index);
        }
        
       
	}
	private static int binarySearch(int[] a,int target)
	{
		int min=0;
		int max=a.length-1;
		
		while(min<=max)                   //
		{
			int mid=min+(max-min)/2;
			int midEle=a[mid];
			
			if(midEle>target)
				max=mid-1;
			else if(midEle<target)
				min=mid+1;
			else 
			return mid;
		}
		return -1;
	}
	

}
