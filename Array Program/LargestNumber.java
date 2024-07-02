//WAJP to find largest element in an array
import java.util.*;
class LargestNumber
{
	public static void main(String[] args) {
		int a[]={12,56,23,11,30};
		int large=a[0];

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large)
				large=a[i];
		}
		System.out.println(large);       //56

	}
}