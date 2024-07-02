//WAJP sum of even  odd index number in array
import java.util.*;
class SumEvenOddIndexElement
{
	public static void main(String[] args) {
		int a[]={12,13,14,7,9,2,8};

        int evenSum=0;
        int oddSum=0;
       for(int i=0;i<a.length;i++)
        {
        	if(i%2==0)
        	{
        		evenSum+=a[i];
        	}else 
        	{
              oddSum+=a[i];
        	}

        }

System.out.println("Even Sum:"+evenSum); //43
System.out.println("Odd sum:"+oddSum);   //22
}
}