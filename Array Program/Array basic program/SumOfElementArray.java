//WAJP to print sum of elelmnet in an array
import java.util.*;
class SumOfElementArray
{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8};

		int sum=0;
		for(int i:a)
		{
			sum+=i;

		}
		System.out.println(sum);
	}
}