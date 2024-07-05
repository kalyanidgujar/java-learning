//WAJP to divide array in two parts and reverse the  element
import java.util.*;
class DivideArray_Revrse
{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8,9};

        //divide first half
		int firstHalf[]=new int[a.length/2];
		int index1=0;

		for(int i=0;i<a.length/2;i++)
		{
			firstHalf[index1++]=a[i];
		}
		System.out.println("First Half:"+Arrays.toString(firstHalf));

		//divide second half

        int secondHalf[]=new int[a.length-a.length/2];
		int index2=0;
		
		for(int i=a.length-1-a.length/2;i<a.length;i++)
		{
			secondHalf[index2++]=a[i];
		}
		System.out.println("Second Half:"+Arrays.toString(secondHalf));
		
       //revrese  first half
		int revFirst[]=new int[firstHalf.length];
	    int cnt1=0;


		for(int i=firstHalf.length-1;i>=0;i--)
		{
			revFirst[cnt1++]=firstHalf[i];          //reverse first half
		}

		//reverse seconf half
		int revSecond[]=new int[secondHalf.length];
	    int cnt2=0;


		for(int i=secondHalf.length-1;i>=0;i--)
		{
			revSecond[cnt2++]=secondHalf[i];          //reverse Second half
		}


		// create new arr & merge revFirst and revSecond
         int merge[]=new int[cnt1+cnt2];

         for(int i=0;i<cnt1;i++)
         {
         	merge[i]=revFirst[i];
         }
         for(int i=0;i<cnt2;i++)
         {
         	merge[cnt1+i]=revSecond[i];
         }
         System.out.println("Merge:"+Arrays.toString(merge));


	}
} 