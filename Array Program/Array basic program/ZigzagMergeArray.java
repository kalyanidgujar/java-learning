//WAJP to print zigzag Array
import java.util.*;
class ZigzagMergeArray
{
	public static void main(String[] args) {
		int[]b={1,2,3};
		int[]a={4,5,6,7,8,9};

		int max=((a.length)>(b.length)?a.length:b.length);
		//create new array

		int c[]=new int[(a.length)+(b.length)];
		int index=0;
		for(int i=0;i<max;i++)
		{
			if(i<b.length)
			{
				c[index++]=b[i];
			}
			if(i<a.length)
			{
				c[index++]=a[i];
			}
		}
		System.out.println(Arrays.toString(c));

	}
}