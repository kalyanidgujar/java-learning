//WAJP to find smallest element in an array
import java.util.*;
class SmallestNumber
{
	public static void main(String[] args) {
		int a[]={12,56,23,11,30};
		int small=a[0];

		for(int i=0;i<a.length;i++)
		{
			if(a[i]<small)
				small=a[i];
		}
		System.out.println(small);

	}
}