//WAJP sum of even odd element in an array
import java.util.*;
class SumEvenOddElement
{
	public static void main(String[] args) {
		int a[]={2,11,4,5,6,7,11,3};

        int evenSum=0;
        int oddSum=0;
       for(int i:a)
        {
        	if(i%2==0)
        	{
        		evenSum+=i;
        	}else 
        	{
              oddSum+=i;
        	}

        }

       System.out.println("Even Sum:"+evenSum);//12
       System.out.println("Odd sum:"+oddSum);  //37

    }
}
