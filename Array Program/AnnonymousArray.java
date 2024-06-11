import java.util.*;
class AnnonymousArray
{
	public static void main(String[] args) {
		int []arr=new int[]{1,2,3,4,5,6,7,8};
		m1(arr);
		m1(new int[]{9,10,11,12});              //annonymous array
	}
	public static void m1(int[]arr)
	{
		for(int i:arr)
		{
			if(i%2==0)
				System.out.println(i+" is even ");
			else 
				System.out.println(i+" is odd");
		}
	}
}
