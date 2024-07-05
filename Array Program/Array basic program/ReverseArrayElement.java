//WAJP reverse printing array element
import java.util.*;
class ReverseArrayElement
{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8,9,10};

        int rev[]=new int[a.length];
        int index=0;
		for(int i=a.length-1;i>=0;i--)
		{
            rev[index++]=a[i];
		}
					System.out.println(Arrays.toString(rev));

	}
}