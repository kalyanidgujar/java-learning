import java.util.*;
class ArrayOddExample
{
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8};
		//find the count of even elements
		int count=0;
		for(int i:arr)
		{
			if(i%2!=0)
				count++;
		}
		int[] oddNumbers=new int[count];
		//index var to store the element in oddNumbers array
		int index=0;
		//find odd and store in new Array
		for(int i:arr)
		{
			//check if element is odd an store it by incrementing the idex by 1
			if(i%2!=0)
				oddNumbers[index++]=i;
		}
		System.out.println(Arrays.toString(oddNumbers));  
	}
}